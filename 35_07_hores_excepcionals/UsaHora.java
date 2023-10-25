/*
	An application that uses the class "Hora" and makes an instance of it. Plus, it is made for testing java exceptions
*/
public class UsaHora {
    private static void canviaHora(Hora hora, int hores, int minuts, int segons) throws Exception {
        try {
        	hora.setHores(hores);
        	hora.setMinuts(minuts);
        	hora.setSegons(segons);
        } catch (Exception e) {
        	System.out.println(e);
        }
    }
    public static void main(String[] args) throws Exception {
        Hora hora = new Hora();
        System.out.println("Inicialment " + hora);
        System.out.println("Si intentem assignar a hores un -1");
        canviaHora(hora, -1, hora.getMinuts(), hora.getSegons());
        System.out.println("El valor resultant és " + hora);
        System.out.println();

        System.out.println("Si intentem assignar a minuts un -1");
        canviaHora(hora, hora.getHores(), -1, hora.getSegons());
        System.out.println("El valor resultant és " + hora);
        System.out.println();

        System.out.println("Si intentem assignar a segons un -1");
        canviaHora(hora, hora.getHores(), hora.getMinuts(), -1);
        System.out.println("El valor resultant és " + hora);
        System.out.println();
    }
}
