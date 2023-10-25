/* A java program which simulates the function of a wine shop. This time, we implement the class wine */
public class Vi {
	private String nom;
	private int preu;
	private int estoc;
	public Vi(String nom, int preu) {
		this.nom = normalitzaNom(nom);
		if (preu >= 0) {
			setPreu(preu);
		} else {
			this.preu = -1;
		}
		this.estoc = 0;
	}
	public Vi(String nom, int preu, int estoc) {
		this.nom = normalitzaNom(nom);
		if (preu >= 0) {
			setPreu(preu);
		} else {
			this.preu = -1;
		}
		if (estoc >= 0) {
			setEstoc(estoc);
		} else {
			this.estoc = -1;
		}
	}
	public String getNom() { return this.nom;}
	public int getPreu() { return this.preu;}
	public void setPreu(int preu) {
		if (preu >= 0) {
			this.preu = preu;
		}
	}
	public int getEstoc() { return this.estoc;}
	public void setEstoc(int estoc) {
		if (estoc >= 0) {
			this.estoc = estoc;
		}
	}
	public boolean esValid() {
		if (this.nom.equals("NOM NO VÀLID!") || this.preu == -1 || this.estoc == -1) {
			return false;
		}
		return true;
	}
	public static String normalitzaNom(String nom) {
		String nomARetornar = "";
		int espaisBlanc = 0;
		nom = nom.strip();
		if (UtilString.esEnter(nom) || nom.isEmpty()) {
			return "NOM NO VÀLID!";
		}
		for (int i = 0; i < nom.length(); i++) {
			if (Character.isWhitespace(nom.charAt(i)) && espaisBlanc == 0) {
				nomARetornar += nom.charAt(i);
				espaisBlanc = 1;
			}
			if (!Character.isWhitespace(nom.charAt(i))) {
				nomARetornar += nom.charAt(i);
				espaisBlanc = 0;
			}
		}
		return nomARetornar;
	}
	@Override
	public String toString() {
		return String.format("%n    Vi: %s%n    Preu: %d%n    Estoc: %d%n", this.nom, this.preu, this.estoc);
	}
	public String[] aArrayString() {
		String[] viString = new String[] {this.nom, this.preu + "", this.estoc + ""};
		return viString;
	} 
	
	public static Vi deArrayString(String[] viArray) {
		if (viArray.length == 3) {
			if (UtilString.esEnter(viArray[1]) && UtilString.esEnter(viArray[2])) {
				Vi vi = new Vi(viArray[0], Integer.parseInt(viArray[1]), Integer.parseInt(viArray[2]));
				if (vi.esValid()) {
					return vi;
				}
			}
		}
		return null;
	}
}
