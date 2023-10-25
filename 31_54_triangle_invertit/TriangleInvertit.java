/*
	A Java program in which we input a number and the program makes a triangle from the smallest to highest number
*/
public class TriangleInvertit {
	public static void main (String[] args) {
		System.out.println("Nombre?");
		int nombre = Integer.parseInt(Entrada.readLine());
		if (nombre > 0) {
			for (int linia = 0; linia <= nombre; linia++) {
				for (int columna = nombre - 1; columna >= linia; columna--) {
					if ((nombre - columna) != 1) {
						System.out.print(", " + (nombre - columna));
					} else {
						System.out.print(nombre - columna);
					}
				}
				System.out.println("");
			}
		}
	}
}
