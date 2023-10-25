/*
	A java program in which the program draws a square based on user's input
*/
public class Quadrat {
	public static void main(String[] args) {
		int midaQuadrat = Integer.parseInt(args[0]);
		dibuixaQuadrat(midaQuadrat);
	}
	
	public static void dibuixaQuadrat(int mida) {
		for (int linia = 1; linia <= mida; linia++) {
			for (int columna = 1; columna <= mida; columna++) {
				System.out.print(" X");
			}
			System.out.println();
		}
	}
}
