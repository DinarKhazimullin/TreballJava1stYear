/*
	A java program that gives information about a cat named Renat, this time we can change the code so that the number of lives and the position is one we desire.
*/
public class GatRenat {
    private int vides;
    private String posicio;
    public GatRenat (int novesVides, String novaPosicio) {
        vides = novesVides;
        posicio = novaPosicio;
    }
    public int getVides() { return vides; }
    public String getPosicio() { return posicio; }
    @Override
    public String toString() {
        return String.format("Vides: %d. Posició: %s", vides, posicio);
    }
    public static void main(String[] args) {
        System.out.println(new GatRenat(7, "estirat"));
    }
}