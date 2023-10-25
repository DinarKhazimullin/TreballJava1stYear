/*
    A java program in which our program takes randomly generated number, in this case 42 for simplification purposes, and we need to guess it.
 */
public class EndevinaNombre {
    public static void main(String args[]) {
        int valor = 0;
        int numero = 42;
        System.out.println("Ves introduint enters entre 1 i 100 fins que encertis el que jo he pensat");
        while(valor != numero){
            System.out.println("Introdueix un valor");
            valor = Integer.parseInt(Entrada.readLine());
            
            if (valor <= 0) {
                System.out.println("Com a mínim 1");
            } else if (valor > 100) {
                System.out.println("Com a màxim 100");
            } else if (valor < numero) {
                System.out.println("És més gran que " + valor);
            } else if (valor > numero) {
                System.out.println("És més petit que " + valor);
            } else {
                System.out.println("Has encertat!");
            }
        }
    }
}
