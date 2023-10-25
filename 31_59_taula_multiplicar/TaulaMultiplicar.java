/*
	A java program in which we make a personalized multiplication table
*/
public class TaulaMultiplicar {
	public static void main(String[] args) {
		int primerOperand = Integer.parseInt(args[0]);
		int segonOperand = Integer.parseInt(args[1]);
		int primerValor = Integer.parseInt(args[2]);
		int segonValor = Integer.parseInt(args[3]);
		if (primerOperand > segonOperand) {
			int tmp1 = primerOperand;
			primerOperand = segonOperand;
			segonOperand = tmp1;
		}
		if (primerValor > segonValor ) {
			int tmp1 = primerValor;
			primerValor = segonValor;
			segonValor = tmp1;
		}
		for (int operand = primerOperand; operand <= segonOperand; operand++) {
			for (int valor = primerValor; valor <= segonValor; valor++) {
				System.out.println(operand + " x " + valor + " = " + (operand * valor));
			}
		}
	}
}
