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
		return composaCapsalera() + composaDetall() + composaPeu();
	}
	private double importTotal() {
		double total = 0;
		for (Lloguer lloguer: lloguers) {
			total += lloguer.quantitat() * 30;
		}
		return total;
	}
	private int bonificacionsTotal() {
		int bonificacions = 0;
		for (Lloguer lloguer: lloguers) {
			bonificacions += lloguer.bonificacions();
		}
		return bonificacions;
	}
	private String composaCapsalera() {
		String resultat = "Informe de lloguers del client " + getNom() + " (" + getNif() + ")\n";
		return resultat;
	}
	private String composaDetall() {
		String resultat = "";
		for (Lloguer lloguer: lloguers) {
		    resultat += "\t" + lloguer.getVehicle().getMarca() + " " + lloguer.getVehicle().getModel() + ": " + (lloguer.quantitat() * 30) + "€" + "\n";
		}
		return resultat;
	}
	private String composaPeu() {
		String resultat = "";
		resultat += "Import a pagar: " + importTotal() + "€\n" + "Punts guanyats: " + bonificacionsTotal() + "\n";
		return resultat;
	}
}
