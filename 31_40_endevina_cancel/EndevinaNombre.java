/*
    A java program in which our program takes randomly generated number, in this case 42 for simplification purposes, and we need to guess it.
 */
public class EndevinaNombre {
    public static void main(String args[]) {
        String valor = "0";
        String numero = "42";
        System.out.println("Ves introduint enters entre 1 i 100 fins que encertis el que jo he pensat");
        while(!valor.equals(numero)){
            System.out.println("Introdueix un valor");
            valor = Entrada.readLine();
            if (!valor.equals("")) {
                int valorInt = Integer.parseInt(valor);
                int numeroInt = Integer.parseInt(numero);
                if (valorInt <= 0) {
                    System.out.println("Com a mínim 1");
                } else if (valorInt > 100) {
                    System.out.println("Com a màxim 100");
                } else if (valorInt < numeroInt) {
                    System.out.println("És més gran que " + valor);
                } else if (valorInt > numeroInt) {
                    System.out.println("És més petit que " + valor);   
                } else {
                    System.out.println("Has encertat!");
                }
            } else {
                valor = "42";
                System.out.println("Cancel·lat!");
            }
        }
    }
}
