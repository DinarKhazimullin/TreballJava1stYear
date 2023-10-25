/*
	A Java program which adds grades until the value exceeds 100 or goes below 0
*/
public class SumaNotes {
	public static void main(String[] args){		
		int nota = 0;
		int valor = 0;
		while ((valor >= 0) && (valor <= 100)) {
			System.out.println("Introdueix una nota");
			valor = Integer.parseInt(Entrada.readLine());
			if ((valor >= 0) && (valor <= 100)){
				nota = nota + valor;
			}
		}
		System.out.println("La suma de les notes vàlides és " + nota);
	}
}
