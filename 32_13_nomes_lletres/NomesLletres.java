/*
	A java program which prints the sentence the user inputs but only letters and separated by comas.
*/
public class NomesLletres {
	public static void main(String[] args) {
		System.out.println("Text?");
		String text = Entrada.readLine();
		filtraLletres(text);
	}
	
	public static void filtraLletres(String text) {
		int primeraLletra = 0;
		for (int i = 0; i < text.length(); i++) {
			if (Character.isLetter(text.charAt(i))) {
				if (primeraLletra == 0) {
					System.out.print(text.charAt(i));
					primeraLletra++;
				} else {
					System.out.print(", " + text.charAt(i));
				}
			}
		}
		System.out.println();
	}
}
