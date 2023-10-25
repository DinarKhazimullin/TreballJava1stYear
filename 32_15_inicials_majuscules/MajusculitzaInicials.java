/*
	A java program which converts the first letter of any word to uppercase and the rest to lowercase
*/
public class MajusculitzaInicials {
	public static void main(String[] args) {
		System.out.println("Text?");
		String text = Entrada.readLine();
		majusculitzaInicials(text);
	}
		
	public static void majusculitzaInicials(String text) {
		boolean majuscula = true;
		for (int i = 0; i < text.length(); i++) {
			if (majuscula) {
				System.out.print(Character.toUpperCase(text.charAt(i)));
			} else {
				System.out.print(Character.toLowerCase(text.charAt(i)));
			}
			if (!Character.isLetter(text.charAt(i)) || Character.isWhitespace(text.charAt(i))) {
				if (i + 2 < text.length()) {
					if (text.charAt(i+2) == '\'') {
						majuscula = false;
					} else {
						majuscula = true;
					}
				} else {
					majuscula = true;
				}
			} else {
				majuscula = false;
			}
		}
		System.out.println();
	}
}
