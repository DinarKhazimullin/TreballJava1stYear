/*
Aquest programa es una calculadora basica on demana 2 numeros y fa totes les operacions basiques (suma resta multiplicacio divisio)
*/
public class CalculadoraBasica {
	public static void main(String[] args) {
		System.out.println("Primer operand:");
        int primerOperand = Integer.parseInt(Entrada.readLine());
        System.out.println("Segon operand:");
        int segonOperand = Integer.parseInt(Entrada.readLine());
        
        int suma = primerOperand + segonOperand;
        int resta = primerOperand - segonOperand;
        int multiplicacio = primerOperand * segonOperand;
        int divisio = primerOperand / segonOperand;
        
        System.out.println(primerOperand + " + " + segonOperand + " = " + suma);
        System.out.println(primerOperand + " - " + segonOperand + " = " + resta);
		System.out.println(primerOperand + " * " + segonOperand + " = " + multiplicacio);
		System.out.println(primerOperand + " / " + segonOperand + " = " + divisio);
	}
}
