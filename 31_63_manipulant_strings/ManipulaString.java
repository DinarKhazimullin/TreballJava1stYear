/*
	A java program in which we show different string manipulations 
 */
public class ManipulaString {
    public static void main(String[] args){
        System.out.println("Paraula?");
        String paraula = Entrada.readLine();
        if (paraula.length() == 1) {
        	System.out.println("La longitud és " + paraula.length());
        	System.out.println("La darrera lletra és '" + paraula.charAt((paraula.length())-1) + "'");
        	System.out.println("La paraula en majúscules és \"" + paraula.toUpperCase() + "\"");
        } else {
        	// Mostra la longitud de la paraula (quantes lletres conté)
        	System.out.println("La longitud és " + paraula.length());
        	
        	// Mostra la segona lletra de la paraula
        	System.out.println("La segona lletra és '" + paraula.charAt(1) + "'");
        	
        	// Mostra la darrera lletra de la paraula
        	System.out.println("La darrera lletra és '" + paraula.charAt((paraula.length())-1) + "'");
        	
        	// Mostra la penúltima lletra de la paraula
        	System.out.println("La penúltima lletra és '" + paraula.charAt((paraula.length())-2) + "'");
        	
        	// Mostra la paraula amb totes les lletres en majúscules
        	System.out.println("La paraula en majúscules és \"" + paraula.toUpperCase() + "\"");
        	
        	// Una composició formada per la primera lletra de la paraula en
        	// majúscules, seguida de les següents tres lletres en minúscules. Per
        	// exemple, si la paraula és «nEkAnE», resultatà en «Neka».
        	System.out.print("La composició de quatre primeres és \"");
        	System.out.print(Character.toUpperCase(paraula.charAt(0)));
        	for (int i = 1; i < 4; i++) {
        		if (i == paraula.length()) {
        			i = 4;
        		} else {
        			System.out.print(Character.toLowerCase(paraula.charAt(i)));
        		}
        	}
        	System.out.println("\"");
        	
        	// Mostra una composició formada per la darrera lletra de la paraula,
        	// seguida de les tres primeres. (ex. si la paraula és «Nekane»
        	// mostrarà «eNek»)
        	System.out.print("La composició de quatre és \"");
        	System.out.print(paraula.charAt(paraula.length() - 1));
        	for (int i = 1; i < 4; i++) {
        		if (i == paraula.length()) {
        			i = 3;
        		} else {
        			System.out.print(paraula.charAt(i-1));
        		}
        	}
        	System.out.println("\"");
        	
        	// Com en el cas anterior però ara corregint les majúscules i
        	// minúscules de manera que la primera sigui majúscules i la resta en
        	// minúscules.  (ex. si la paraula és «Nekane» mostrarà «Enek»)
        	System.out.print("La composició de quatre corregint majúscules és \"");
        	System.out.print(Character.toUpperCase(paraula.charAt(paraula.length() - 1)));
        	for (int i = 1; i < 4; i++) {
        		if (i == paraula.length()) {
        			i = 3;
        		} else {
        				System.out.print(Character.toLowerCase(paraula.charAt(i-1)));
        			}
        		}
        	System.out.println("\""); 
    	}
    }
}
