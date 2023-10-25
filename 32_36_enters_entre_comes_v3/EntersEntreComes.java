/*
	A java program which shows any numbers the user wants separated by commas and whichever number the user desires
*/
public class EntersEntreComes {
    public static void main(String[] args) {
        int[] numeros;
        System.out.println("Quants?");
        int quants = Integer.parseInt(Entrada.readLine());
        if (quants < 1) {
        	System.out.println("Res a fer");
        } else {
        	numeros = new int[quants];
        	for (int i = 0; i < numeros.length; i++) {
        		System.out.println("Valor " + (i + 1) + "?");
        		numeros[i] = Integer.parseInt(Entrada.readLine());
        	}
        	System.out.print(numeros[0]);
        	for (int i = 1; i < numeros.length; i++) {
        		System.out.print(", " + numeros[i]);
        	}
        	System.out.println();
    	}
    }
}
