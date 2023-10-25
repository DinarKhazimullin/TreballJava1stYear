/*
	A java program which shows 5 numbers separated by commas and whichever the user desires
*/
public class EntersEntreComes {
    public static void main(String[] args) {
        int[] numeros;
        numeros = new int[5];
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
