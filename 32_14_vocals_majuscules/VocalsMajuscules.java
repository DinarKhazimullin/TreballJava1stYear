/*
	A java program in which the users input text is transformed as follows: all vowels are converted to uppercase letters, meanwhile all non-vowels are converted to lowercase letters
*/
public class VocalsMajuscules {
	public static void main(String[] args) {
		System.out.println("Text?");
		String text = Entrada.readLine();
		majusculitzaVocals(text);	
	}
	
	public static void majusculitzaVocals(String text) {
		boolean converteixVocal = true;
		String vocal = "iaeou";
		for (int i = 0; i < text.length(); i++) {
			if (Character.isLetter(text.charAt(i))) {
				for (int v = 0; v < vocal.length(); v++) {
					converteixVocal = false;
					if (vocal.charAt(v) == Character.toLowerCase(text.charAt(i))) {
						converteixVocal = true;
						break;
					}
				}
				if (converteixVocal == true) {
					System.out.print(Character.toUpperCase(text.charAt(i)));
				} else {
					System.out.print(Character.toLowerCase(text.charAt(i)));
				}
			} else {
				System.out.print(text.charAt(i));
			}
		}
		System.out.println();
	}
}
