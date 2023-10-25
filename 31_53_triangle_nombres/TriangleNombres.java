/*
	A Java program in which we input a number and the program makes a triangle from the smallest to highest number
*/
public class TriangleNombres {
	public static void main (String[] args) {
		System.out.println("Nombre?");
		int nombre = Integer.parseInt(Entrada.readLine());
		if (nombre > 0) {
			for (int linia = 1; linia <= nombre; linia++) {
				for (int columna = 0; columna < linia; columna++) {
					System.out.print(" " + (linia - columna));
				}
				System.out.println("");
			}
		}
	}
}
