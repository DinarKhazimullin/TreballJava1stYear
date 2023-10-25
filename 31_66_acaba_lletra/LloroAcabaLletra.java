/*
	A java program which repeats de user input only when it ends as a non vowel and lower case
*/
public class LloroAcabaLletra {
	public static void main (String[] args) {
		String entrada;
		String noPermesos = "aeiou";
		char ultimaLletra;
		boolean print = false;
		do {
			System.out.println("El lloro pregunta paraula que finalitzi per lletra no vocal");
			entrada = Entrada.readLine();
			if ((!entrada.isBlank()) && (Character.isLetter(entrada.charAt(entrada.length() - 1)))) {
				ultimaLletra = entrada.charAt(entrada.length() - 1);
				for (int i = 0; i < 5; i++) {	
					if (Character.toLowerCase(ultimaLletra) == noPermesos.charAt(i)) {
						print = false;
						i = 5;
					} else {
						print = true;
					}
				}
			}
			if (print) {
				System.out.println("El lloro diu: " + entrada);
				print = false;
			} 
		} while (!entrada.isBlank());
			System.out.println("Adéu");
	}
}
