/*
NomCognom es un programa que requereix la entrada del usuari per mostrar-ho per pantalla
*/
public class NomCognom{
	public static void main(String[] args) {
		System.out.println("Nom?");
		String nom = Entrada.readLine();
		
		System.out.println("Primer cognom?");
		String cognom = Entrada.readLine();
		
		System.out.println("Ei " + nom + ", tinc una amiga que també és " + cognom + ".");
	}
}
