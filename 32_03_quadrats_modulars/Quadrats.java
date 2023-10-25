/*
	A java program in which we ask a the user a number and create the number of squares depending on the user input
*/
public class Quadrats {
	public static void main(String[] args) {
		// We call the method dibuixaQuadrats(), so we can "draw" the square
		dibuixaQuadrats();
	}
	public static void dibuixaQuadrats() {
		//We call the method dibuixaQuadrat(), so we can make the structure of the
		dibuixaQuadrat();
	}
	public static void dibuixaQuadrat() {
		// We print a question for the user to answer
		System.out.println("Quants?");
		// We ask the user for an imput
		int quantitat = Integer.parseInt(Entrada.readLine());
		// We compare the user input to not being equal or smaller than 0, so we can't draw 0 or negative square
		if (quantitat > 0) {
			// We "draw" as many squares as the user has told us
			for (int vegades = 1; vegades <= quantitat; vegades++) {
				// We "draw" the square
				for (int linia = 1; linia <= 5; linia++) {
					// We call the method dibuixaLinia(), so we can "draw" the each element of the square
					dibuixaLinia();
				}
				// we "draw" a line break
				System.out.println();		
			}
		}
	}
	public static void dibuixaLinia() {
		// We "draw" the line
		for (int columna = 1; columna <= 5; columna++) {
		// We "draw" each element of the line
			System.out.print(" X");
		}
		// We "draw" a line break
		System.out.println();
	}
}
