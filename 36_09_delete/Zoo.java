/*
	A java class that works as a connection between a sqlite3 database and java classes. This time, we implement the delete procedures.
*/
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;
public class Zoo {
	private static final String NOM_BASE_DE_DADES = "animals.bd";
	private static final String CADENA_DE_CONNEXIO = "jdbc:sqlite:" + NOM_BASE_DE_DADES;
	private Connection conn = null;
	public void connecta() throws SQLException {
		if (conn != null) return;
			conn = DriverManager.getConnection(CADENA_DE_CONNEXIO);
	}
	public void desconnecta() throws SQLException {
		if (conn == null) return;
		conn.close();
		conn = null;
	}
	public void creaTaulaCategories() throws SQLException {
		String sql = "CREATE TABLE  CATEGORIES (" +
                 "       id        INTEGER PRIMARY KEY AUTOINCREMENT," +
                 "       nom       VARCHAR(40))";
		Statement st = null;
		try {
			eliminaTaulaCategories();
			st = conn.createStatement();
			st.executeUpdate(sql);
		} finally {
			if (st != null) {
				st.close();
			}
		}
	}
	public void eliminaTaulaCategories() throws SQLException {
		String sql = "DROP TABLE IF EXISTS CATEGORIES;";
		Statement st = null;
		try {
			eliminaTaulaAnimals();
			st = conn.createStatement();
			st.executeUpdate(sql);
		} finally {
			if (st != null) {
				st.close();
			}
		}
	}
	public void afegeixCategoria(Categoria categoria) throws SQLException {
		String sql = String.format("INSERT INTO CATEGORIES (nom) VALUES ('%s')", categoria.getNom());
		Statement st = null;
		try {
			st = conn.createStatement();
			st.executeUpdate(sql);
			Categoria categoria1 = obteCategoriaPerNom(categoria.getNom());
			categoria.setId(categoria1.getId());
		} finally {
			if (st != null) {
				st.close();
			}
		}
	}
	public List<Categoria> recuperaCategories() throws SQLException {
		String sql = "SELECT * FROM CATEGORIES ORDER BY nom";
		Statement st = null;
		try {
			st = conn.createStatement();
			ResultSet rs = st.executeQuery(sql);
			List<Categoria> categories = new LinkedList<>();
			while (rs.next()) {
				int bdId = rs.getInt("id");
				String nom = rs.getString("nom");
				Categoria categoria = new Categoria(bdId, nom);
				categories.add(categoria);
			}
			rs.close();
			return categories;
		} finally {
			if (st != null) {
				st.close();
			}
		}
	}
	public Categoria obteCategoriaPerNom(String nom) throws SQLException {
		String sql = String.format("SELECT id FROM CATEGORIES WHERE nom = '%s'ORDER BY id LIMIT 1", nom);
		Statement st = null;
		try {
			st = conn.createStatement();
			ResultSet rs = st.executeQuery(sql);
			if (rs.next()) {
				int bdId = rs.getInt("id");
				Categoria categoria = new Categoria(bdId, nom);
				rs.close();
				return categoria;
			} else {
				return null;
			}
		} finally {
			if (st != null) {
				st.close();
			}
		}
	}
	public void creaTaulaAnimals() throws SQLException {
		String sql = "CREATE TABLE ANIMALS (" +
						"id        INTEGER PRIMARY KEY AUTOINCREMENT," +
						"nom       TEXT," +
						"categoria INTEGER," +
						"FOREIGN KEY(categoria) REFERENCES CATEGORIES(id)" +
						")";
		Statement st = null;
		try {
			eliminaTaulaAnimals();
			creaTaulaCategories();
			st = conn.createStatement();
			st.executeUpdate(sql);
		} finally {
			if (st != null) {
				st.close();		
			}
		}
	}
	public void eliminaTaulaAnimals() throws SQLException {
		String sql = "DROP TABLE IF EXISTS ANIMALS;";
		Statement st = null;
		try {
			st = conn.createStatement();
			st.executeUpdate(sql);
		} finally {
			if (st != null) {
				st.close();
			}
		}
	}
	/* retorna el nom de les taules definides a la bd */
	public String getNomTaules() throws SQLException {
		String sql = "SELECT name FROM sqlite_schema " +
		             "WHERE name NOT LIKE 'sqlite%' " +
		             "ORDER BY name";
		List<String> taules = new ArrayList<>();
		try (Statement st = conn.createStatement()) {
		    ResultSet rs = st.executeQuery(sql);
		    while (rs.next()) { taules.add(rs.getString("name")); }
		    rs.close();
		}
		return taules.size() > 0 ? String.join(", ", taules) : "cap";
	}
	public void afegeixAnimal(Animal animal) throws SQLException {
		if (animal.idIndefinit()) {
			if (obteCategoriaPerNom(animal.getCategoria().getNom()) == null) {
				afegeixCategoria(animal.getCategoria());
			}
			Categoria categoria1 = obteCategoriaPerNom(animal.getCategoria().getNom());
			animal.getCategoria().setId(categoria1.getId());
			String sql = String.format("INSERT INTO ANIMALS (nom, categoria) VALUES ('%s','%d')", animal.getNom(), animal.getCategoria().getId());
			Statement st = null;
			try {
				st = conn.createStatement();
				st.executeUpdate(sql);
				ResultSet rs = st.getGeneratedKeys();
				if (rs.next()) {
					int id = rs.getInt(1);
					animal.setId(id);
				}
			} finally {
				if (st != null) {
					st.close();
				}
			}
		}
	}
	public List<Animal> recuperaAnimals() throws SQLException {
		String sql = "SELECT ANIMALS.id as id_animal, " +
						"ANIMALS.nom as nom_animal, " +
						"CATEGORIES.id as id_categoria, " +
						"CATEGORIES.nom as nom_categoria " +
						"FROM ANIMALS, CATEGORIES " +
						"WHERE ANIMALS.categoria = CATEGORIES.id " +
						"ORDER BY ANIMALS.nom";
		Statement st = null;
		try {
			st = conn.createStatement();
			ResultSet rs = st.executeQuery(sql);
			List<Animal> animals = new LinkedList<>();
			while (rs.next()) {
				int bdId = rs.getInt("id_animal");
				String nom = rs.getString("nom_animal");
				Categoria categoria = obteCategoriaPerNom(rs.getString("nom_categoria"));
				Animal animal = new Animal(bdId, nom, categoria);
				animals.add(animal);
			}
			rs.close();
			return animals;
		} finally {
			if (st != null) {
				st.close();
			}
		}
	}
	public Animal obteAnimalPerNom(String nom) throws SQLException {
		String sql = String.format("SELECT ANIMALS.id as id_animal, CATEGORIES.nom as nom_categoria FROM ANIMALS, CATEGORIES WHERE (ANIMALS.categoria = CATEGORIES.id) and (ANIMALS.nom = '%s') ORDER BY id_animal LIMIT 1", nom);
		Statement st = null;
		try {
			st = conn.createStatement();
			ResultSet rs = st.executeQuery(sql);
			if (rs.next()) {
				int bdId = rs.getInt("id_animal");
				Categoria categoria = obteCategoriaPerNom(rs.getString("nom_categoria"));
				Animal animal = new Animal(bdId, nom, categoria);
				rs.close();
				return animal;
			} else {
				return null;
			}
		} finally {
			if (st != null) {
				st.close();
			}
		}
	}
	public void canviaCategoria(Animal animal, Categoria categoria) throws SQLException {
		if (obteCategoriaPerNom(categoria.getNom()) == null) {
			afegeixCategoria(categoria);
		}
		if (categoria.idIndefinit()) {
			categoria = obteCategoriaPerNom(categoria.getNom());
		}
		if (obteAnimalPerNom(animal.getNom()) == null || animal.idIndefinit()) {
			afegeixAnimal(animal);
		}
		int idNovaCategoria = categoria.getId();
		int idAnimal = animal.getId();
		String sql = String.format("UPDATE ANIMALS " +
                           "SET categoria = %d " +
                           "WHERE id = %d",
                           idNovaCategoria,
                           idAnimal
                           );
		Statement st = null;
		try {
			st = conn.createStatement();
			st.executeUpdate(sql);   
		} finally {
			if (st != null) {
				st.close();
			}
		}
	}
	public void eliminaAnimal(Animal animal) throws SQLException {
		if (animal.idIndefinit()) return;
		String sql = String.format("DELETE FROM ANIMALS WHERE id = %d", animal.getId());
		Statement st = null;
		try {
			st = conn.createStatement();
			st.executeUpdate(sql);
		} finally {
			if (st != null) {
				st.close();
			}
		}
	}
	public void eliminaCategoria(Categoria categoria) throws SQLException {
		if (categoria.idIndefinit()) return;
		String sql = String.format("SELECT * FROM ANIMALS WHERE categoria = %d", categoria.getId());
		Statement st = null;
		String sqlDelete = String.format("DELETE FROM CATEGORIES WHERE id = %d", categoria.getId());
		Statement stDelete = null;
		try {
			st = conn.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				int bdId = rs.getInt("id");
				String bdNom = rs.getString("nom");
				eliminaAnimal(new Animal(bdId, bdNom, categoria));
			}
			rs.close();
			stDelete = conn.createStatement();
			stDelete.executeUpdate(sqlDelete);
		} finally {
			if (st != null) {
				st.close();
			}
		}
	}
}
