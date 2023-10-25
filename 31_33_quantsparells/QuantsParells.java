/*
	A Java that counts even numbers and ends when a negative number is written
*/
public class QuantsParells {
	public static void main(String[] args) {
		int valor = 0;
		int contador = 0;
		while (valor >= 0) {
			System.out.println("Introdueix un valor");
			valor = Integer.parseInt(Entrada.readLine());
			if (valor >= 0){
				if (valor % 2 == 0) {
					contador = contador + 1;
				}
			} else {
				System.out.println("Nombre de parells introduïts: " + contador);
			}	
		}
	}
}
