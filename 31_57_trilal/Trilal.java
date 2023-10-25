/*
	A java program that creates a "tryforce"
*/
public class Trilal {
	public static void main(String[] args) {
		for (int linia = 0; linia <= 9; linia++) {
			for (int columna = 0; columna < 10; columna++) {
				System.out.print(".");
			}
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
			for (int columna = 0; columna < 10; columna++) {
				System.out.print(".");
			}
			System.out.println("");
		}
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
			for (int columna = 9; columna >= linia; columna--) {
				System.out.print(".");
			}
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
	}
}
