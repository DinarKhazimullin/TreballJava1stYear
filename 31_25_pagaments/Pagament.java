/*
	A Java program that calculates the money to pay and the amount payed, and calculates if we overpayed or we are short
*/
public class Pagament {
	public static void main(String[] args) {
		System.out.println("Preu?");
		int preu = Integer.parseInt(Entrada.readLine());
		System.out.println("Paga?");
		int paga = Integer.parseInt(Entrada.readLine());
		int resultat;
		if (paga > preu) {
			resultat = paga - preu;
			System.out.println("Sobren " + resultat + "€");
		} else if (preu > paga) {
			resultat = preu - paga;
			System.out.println("Falten " + resultat + "€");
		} else if (preu == paga) {			
			System.out.println("No sobra ni falta res");
		} else {
			System.out.println("Error");
		}
	}
}
