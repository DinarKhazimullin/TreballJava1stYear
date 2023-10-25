/*
	A java program in which we create a basic user input list, and do some experiments to see how it works.
*/
import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;

public class UsaList {
    public static void main(String[] args) {
        List<String> llista;
        llista = new ArrayList<String>();
        
        System.out.println("Obtenim les entrades");
        System.out.println("====================");
        String valor;

        valor = Entrada.readLine();

        llista.add(valor);


        valor = Entrada.readLine();

        llista.add(valor);


        valor = Entrada.readLine();

        llista.add(valor);



        System.out.println("Cerquem elements de la llista");
        System.out.println("=============================");
        String text = Entrada.readLine();

        boolean esTroba;
        if (llista.contains(text)) {
        	esTroba = true;
        } else {
        	esTroba = false;
        }

        System.out.printf("El text %s és troba a la llista: %s%n", text, esTroba);

        int indexPrimerOcurrencia;
        if (esTroba) {
		    indexPrimerOcurrencia = llista.indexOf(text);
		    if (indexPrimerOcurrencia == 0) {
		    	indexPrimerOcurrencia = 2;
		    } else if (indexPrimerOcurrencia == 1) {
		    	indexPrimerOcurrencia = 0;
		    } else {
		    	indexPrimerOcurrencia = 1;
		    }
		    llista.remove(llista.indexOf(text));
		    llista.add(indexPrimerOcurrencia, text);
		    
		    if (llista.get(1).length() < llista.get(2).length()) {
			   	llista.add(llista.get(1));
			   	llista.remove(1);
			}
        } else {
        	indexPrimerOcurrencia = -1;
        	llista.add(llista.get(0));
        	llista.remove(0);
        }
		    
        System.out.printf("Posició de %s a la llista: %s%n", text, indexPrimerOcurrencia);


        System.out.println("Mostrem les entrades introduïdes");
        System.out.println("================================");
        boolean llistaBuida;
        if (llista.isEmpty()) {
        	llistaBuida = true;
        } else {
        	llistaBuida = false;
        }

        while (! llistaBuida) {
            String entrada;
            
            entrada = llista.get(0);

            System.out.println(entrada);
            llista.remove(0);

            if (llista.isEmpty()) {
		    	llistaBuida = true;
		    } else {
		    	llistaBuida = false;
		    }

        }
    }
}
