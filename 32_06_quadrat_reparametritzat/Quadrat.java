/*
	A java program in which the program draws a square based on user's input, including character variations
*/
public class Quadrat {
	public static void main(String[] args) {
		int midaQuadrat = Integer.parseInt(args[0]);
		char caracterQuadrat = args[1].charAt(0);
		dibuixaQuadrat(midaQuadrat, caracterQuadrat);
	}
	
	public static void dibuixaQuadrat(int mida, char caracter) {
		for (int linia = 1; linia <= mida; linia++) {
			dibuixaLinia(mida, caracter);
		}
	}
	
	public static void dibuixaLinia(int mida, char caracter) {
		for (int columna = 1; columna <= mida; columna++) {
			System.out.print(" " + caracter);
		}
		System.out.println();
	}
}
