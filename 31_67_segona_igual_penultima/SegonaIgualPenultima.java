/*
	A java program in which
*/
public class SegonaIgualPenultima {
	public static void main (String[] args) {
		char segona;
		char penultima;
		boolean igual;
		String entrada;
		
		System.out.println("Ves introduïnt texts (finalitza amb enter sol)");
		do {
			igual = false;
			entrada = Entrada.readLine();
			if (!entrada.isBlank()) {
				if (entrada.length() == 1) {
					igual = false;
				} else {
					segona = entrada.charAt(1);
					penultima = entrada.charAt(entrada.length() - 2);
					if (segona == penultima) {
						igual = true;
					} 
				}
				if (igual) {
					System.out.println("Segona igual a penúltima");
				} else {
					System.out.println("Segona diferent de penúltima");
				}
			}
		} while (!entrada.isBlank());
		System.out.println("Adéu");
	}
}
