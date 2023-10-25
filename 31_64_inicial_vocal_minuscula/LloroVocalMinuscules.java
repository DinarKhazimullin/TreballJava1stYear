/*
	A java program in which a parrot repeats the word we input only if it starts as a lower case vowel
*/
public class LloroVocalMinuscules {
	public static void main (String[] args) {
	String entrada;
	String vocal = "aeiou";
	boolean comenca = false;
	do {
		comenca = false;
		System.out.println("El lloro pregunta paraula que comenci amb vocal en minúscules");
		entrada = Entrada.readLine();
		if (!entrada.isEmpty()) {
			for (int i = 0; i < 5; i++) {
				if (entrada.charAt(0) == vocal.charAt(i)) {
					comenca = true;
				}
			}
		}
		if (comenca) {
			System.out.println("El lloro diu: " + entrada);
		}
	} while (!entrada.isEmpty());
	System.out.println("Adéu");
	}
}
