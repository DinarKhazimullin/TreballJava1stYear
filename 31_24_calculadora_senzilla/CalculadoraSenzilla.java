/*
	A java program that works as a basic calculator
*/
public class CalculadoraSenzilla {
    public static void main(String[] args) {
		System.out.println("Operand1?");
		double operandPrimer = Double.parseDouble(Entrada.readLine());
		System.out.println("Operador?");
		char operador = Entrada.readLine().charAt(0);
		System.out.println("Operand2?");
		double operandSegon = Double.parseDouble(Entrada.readLine());
        boolean error = false;
        double resultat = 0;
		if (operador == '+') {
		    resultat = operandPrimer + operandSegon;
		} else if (operador == '-') {
		    resultat = operandPrimer - operandSegon;
		} else if (operador == '*') {
		    resultat = operandPrimer * operandSegon;
		} else if (operador == '/') {
			if ((operandPrimer == 0) || (operandSegon == 0)) {
			    System.out.println("No es pot dividir entre 0");
                error = true;
			} else {
			    resultat = operandPrimer / operandSegon;
			}	
		} else {
		    System.out.println("L'operador " + operador + " no està disponible");
            error = true;
		}
		if (!error) {
            System.out.println(operandPrimer + " " + operador + " " + operandSegon + " = " + resultat);
        }
	}
}
