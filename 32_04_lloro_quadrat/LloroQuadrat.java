/*
	A java program in which a parrot will repeat what the user inputs, and in case the user inputs "dibuxa quadrat" or "dibuixa rectangle", it will draw the square or rectangle respectively
*/
public class LloroQuadrat {
	public static void main(String[] args) {
		String text;
		do {
			System.out.println("El lloro espera paraula:");
			text = Entrada.readLine();
			if (!text.isBlank()) {
				if (text.equals("dibuixa quadrat")) {
					dibuixaQuadrat();
				} else if (text.equals("dibuixa rectangle")) {
					dibuixaRectangle();
				} else {
					System.out.println("El lloro repeteix: " + text);
				}
			}
		} while (!text.isBlank());
		System.out.println("Adéu");
	}
	
	public static void dibuixaQuadrat() {
		for (int linia = 1; linia <= 5; linia++) {
			for (int columna = 1; columna <= 5; columna++) {
				System.out.print(" X");
			}
			System.out.println();
		}
	}
	
	public static void dibuixaRectangle() {
		for (int linia = 1; linia <= 5; linia++) {
			for (int columna = 1; columna <= 10; columna++) {
				System.out.print(" X");
			}
			System.out.println();
		}
	}
}
