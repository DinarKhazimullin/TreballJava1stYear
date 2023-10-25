/*
	A java program in which we use more than one constructor for the purpose of making various cats named Renat
*/
public class GatRenat {
	private int vides = 7;
	private String posicio = "estirat";
	public GatRenat() {
		vides = getVides();
		posicio = getPosicio();
	}
	public GatRenat(int vides) {
		setVides(vides);
	}
	public GatRenat(String posicio) {
		setPosicio(posicio);
	}
	public GatRenat(int vides, String posicio) {
		setVides(vides);
		setPosicio(posicio);
	}
	public int getVides() { return vides; }
	public void setVides(int vides) {
		if (vides >= 0) {
			this.vides = vides;
		}
	}
	public String getPosicio() { return posicio; }
	public void setPosicio(String posicio) {
		if (posicio.equals("dret") || posicio.equals("assegut")) {
			this.posicio = posicio;
		}
	}
	@Override
	public String toString() {return String.format("Vides: %d. Posició: %s", vides, posicio); }
	public static void main(String[] args) {
		GatRenat[] renats = {
			new GatRenat(),
			new GatRenat(8),
			new GatRenat("dret"),
			new GatRenat(8, "dret")
		};
		for (GatRenat renat: renats) {
			System.out.println(renat);
		}
	}
}
