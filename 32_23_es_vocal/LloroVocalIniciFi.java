/*
	A java program in which a parrot asks for a word that either starts or ends with a vowel.
*/
public class LloroVocalIniciFi {
	public static void main(String[] args) {
		while (true) {
			System.out.println("El lloro demana paraula amb vocal a l'inici o/i final");
			String input = Entrada.readLine();
			if (input.isEmpty() || input.isBlank()) {
				System.out.println("El lloro demana confirmació per finalitzar");
				if (UtilitatsConfirmacio.respostaABoolean(Entrada.readLine())) {
					break;
				}
			} else {		
				if (UtilString.esVocal(input.charAt(0)) || UtilString.esVocal(input.charAt(input.length() - 1))) {
					System.out.println("El lloro diu: " + input);
				}
			}
		}
		System.out.println("Adéu");
	}
}
