/*
	A java program in which we take the user input and tell him if the input is an integer digit or not
*/
public class EsEnter {
	public static void main(String[] args) {
		boolean enter = false;
		boolean estricte = true;
		int numero = 0;
		String text = "";
		System.out.println("Introdueix texts (enter sol per finalitzar)");
		do {
			text = Entrada.readLine();
			if (!text.isEmpty()) {
				if (text.equals(text.strip())) {
					enter = UtilString.esEnter(text.strip(), estricte);
					if (enter) {
						numero = UtilString.aEnter(text.strip(), estricte);
					}
				} else {
					estricte = false;
					enter = UtilString.esEnter(text, estricte);
					if (enter) {
						numero = UtilString.aEnter(text, estricte);
					}
				}
			}
			if (!text.isEmpty()) {
				if (enter) {
					System.out.println("És enter");
				} else {
					System.out.println("No és enter");
				}
			}
		} while (!text.isEmpty());
		
		System.out.println("Adéu");
	}
}
