/*
	My java array library
*/

public class UtilTaula {
	public static char[][] substitueix (char[][] taula, char inici, char fi) {
		char[][] taulaFi = new char[taula.length][taula[0].length];
		for (int linia = 0; linia < taula.length; linia++) {
			for (int col = 0; col < taula[linia].length; col++) {
				if (taula[linia][col] == inici) {
					taulaFi[linia][col] = fi;
				} else {
					taulaFi[linia][col] = taula[linia][col];
				}
			}
		}
		return taulaFi;
	}
}
