/*
	A java program which does the same as the previous one but way shorter
*/
public class ParellSenar{
	public static void main(String[] args) {
		int numero = Integer.parseInt(args[0]);
		String parellSenar = (numero % 2 == 0) ? "parell" : "senar";
		System.out.println("El número " + numero + " és " + parellSenar);
	}
}
