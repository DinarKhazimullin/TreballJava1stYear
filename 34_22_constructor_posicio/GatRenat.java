/*
	A java progran in which we use a constructor parameter to make an instance of a cat named Renat, with information about its lives and its position
*/
public class GatRenat {
	private int vides = 7;
	private String posicio = "estirat";
	public GatRenat(int vides, String posicio) {
		setVides(vides);
		setPosicio(posicio);
	}
	public String getPosicio() { return posicio; }
	public void setPosicio(String novaPosicio) {
		if (novaPosicio.equals("dret") || novaPosicio.equals("assegut")) {
			posicio = novaPosicio;
		}
	}
	public int getVides() { return vides; }
	public void setVides(int novesVides) {
		if (novesVides >= 0) {
			vides = novesVides;
		}
	}
	@Override
	public String toString() { return String.format("Vides: %d. Posició: %s", vides, posicio); }
	public static void main(String[] args) {
		System.out.println(new GatRenat(7, "dret"));
	}
}
