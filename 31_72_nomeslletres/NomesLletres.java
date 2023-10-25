/*
	A java program which prints the sentence the user inputs but only letters and separated by comas.
*/
public class NomesLletres {
	public static void main (String[] args) {
		System.out.println("Text?");
		String text = Entrada.readLine();
		int vegades = 0;
		String textLletres = "";
		for (int i = 0; i < text.length(); i++) {
			if (Character.isLetter(text.charAt(i))) {
				if (vegades == 0) {
					System.out.print(text.charAt(i));
					vegades++;
				} else {
					textLletres += text.charAt(i);
				}
			}
		}
		for (int i = 0; i < textLletres.length() - 1; i++) {
				System.out.print(", " + textLletres.charAt(i));
		}
		System.out.println(", " + textLletres.charAt(textLletres.length() - 1));
	}
}
