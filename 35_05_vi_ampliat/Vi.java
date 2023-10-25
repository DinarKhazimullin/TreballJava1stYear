/* A java program which simulates the function of a wine shop. This time, we implement the class wine */
public class Vi {
	private String ref;
	private String nom;
	private int preu;
	private int estoc;
	private String lloc;
	private String origen;
	private String tipus;
	private String collita;
	public Vi(String ref, String nom, int preu, int estoc, String lloc, String origen, String tipus, String collita) {
		this.ref = normalitzaString(ref);
		this.nom = normalitzaString(nom);
		setLloc(lloc);
		this.origen = normalitzaString(origen);
		this.tipus = normalitzaString(tipus);
		this.collita = normalitzaString(collita);
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
	public String getRef() { return this.ref;}
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

	public String getLloc() { return lloc; }
	public void setLloc(String lloc) {
		this.lloc = lloc;
	}

	public String getOrigen() { return this.origen; }

	public String getTipus() { return this.tipus; }

	public String getCollita() { return this.collita; }
	public boolean esValid() {
		if (this.ref == null || this.nom == null || this.preu == -1 || this.estoc == -1 || this.collita == null || this.lloc == null || this.origen == null || this.tipus == null) {
			return false;
		}
		return true;
	}
	public static String normalitzaString(String str) {
		if (str == null) {
			return null;
		}
		String strARetornar = "";
		int espaisBlanc = 0;
		str = str.strip();
		for (int i = 0; i < str.length(); i++) {
			if (Character.isWhitespace(str.charAt(i)) && espaisBlanc == 0) {
				strARetornar += str.charAt(i);
				espaisBlanc = 1;
			}
			if (!Character.isWhitespace(str.charAt(i))) {
				strARetornar += str.charAt(i);
				espaisBlanc = 0;
			}
		}
		return strARetornar;
	}
	@Override
	public String toString() {
		return String.format("%n    Ref: %s%n    Nom: %s%n    Preu: %d%n    Estoc: %d%n    Lloc: %s%n    D.O.: %s%n    Tipus: %s%n    Collita: %s%n", this.ref, this.nom, this.preu, this.estoc, this.lloc, this.origen, this.tipus, this.collita);
	}
	public String[] aArrayString() {
		String[] viString = new String[] {this.ref, this.nom, this.preu + "", this.estoc + "", this.lloc, this.origen, this.tipus, this.collita};
		return viString;
	} 
	
	public static Vi deArrayString(String[] viArray) {
		if (viArray.length == 8) {
			if (UtilString.esEnter(viArray[2]) && UtilString.esEnter(viArray[3])) {
				Vi vi = new Vi(viArray[0], viArray[1], Integer.parseInt(viArray[2]), Integer.parseInt(viArray[3]), viArray[4], viArray[5], viArray[6], viArray[7]);
				if (vi.esValid()) {
					return vi;
				}
			}
		}
		return null;
	}
}
