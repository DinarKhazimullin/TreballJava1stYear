/*
    A java program that counts and jumps user inputed numbers
 */
public class EntersIniciFi {
    public static void main(String args[]) {
        System.out.println("Valor inicial?");
        int valorInicial = Integer.parseInt(Entrada.readLine());
        System.out.println("Valor final?");
        int valorFinal = Integer.parseInt(Entrada.readLine());
        System.out.println("Salt?");
        int salt = Integer.parseInt(Entrada.readLine());
        for (int i = valorInicial; i <= valorFinal; i += salt) {
            System.out.println(i);
        }
    }
}
