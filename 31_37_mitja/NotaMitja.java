/*
	A java program that calculates the average grade out of all that we wrote, and will stop after we input something bigger than 100 and smaller than 0, and will show us the result.
*/
public class NotaMitja {
	public static void main(String[] args) {
		int nota;
		int notaMitjana;
		int notaSuma = 0;
		int mitjana = 0;
		System.out.println("Introdueix un valor");
		nota = Integer.parseInt(Entrada.readLine());
		if ((nota >= 0) && (nota <= 100)) {
			notaSuma = notaSuma + nota;
			mitjana++;
			notaMitjana = notaSuma/mitjana;
			while ((nota >= 0) && (nota <= 100)) {
				System.out.println("Introdueix un valor");
				nota = Integer.parseInt(Entrada.readLine());
				if ((nota >= 0) && (nota <= 100)) {
					notaSuma = notaSuma + nota;
					mitjana++;
					notaMitjana = notaSuma/mitjana;
				}	else {
					System.out.println("La mitja de les notes vàlides és " + notaMitjana);
				}
			}
		} else {
			System.out.println("Cap nota vàlida introduïda");
		}
	}
}
