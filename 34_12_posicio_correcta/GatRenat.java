/*
    A java program that stores information about a cat named Renat, where we have 2 private variables named lifes and position, and their respective setters and getters
 */
public class GatRenat {
    private int vides = 7;
    private String posicio = "estirat";
    public int getVides() {
        return vides;
    }
    public void setVides(int novesVides) {
        if (novesVides >= 0) {
            vides = novesVides;
        }
    }
    public String getPosicio() {
        return posicio;
    }
    public void setPosicio(String entrada) {
        if (entrada.equals("dret") || entrada.equals("assegut") || entrada.equals("estirat")) {
            posicio = entrada;
        }
    }
}