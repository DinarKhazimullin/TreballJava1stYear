/*
	A java program in which we ask the user for it's age and depending on the users answer, we let him cross the street or not via a stoplight
*/
public class Semafor {
	public static void main(String[] args) {
		System.out.println("Ets major d'edat?");
		if (UtilitatsConfirmacio.respostaABoolean(Entrada.readLine())) {
		
		
		
			System.out.println("Color?");
			String color = Entrada.readLine().toLowerCase();
			if (color.equals("verd")) {
				System.out.println("passa");
			} else if (color.equals("groc")) {
				System.out.println("corre!");
			} else if (color.equals("vermell")) {
				System.out.println("espera");
			} else {
				System.out.println("ves a l'oculista");
			}
		} else {
			System.out.println("No pots fer servir aquest programa sense supervisió");
		}
	}
}
