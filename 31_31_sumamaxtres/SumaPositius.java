/*
	A java program that adds tree numbers
*/
public class SumaPositius {
    public static void main(String[] args) {
        int suma = 0;
        int valor;
        System.out.println("Introdueix el primer valor");
        valor = Integer.parseInt(Entrada.readLine());
        if (valor >= 0) {
            suma = suma + valor;
        	System.out.println("Introdueix el segon valor");
        	valor = Integer.parseInt(Entrada.readLine());
        	if (valor >= 0) {
        	    suma = suma + valor;
        		System.out.println("Introdueix el tercer valor");
        		valor = Integer.parseInt(Entrada.readLine());
        		if (valor >= 0) {
        		    suma = suma + valor;
        		}
        	}
        }
        System.out.println("La suma és " + suma);
    }
}
