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
			String numero = Entrada.readLine();
			boolean enter = UtilString.esEnter(numero);
			if (enter) {
				int nombre = Integer.parseInt(numero);
				String cadena = UtilString.cadenaContinua(text, nombre);
				System.out.println(cadena);
			} else {
				System.out.println("error");
			}
		}
	}
}
