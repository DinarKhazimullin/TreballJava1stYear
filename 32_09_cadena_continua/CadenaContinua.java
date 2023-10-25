/*
	A java progran in which we ask a sentence or a word and a number, and show the number of caracters that there is. In case that the number is bigger than the length, it starts again from the first caracter until the number the user input.
*/
public class CadenaContinua {
	public static void main(String[] args) {
		System.out.println("Text?");
		String text = Entrada.readLine();
		if (text.isBlank()) {
			System.out.println("error");
		} else {
			System.out.println("Nombre?");
			int nombre = Integer.parseInt(Entrada.readLine());
			mostraCadenaContinua(text, nombre);
		}
	}
	
	public static void mostraCadenaContinua(String text, int longitud) {
		if (longitud >= text.length()) {
			System.out.print(text.repeat(longitud / text.length()));
			if (longitud % text.length() != 0) {
				for (int i = 0; i < longitud; i++) {
					if (i < longitud % text.length()) {
						System.out.print(text.charAt(i));
					}
				}
			}
		} else {
			for (int i = 0; i < longitud; i++) {
				System.out.print(text.charAt(i));
			}
		}
		System.out.println();
	}
}
