/*
	A java program that represents a client, with his personal information and an array list about his rents.
*/
import java.util.ArrayList;
public class Client {
	private String nif;
	private String nom;
	private String telefon;
	private ArrayList<Lloguer> lloguers;
	
	public Client(String nif, String nom, String telefon) {
		this.nif = nif;
		this.nom = nom;
		this.telefon = telefon;
		this.lloguers = new ArrayList<Lloguer>();
	}
	
	public String getNif() { return nif; }
	public String getNom() { return nom; }
	public String getTelefon() { return telefon; }
	public ArrayList<Lloguer> getLloguers() { return lloguers; }
	
	public void setNif(String nif) { this.nif = nif; }
	public void setNom(String nom) { this.nom = nom; }
	public void setTelefon(String telefon) { this.telefon = telefon; }
	
	public String informe() {
		return null;
	}
}
