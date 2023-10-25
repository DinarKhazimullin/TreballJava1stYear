/*
	A java program which shows any numbers the user wants separated by any character and whichever number the user desires
*/
public class EntersEntreComes {
    public static void main(String[] args) {
    	char caracter = ',';
    	String valor = "";
    	boolean enter = false;
    	String quants = "";
        int[] numeros;
        System.out.println("Quants?");
        do {
        	quants = Entrada.readLine();
        	enter = UtilString.esEnter(quants);
        	if (!enter) {
        		System.out.println("Per favor, un valor enter");
        	}
        } while (!enter);
        if (Integer.parseInt(quants) < 1) {
        	System.out.println("Res a fer");
        } else {
        	System.out.println("Separador?");
        	String separador = Entrada.readLine();
        	if (!separador.isEmpty()) {
        		caracter = separador.charAt(0);
        	}
        	numeros = new int[Integer.parseInt(quants)];
        	for (int i = 0; i < numeros.length; i++) {
        		System.out.println("Valor " + (i + 1) + "?");
        		do {
        			valor = Entrada.readLine();
        			enter = UtilString.esEnter(valor);
        			if (enter) {
        				numeros[i] = Integer.parseInt(valor);
        			} else {
        				System.out.println("Per favor, un valor enter");
        			}
        		} while (!enter);
        	}
        System.out.println(UtilString.entreComes(numeros, caracter));
    	}
    }
}
