/*
	A java program that represents a client, with his personal information and an array list about his rents.
*/
import java.util.ArrayList;
public class Client {
	private String nif;
	private String nom;
	private String telefon;
	private ArrayList<Lloguer> lloguers;
	private static final double EUROS_PER_UNITAT_DE_COST = 30;
	
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
			total += lloguer.unitatDeCostPerTarifa() * EUROS_PER_UNITAT_DE_COST;
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
		    resultat += "\t" + lloguer.getVehicle().getMarca() + " " + lloguer.getVehicle().getModel() + ": " + (lloguer.unitatDeCostPerTarifa() * EUROS_PER_UNITAT_DE_COST) + "€" + "\n";
		}
		return resultat;
	}
	private String composaPeu() {
		String resultat = "Import a pagar: " + importTotal() + "€\n" + "Punts guanyats: " + bonificacionsTotal() + "\n";
		return resultat;
	}
	
	public String informeHTML() {
		return composaCapsaleraHTML() + composaDetallHTML() + composaPeuHTML();
	}
	private String composaCapsaleraHTML() {
		String resultat = "<p>Informe de lloguers del client <em>" + getNom() + "</em> (<strong>" + getNif() + "</strong>)</p>\n";
		return resultat;
	}
	private String composaDetallHTML() {
		String resultat = "<table>\n  <tr>\n    <td><strong>Marca</strong></td>\n    <td><strong>Model</strong></td>\n    <td><strong>Import</strong></td>\n  </tr>\n";
		for (Lloguer lloguer: lloguers) {
			resultat += "  <tr><td>" + lloguer.getVehicle().getMarca() + "</td><td>" + lloguer.getVehicle().getModel() +"</td><td>" + (lloguer.unitatDeCostPerTarifa() * EUROS_PER_UNITAT_DE_COST) + "€</td></tr>\n";
		}
		resultat += "</table>\n";
		return resultat;
	}
	private String composaPeuHTML() {
		String resultat = "<p>Import a pagar: <em>" + importTotal() + "€</em></p>\n<p>Punts guanyats: <em>" + bonificacionsTotal() + "</em></p>\n";
		return resultat;
	}
}
