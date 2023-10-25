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
	public static void inicialitzaTaula(int[][] taula, int numero) {
		for (int linia = 0; linia < taula.length; linia++) {
			for (int col = 0; col < taula[0].length; col++) {
				taula[linia][col] = numero;
			}
		}
	}
	public static String taulaToString(int[][] taula) {
		String taulaString = "";
		for (int linia = 0; linia < taula.length; linia++) {
			for (int col = 0; col < taula[0].length; col++) {
				taulaString = taulaString + String.format("%8d", taula[linia][col]);
			}
			taulaString = taulaString + "\n";
		}
		return taulaString;
	}
}
