/*
    A Java program in which we ask for the user age and current year, and calculate their age in past years.
 */
public class HistoricEdats {
    public static void main(String args[]) {
        boolean error = false;
        int anyNaixement = 0;
        System.out.println("El vostre nom?");
        String nom = Entrada.readLine();
        System.out.println("La vostra edat?");
        int edat = Integer.parseInt(Entrada.readLine());
        System.out.println("L'any actual?");
        int any = Integer.parseInt(Entrada.readLine());
        if (nom.equals("")) {
            error = true;
        }
        if (edat < 0) {
            error = true;
        }
        if (any < 1971) {
            error = true;
        }
        if (error) {
            System.out.println("Entrada incorrecta");
        } else if (edat != 0) {
            anyNaixement = any - edat;
            System.out.println("El " + anyNaixement + " vau néixer");
            for (int i = 1; i < edat; i++) {
                anyNaixement++;
                if (i == 1){
                    System.out.println("El " + anyNaixement + " teníeu " + i + " any");
                } else {
                    System.out.println("El " + anyNaixement + " teníeu " + i + " anys");
                }
            }
        }
        if (!error) {
            System.out.println("Adéu " + nom);
        }    
    }
}
