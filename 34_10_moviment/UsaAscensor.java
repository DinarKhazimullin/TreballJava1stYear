/*
    A java program that shows you the current state of an elevator, such as its current floor, initial position and final position
 */
public class UsaAscensor {
    public static void main(String args[]) {
        Ascensor ascensors = new Ascensor();
        System.out.println("Pis inicial: " + ascensors.pis);
        System.out.println("Moviment inicial: " + ascensors.moviment);
        ascensors.moviment = "pujant";
        System.out.println("Moviment final: " + ascensors.moviment);
    }
}
