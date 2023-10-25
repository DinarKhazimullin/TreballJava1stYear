/*
    A java program that shows us the initial position and movement of an evelator, which later you can change, but in a certain range.
 */
public class UsaAscensor {
    public static void main(String[] args) {
        Ascensor ascensors = new Ascensor();
        System.out.println("Pis inicial: " + ascensors.getPis());
        System.out.println("Moviment inicial: " + ascensors.getMoviment());
        System.out.println("Introdueix nou pis:");
        String entrada = Entrada.readLine();
        boolean valid = true;
        for(int i = 0; i < entrada.length(); i++) {
            if (!Character.isDigit(entrada.charAt(i))) {
                valid = false;
            }
        }
        if (valid) {
            ascensors.setPis(Integer.parseInt(entrada));
        }
        System.out.println("Introdueix nou moviment:");
        ascensors.setMoviment(Entrada.readLine());
        System.out.println("Pis final: " + ascensors.getPis());
        System.out.println("Moviment final: " + ascensors.getMoviment());
    }
}