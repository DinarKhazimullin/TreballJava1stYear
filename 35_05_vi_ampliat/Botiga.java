/*
	A part of a java program that has as a goal to work as a shop having a repertoire of different wines.
*/
public class Botiga {
	private int DEFAULT_MAX_VINS = 10;
	private Vi[] vins;
	private int recorregut;
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
	public Vi elimina(String ref) {
		ref = Vi.normalitzaString(ref);
		ref = ref.toLowerCase();
		for (int i = 0; i < vins.length; i++) {
			if (vins[i] != null) {
				if (ref.equals(vins[i].getRef().toLowerCase())) {
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
	public Vi cerca(String ref) {
		if (Vi.normalitzaString(ref) != null) {
			ref = Vi.normalitzaString(ref);
			ref = ref.toLowerCase();
			for (int i = 0; i < vins.length; i++) {
				if (vins[i] != null) {
					if (ref.equals(vins[i].getRef().toLowerCase())) {
						return vins[i];
					}
				}
			}
		}
		return vins[0];
	}

	public Vi cerca(Vi plantilla) {
		for (Vi vi: vins) {
			if (vi == null) continue;
			if (! plantilla.getRef().isEmpty() && ! plantilla.getRef().equalsIgnoreCase(vi.getRef())) continue;
			System.out.println("Si");
			if (! plantilla.getNom().isEmpty() && ! plantilla.getNom().equalsIgnoreCase(vi.getNom())) continue;
			System.out.println("Si");
			if (plantilla.getPreu() >= 0 && plantilla.getPreu() <= vi.getPreu()) continue;
			System.out.println("Si");
			if (plantilla.getEstoc() >= 0 && plantilla.getEstoc() >= vi.getEstoc()) continue;
			System.out.println("Si");
			if (! plantilla.getLloc().isEmpty() && ! plantilla.getLloc().equalsIgnoreCase(vi.getLloc())) continue;
			if (! plantilla.getOrigen().isEmpty() && ! plantilla.getOrigen().equalsIgnoreCase(vi.getOrigen())) continue;
			if (! plantilla.getTipus().isEmpty() && ! plantilla.getTipus().equalsIgnoreCase(vi.getTipus())) continue;
			if (! plantilla.getCollita().isEmpty() && ! plantilla.getCollita().equalsIgnoreCase(vi.getCollita())) continue;
			return vi;
		}
		return null;
	}
	public void iniciaRecorregut() {
		recorregut = 0;
	}
	
	public Vi getSeguent() {
		Vi viSeguent;
		while (recorregut < vins.length) {
			viSeguent = vins[recorregut];
			if (viSeguent != null) {
				recorregut++;
				return viSeguent;
			}
			recorregut++;
		}
		return null;
	}
}
