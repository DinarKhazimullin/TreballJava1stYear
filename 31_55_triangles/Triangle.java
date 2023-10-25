/*
	A java program which creates as many triangles as the user wants
*/
public class Triangle {
	public static void main (String[] args) {
		System.out.println("quants?");
		int quants = Integer.parseInt(Entrada.readLine());
		for (int q = 1; q <= quants; q++){
			for (int linia = 0; linia < 10; linia++) {
				for (int columna = 0; columna <= 9; columna++) {
					if (columna < (9 - linia)) {
						System.out.print(".");						
					} else {
						System.out.print(columna);
					}
				}
				for (int columna = 8; columna >= 0; columna--) {
					if (columna < (9 - linia)) {
						System.out.print(".");
					} else {
						System.out.print(columna);
					}
				}
				System.out.println("");
			}
		}
	}
}
