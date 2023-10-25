/*
	A java program in which we input a sequence of numbers in growing order, once a number is smaller than the last one we will print the sequence length.
*/
public class SequenciaCreixent {
	public static void main (String[] args) {
		int valor = 0;
		int contador = 0;
		int valorAntic = 0;
		
		System.out.println("Introdueix un valor");
		valor = Integer.parseInt(Entrada.readLine());
		contador += 1;
		do {
			valorAntic = valor;
			System.out.println("Introdueix un valor");
			valor = Integer.parseInt(Entrada.readLine());
			if (valor > valorAntic){
                                contador += 1;
				valorAntic = valor;
                                System.out.println("Introdueix un valor");
                                valor = Integer.parseInt(Entrada.readLine());
                                if (valor > valorAntic) {
                                    contador += 1;
                                }
                        }
		} while (valor > valorAntic);	
		System.out.println("Longitud de la següència creixent: " + contador);
	}
}
