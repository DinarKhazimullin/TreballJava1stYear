/*
	A java program in which we validate the user input license plate, with only Italian standard.
*/
public class MatriculaValida {
	public static void main (String[] args) {
		String lletresConfusio = "IOQU";
		String caractersEspecials = "ÇÀÑß";
		System.out.println("Introduïu una matrícula");
		String matricula = Entrada.readLine();
		boolean print = true;
		if (matricula.equals(matricula.toUpperCase()) && ((matricula.length() - 1) == 6)) {
			for (int pos = 0; pos < 7; pos++) {
				if (pos < 2 || pos > 4) {
					if (Character.isLetter(matricula.charAt(pos))) {
						for (int posConfusio = 0; posConfusio < 4; posConfusio++) {
							if ((matricula.charAt(pos) == lletresConfusio.charAt(posConfusio)) || (matricula.charAt(pos) == caractersEspecials.charAt(posConfusio))) {
								print = false;
							} 
						}
					} else {
						print = false;
					}
				}
				if (pos > 1 && pos < 5) {
					if (!Character.isDigit(matricula.charAt(pos))) {
						print = false;
					}
				}	
			}
		} else {
			print = false;
		}
		if (print) {
			System.out.println("És una matrícula italiana vàlida");
		} else {
			System.out.println("No és una matrícula italiana vàlida");
		} 
	}
}
