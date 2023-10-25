/*
	A java program that contains information about an elevator, where you can change its movement and floor number.
 */
public class Ascensor {
    private int pis = -1;
    private String moviment = "aturat";
    public int getPis() {
        return pis;
    }
    public void setPis(int nouPis) {
        if (nouPis >= -1 && nouPis <= 10) {
            pis = nouPis;
        }
    }
    public String getMoviment() {
        return moviment;
    }
    public void setMoviment(String entrada) {
        if (entrada.equals("aturat") || entrada.equals("pujant") || entrada.equals("baixant")) {
            moviment = entrada;
        }
    }
}
