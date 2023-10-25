/*
	A java program in which we take the user input and tell him if the input is an integer digit or not
*/
public class EsEnter {
	public static void main(String[] args) {
		String text = "";
		System.out.println("Introdueix texts (enter sol per finalitzar)");
		do {
			text = Entrada.readLine();
			boolean enter = UtilString.esEnter(text.strip());
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
