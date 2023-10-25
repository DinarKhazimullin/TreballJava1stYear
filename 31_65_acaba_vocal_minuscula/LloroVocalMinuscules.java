/*
	A java program in which a parrot repeats the word we input only if it ends as a lower case vowel
*/
public class LloroVocalMinuscules {
	public static void main (String[] args) {
		String entrada;
		String vocal = "aeiou";
		boolean acaba;
		do {
			acaba = false;
			System.out.println("El lloro pregunta paraula que finalitzi per vocal en minúscules");
			entrada = Entrada.readLine();
			if (!entrada.isEmpty()) {
				for (int i = 0; i < 5; i++) {
					if (entrada.charAt(entrada.length() - 1) == vocal.charAt(i)) {
						acaba = true;
					}
				}
			}
			if (acaba) {
				System.out.println("El lloro diu: " + entrada);
			}
		} while (!entrada.isEmpty());
		System.out.println("Adéu");
	}
}
