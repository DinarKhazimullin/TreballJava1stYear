/*
    A Java program that adds the user input numbers and the ones between them.
 */
public class SumaInterval {
    public static void main(String args[]) {
        int suma = 0;
        System.out.println("inici?");
        int valorInicial = Integer.parseInt(Entrada.readLine());
        System.out.println("final?");
        int valorFinal = Integer.parseInt(Entrada.readLine());
        if (valorInicial > valorFinal) {
            int tmp = valorInicial;
            valorInicial = valorFinal;
            valorFinal = tmp;
        }
        for (int i = valorInicial; i <= valorFinal; i++) {
            suma += i;
        }
        System.out.println(suma);
    }
}
