/*
	A java program that indicates if the number the user has provided is odd or even
*/
public class ParellSenar {
	public static void main(String[] args) {
		int numero = Integer.parseInt(args[0]);
		if (numero % 2 == 0) {
			System.out.println("El número " + numero + " és parell");
		} else {
			System.out.println("El número " + numero + " és senar");
		}
	}
}
