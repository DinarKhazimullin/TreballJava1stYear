/*
	Programa que ens permet duplicar el numero introduit
	Dona error si el valor introduit no es adecuat
	Experimentat per compte propia
 */

public class Duplica {
	public static void main(String[] args) {
		int nombreADuplicar;
		int nombreDuplicat;
		
		nombreADuplicar = Integer.parseInt(args[0]);
		
		nombreDuplicat = nombreADuplicar * 2;
		
		System.out.print("El doble de ");
		System.out.print(nombreADuplicar);
		System.out.print(" és ");
		System.out.println(nombreDuplicat);
	}
}
