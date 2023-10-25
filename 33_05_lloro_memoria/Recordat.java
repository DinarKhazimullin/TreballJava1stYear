/*
 * A java program in which we write words or frases to a parrot which will store this lines and at the end of the program, will print them
 */
// XXX aquí tots els imports. N'hi ha 5!
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class Recordat {
    public static void main(String[] args) throws IOException {
        String cami = "records.txt";
        processaEntrada(cami);
        System.out.println("D'acord");
        mostraRecords(cami);
    }

    /**
     * Demana frases per entrada estàndard i les guarda a un fitxer
     * @param nomFitxer: nom del fitxer
     */
    public static void processaEntrada(final String nomFitxer) throws IOException {
    	String entrada;	
    	BufferedWriter sortida = new BufferedWriter(new FileWriter(nomFitxer));
    	do {
	    	System.out.println("El lloro pregunta paraula:");
	    	entrada = Entrada.readLine();
	    	if (!entrada.isEmpty()) {
	    		sortida.write(entrada.strip());
	    		sortida.newLine();
	    		System.out.println("El lloro registra: " + entrada.strip());
	    	}
    	} while (!entrada.isEmpty());
    	sortida.close();
       
    }

    /**
     * Mostra el contingut del fitxer amb nom nomFitxer
     * @param nomFitxer: el nom del fitxer del que es mostrarà el contingut
     */
    public static void mostraRecords(final String nomFitxer) throws IOException {
    	BufferedReader input = new BufferedReader(new FileReader(nomFitxer));
    	String linia = input.readLine();
    	if (linia == null) {
    		System.out.println("El lloro no recorda res");
    	} else {
    		while (true) {
    			if (linia == null) {
    				break;
    			}
	    		System.out.println("El lloro recorda: " + linia);
   		 		linia = input.readLine();
    		}
    	}
    	System.out.println("Adéu");
    	input.close();
    }

}
