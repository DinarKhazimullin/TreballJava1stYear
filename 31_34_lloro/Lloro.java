/*
	A java program in which a parrot repeats the words we input
*/
public class Lloro {
	public static void main (String[] args) {
		String paraula = "a";
		while ( !((paraula.isEmpty()) || (paraula.isBlank())) ) {
			System.out.println("El lloro espera paraula:");
			paraula = Entrada.readLine();
			if ( !((paraula.isEmpty()) || (paraula.isBlank())) ) {
				System.out.println("El lloro repeteix: " + paraula);
			} else {
				System.out.println("Adéu");
			}
		}
	}
}
