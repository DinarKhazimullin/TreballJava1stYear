/*
	A java program in which we ask the user a text and we draw an upside-down triangle
*/
public class TriangleLletresInvertit {
	public static void main(String[] args) {
		System.out.println("Text?");
		String text = Entrada.readLine();
		if (!text.isBlank()) {
			dibuixaTriangleInvertit(text);	
		}
	}
	
	public static void dibuixaTriangleInvertit(String text) {
		for (int linia = 1; linia <= text.length(); linia++) {
			dibuixaLiniaInvertida(text, linia);
		}
	}
	
	public static void dibuixaLiniaInvertida(String text, int linia) {
		for (int columna = text.length() - linia; columna >= 0; columna--) {
			if (text.charAt(columna) == text.charAt(0)) {
				System.out.print(text.charAt(columna));
			} else {
				System.out.print(text.charAt(columna) + ", ");
			}
		}
		System.out.println();
	}	
}
