/*
    A java program that shows us the initial information about the cat named Renat such as its lifes and position, which you later can change to another one if its valid.
 */
public class UsaGatRenat {
    public static void main(String args[]) {
        GatRenat renat = new GatRenat();
        System.out.println("Vides inicials: " + renat.getVides());
        System.out.println("Posició inicial: " + renat.getPosicio());
        System.out.println("Introdueix nova posició:");
        renat.setPosicio(Entrada.readLine());
        System.out.println("Posició final: " + renat.getPosicio());
    }
}
