/*
    A java program in which we ask a number and draw a "square" from 1 to user input
 */
public class QuadratNombres {
    public static void main(String args[]) {
        System.out.println("Valor final?");
        int valorFinal = Integer.parseInt(Entrada.readLine());
        
        if ((valorFinal > 0) && (valorFinal <= 9)) {
        	for (int linia = 1; linia <= valorFinal; linia++) {
        		for (int columna = 1; columna <= valorFinal; columna++) {
        		System.out.print(" " + columna);
        		}
        	System.out.println("");
        	}
        } else {
			System.out.println("Valor inadequat");
		}        
    }
}
