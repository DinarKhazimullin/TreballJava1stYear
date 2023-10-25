/*
	A java program that stores a car. It stores its model, its brand and its caregory.
*/
public class Vehicle {
	public static int BASIC = 1;
	public static int GENERAL = 2;
	public static int LUXE = 3;
	private String model;
	private String marca;
	private int categoria;
	public Vehicle(String marca, String model, int categoria) {
		this.model = model;
		this.marca = marca;
		this.categoria = categoria;
	}
	public String getModel() { return this.model; }
	public void setModel(String model) { this.model = model; }
	public String getMarca() { return this.marca; }
	public void setMarca(String marca) { this.marca = marca; }
	public int getCategoria() { return this.categoria; }
	public void setCategoria(int categoria) { this.categoria = categoria; }
}
