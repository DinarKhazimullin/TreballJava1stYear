/*
	A java program which takes the user input and encodes it.
*/
public class CodificaBasic {
	public static void main(String[] args) {
		System.out.println("Text?");
		String text = Entrada.readLine();
		System.out.println("Quants?");
		int quants = Integer.parseInt(Entrada.readLine());
		codifica(text, quants);
	}
	
	public static void codifica(String text, int quants) {
		if (quants >= 0) {
			for (int i = 0; i < text.length(); i++) {
				if (text.charAt(i) >= 'a' && text.charAt(i) <= 'z') {
					if ((char) (text.charAt(i) + quants) > 'z') {
						System.out.print((char) (('a' - 1) + (quants - ('z' - text.charAt(i)))));
					} else {
						System.out.print((char) (text.charAt(i) + quants));
					}
				} else {
					System.out.print(text.charAt(i));
				}
			}
			System.out.println();
		} else {
			System.out.println("No s'accepten números negatius");
		}
	}
}
