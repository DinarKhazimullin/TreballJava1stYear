/*
    A java program that shows the numbers user input and the numbers between them.
 */
public class MostraInterval {
    public static void main(String args[]) {
        int operacio;
        System.out.println("inici?");
        int valorInicial = Integer.parseInt(Entrada.readLine());
        System.out.println("final?");
        int valorFinal = Integer.parseInt(Entrada.readLine());
        if (valorInicial > valorFinal) {
            operacio = -1;
        } else {
            operacio = 1;
        }
        for (int i = valorInicial; (i <= valorFinal) ^ (i >= valorFinal) ; i += operacio) {
            System.out.println(i);
        }
        System.out.println(valorFinal);
    }
}
