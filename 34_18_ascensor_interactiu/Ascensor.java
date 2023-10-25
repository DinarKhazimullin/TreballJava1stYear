/*
    A java program that has information about an elevator, this time adding information about diferent states of its position and movement.
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
    public boolean estaAbaix() {
        if (pis == -1) {
            return true;
        }
        return false;
    }
    public boolean estaAmunt() {
        if (pis == 10) {
            return true;
        }
        return false;
    }
    public boolean estaAturat() {
        if (moviment.equals("aturat")) {
            return true;
        }
        return false;
    }
    public boolean estaMovent() {
        if (moviment.equals("pujant") || moviment.equals("baixant")) {
            return true;
        }
        return false;
    }
    public boolean estaPujant() {
        if (moviment.equals("pujant")) {
            return true;
        }
        return false;
    }
    public boolean estaBaixant() {
        if (moviment.equals("baixant")) {
            return true;
        }
        return false;
    }
    public String comEsta() {
        String estatus = "";
        if (estaPujant()) {
            estatus += "pujant";
        } else if (estaBaixant()) {
            estatus += "baixant";
        } else {
            estatus += "aturat";
        }
        estatus += " al pis " + pis;
        return estatus;
    }
    public boolean aturat() {
        if (estaAturat()) {
            return false;
        }
        moviment = "aturat";
        return true;
    }
    public boolean arrencaAmunt() {
        if (estaAturat()) {
            moviment = "pujant";
            return true;
        }
        return false;
    }
    public boolean arrencaAbaix() {
        if (estaAturat()) {
            moviment = "baixant";
            return true;
        }
        return false;
    }
    public int seguentPis() {
        if (!estaAturat()) {
            if (estaPujant()) {
                if (getPis() + 1 == 11) {
                    setPis(getPis() - 1);
                    aturat();
                    arrencaAbaix();
                    return getPis();
                }
                setPis(getPis() + 1);
            } else if (estaBaixant()) {
                if (getPis() - 1 == -2) {
                    setPis(getPis() + 1);
                    aturat();
                    arrencaAmunt();
                    return getPis();
                }
                setPis(getPis() - 1);
            }
        }
        return getPis();
    }
}
