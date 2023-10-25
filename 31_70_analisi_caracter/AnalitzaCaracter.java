/*
	A java program in which we ask a sentence or word and then a number position, and the program prints information about the character which equals to the position input.
*/
public class AnalitzaCaracter {
	public static void main (String[] args) {
		System.out.println("Text?");
		String text = Entrada.readLine();
		System.out.println("Posició?");
		int posicio = Integer.parseInt(Entrada.readLine());
		if (posicio < 0) {
			if (posicio < (text.length() * -1)) {
				System.out.println("Fora de rang");
			} else {
				if (posicio == -1) {
					if (Character.isLetter(text.charAt(text.length() + posicio))) {
						System.out.println("'" + text.charAt(text.length() + posicio) + "' és una lletra");
					} else if (Character.isDigit(text.charAt(text.length() + posicio))) {
						System.out.println("'" + text.charAt(text.length() + posicio) + "' és un nombre");
					} else {
						System.out.println("'" + text.charAt(text.length() + posicio) + "' és una altra cosa");
					}
				} else {
					if (Character.isLetter(text.charAt(text.length() + posicio))) {
						System.out.println("'" + text.charAt(text.length() + posicio) + "' és una lletra");
					} else if (Character.isDigit(text.charAt(text.length() + posicio))) {
						System.out.println("'" + text.charAt(text.length() + posicio) + "' és un nombre");
					} else {
						System.out.println("'" + text.charAt(text.length() + posicio) + "' és una altra cosa");
					}
				}
			}
		} else {
			if (posicio >= (text.length())) {
				System.out.println("Fora de rang");
			} else {
				if (posicio == 0) {
					if (Character.isLetter(text.charAt(0))) {
						System.out.println("'" + text.charAt(0) + "' és una lletra");
					} else if (Character.isDigit(text.charAt(0))) {
						System.out.println("'" + text.charAt(0) + "' és un nombre");
					} else {
						System.out.println("'" + text.charAt(0) + "' és una altra cosa");
					}
				} else {
					if (Character.isLetter(text.charAt(posicio))) {
						System.out.println("'" + text.charAt(posicio) + "' és una lletra");
					} else if (Character.isDigit(text.charAt(posicio))) {
						System.out.println("'" + text.charAt(posicio) + "' és un nombre");
					} else {
						System.out.println("'" + text.charAt(posicio) + "' és una altra cosa");
					}
				}
			}
		}
	}
}
