/*
	A java program that shows us, of all the numbers written, the biggest one.
*/
public class TrobaMaxim {
	public static void main (String[] args) {
		int valor = 0;
		int valorMaxim = 0;
		while (valor >= 0) {
			System.out.println("Introdueix un valor");
			if (valor >= 0) {
				valor = Integer.parseInt(Entrada.readLine());
				if (valor > valorMaxim) {
					valorMaxim = valor;
				}
			} 
		}
		System.out.println("El màxim és " + valorMaxim);
	}
}
