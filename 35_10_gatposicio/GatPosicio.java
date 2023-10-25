/*
	A java class which is responsible for the cat's position. This class uses enum.
*/
public enum GatPosicio {
		DRET	,
		ASSEGUT	,
		ESTIRAT	;
		
		public static GatPosicio fromString(String nom) {
		for (GatPosicio posicio: GatPosicio.values()) {
			if (posicio.name().equalsIgnoreCase(nom)) return posicio;
		}
		throw new IllegalArgumentException(String.format("Valor \"" + nom + "\" no suportat per GatPosicio"));
	}
}
