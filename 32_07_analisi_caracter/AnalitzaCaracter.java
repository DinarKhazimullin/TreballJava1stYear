/*
	A java program in which we ask a sentence or word, and a number, which will be defined as a position. After that, we look at the position in contrast of the sentence or word and analize it.
*/
public class AnalitzaCaracter{
	public static void main(String[] args) {
		System.out.println("Text?");
		String text = Entrada.readLine();
		System.out.println("Posició?");
		int posicio = Integer.parseInt(Entrada.readLine());
		if (posicio >= (text.length())) {
			System.out.println("Fora de rang");
		} else if (posicio < (text.length() * -1)) {
			System.out.println("Fora de rang");
		} else {
			if (posicio < 0) {
				analitzaCaracter(text.charAt(text.length() + posicio));
			} else {
				analitzaCaracter(text.charAt(posicio));
			}
		}
	}
	
	public static void analitzaCaracter(char caracter) {
		if (Character.isLetter(caracter)) {
			System.out.println("'" + caracter + "' és una lletra");
		} else if (Character.isDigit(caracter)) {
			System.out.println("'" + caracter + "' és un nombre");
		} else {
			System.out.println("'" + caracter + "' és una altra cosa");
		}
	}
}
