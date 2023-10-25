/*
    A java program that has information about a cat named Renat, this time adding three new functions which are responsible for taking away lives, giving only 1 and giving a number of lives.
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
    public boolean estaViu() {
        if (vides > 0) {
            return true;
        }
        return false;
    }
    public boolean estaDret() {
        if (posicio.equals("dret")) {
            return true;
        }
        return false;
    }
    public boolean estaAssegut() {
        if (posicio.equals("assegut")) {
            return true;
        }
        return false;
    }
    public boolean estaEstirat() {
        if (posicio.equals("estirat")) {
            return true;
        }
        return false;
    }
    public String aixecat() {
        String estat = "";
        if (!estaDret()) {
            estat = "m'aixeco";
            posicio = "dret";
        } else {
            estat = "no faig res";
        }
        return estat;
    }
    public String seu() {
        String estat = "";
        if (!estaAssegut()) {
            estat = "m'assec";
            posicio = "assegut";
        } else {
            estat = "no faig res";
        }
        return estat;
    }
    public String estirat() {
        String estat = "";
        if (!estaEstirat()) {
            estat = "m'estiro";
            posicio = "estirat";
        } else {
            estat = "no faig res";
        }
        return estat;
    }
    public String mor() {
        if ((getVides() - 1) < 0) {
            return "...";
        }
        setVides(getVides() - 1);
        if (getVides() == 0) {
            return "ximpún";
        }
        return "auch";
    }
    public String resuscita() {
        setVides(1);
        return "guai!";
    }
    public String resuscita(int videsExtern) {
        if (!estaViu()) {
            setVides(videsExtern);
            if (getVides() > 0) {
                return "guai!";
            }
        }
        return "...";
    }
}