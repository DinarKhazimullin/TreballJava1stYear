/*
	A java program in which we ask for user's grades (from 1 to 10) and show the highest note after negative 1 is input
*/
public class NotaMesAlta {
	public static void main(String[] args) {
		int nota;
		int notaAlta = 0;
		int vegades = 0;
		System.out.println("Introdueix les notes (-1 per finalitzar)");
		do {
			nota = Integer.parseInt(Entrada.readLine());
			vegades++;
			if (nota > notaAlta) {
				notaAlta = nota;
			}
		} while (nota != -1);
		if (nota == -1 && vegades <= 2) {
			System.out.println("Com a mínim calen dues notes");
		} else {
			System.out.println("La nota més alta és " + notaAlta);
		}
	}
}
