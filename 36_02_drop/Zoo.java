/*
	A java class that works as a connection between a sqlite3 database and java classes. This time, we implement two procedures that create and eliminate the table named "CATEGORIES"
*/
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
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
			st = conn.createStatement();
			st.executeUpdate(sql);
		} finally {
			if (st != null) {
				st.close();
			}
		}
	}
}
