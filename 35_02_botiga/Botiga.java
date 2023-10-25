/*
	A part of a java program that has as a goal to work as a shop having a repertoire of different wines.
*/
public class Botiga {
	private int DEFAULT_MAX_VINS = 10;
	private Vi[] vins;
	public Botiga() {
		vins = new Vi[DEFAULT_MAX_VINS];
	}
	public Botiga(int maxVins) {
		if (maxVins > 0) {
			vins = new Vi[maxVins];
		} else {
			vins = new Vi[DEFAULT_MAX_VINS];
		}
	}
	public Vi afegeix(Vi vi) {
		if (vi.esValid()) {
			for (int i = 0; i < vins.length; i++) {
				if (vins[i] != null) {
					if (vi.getNom().equals(vins[i].getNom())) {
						return null;
					}
				}
			}	
		} else {
			return null;
		}
		for (int i = 0; i < vins.length; i++) {
			if (vins[i] == null) {
				vins[i] = vi;
				return vi;
			}
		}
		return null;
	}
	public Vi elimina(String nom) {
		nom = Vi.normalitzaNom(nom);
		nom = nom.toLowerCase();
		for (int i = 0; i < vins.length; i++) {
			if (vins[i] != null) {
				if (nom.equals(vins[i].getNom().toLowerCase())) {
					if (vins[i].getEstoc() > 0) {
						return null;
					} else {
						Vi vi = vins[i];
						vins[i] = null;
						return vi;
					}
				}
			}
		}
		return null;
	}
	public Vi cerca(String nom) {
		nom = Vi.normalitzaNom(nom);
		nom = nom.toLowerCase();
		for (int i = 0; i < vins.length; i++) {
			if (vins[i] != null) {
				if (nom.equals(vins[i].getNom().toLowerCase())) {
					return vins[i];
				}
			}
		}
		return null;
	}
}
