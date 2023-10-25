/*
	A java program in which we ask the user a text and it will draw a triangle with every word of the text.
*/
public class TriangleLletres {
	public static void main(String[] args) {
		System.out.println("Text?");
		String text = Entrada.readLine();
		if (!text.isBlank()) {
			dibuixaTriangle(text);
		}
	}
		
	
	public static void dibuixaTriangle(String text) {
		for (int linia = 1; linia <= text.length(); linia++) {
			dibuixaLinia(text, linia);
		}
	}
		
	public static void dibuixaLinia(String text, int linia) {
		for (int columna = 0; columna < linia; columna++) {
			if (columna == linia - 1) {
				System.out.print(text.charAt(columna));
			} else {
				System.out.print(text.charAt(columna) + ", ");
			}
		}
		System.out.println();
	}
}
