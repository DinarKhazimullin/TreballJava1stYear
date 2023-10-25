/*
	A java program which creates as many diamonds as the user wants
*/
public class Rombos {
	public static void main (String[] args) {
		System.out.println("quants?");
		int quants = Integer.parseInt(Entrada.readLine());
		for (int q = 1; q <= quants; q++){
			for (int linia = 0; linia <= 9; linia++) {
				for (int columna = 9; columna > linia; columna--) {
					System.out.print(".");
				}
				for (int columna = 0; columna <= linia; columna++) {
					System.out.print(columna + (9 - linia));
				}
				for (int columna = 1; columna <= linia; columna++) {
					System.out.print(9 - columna);
				}
				for (int columna = 9; columna > linia; columna--) {
					System.out.print(".");
				}
				System.out.println("");
			}
			for (int linia = 0; linia < 9; linia++) {
				for (int columna = 0; columna <= linia; columna++) {
					System.out.print(".");
				}
				for (int columna = 9; columna > linia; columna--) {
					System.out.print(linia + (10 - columna));
				}
				for (int columna = 8; columna > linia; columna--) {
					System.out.print(columna);
				}
				for (int columna = 0; columna <= linia; columna++) {
					System.out.print(".");
				}
				System.out.println("");
			}
		}
	}
}
