/*
	A java program in which we classify different car licence plates depending if they're valid or not
*/
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class ClassificaMatricules {
	public static void main(String[] args) throws IOException {
		String cami = "llegides.txt";
		String valid = "italianes.txt";
		String desconegut = "desconegudes.txt";
		BufferedReader input = new BufferedReader(new FileReader(cami));
		BufferedWriter outputTrue = new BufferedWriter(new FileWriter(valid));
		BufferedWriter outputFalse = new BufferedWriter(new FileWriter(desconegut));
		while (true) {
			String linia = input.readLine();
			if (linia == null) {
				break;
			}
			boolean matriculaValid = matriculaItalianaValida(linia.strip());
			if (matriculaValid) {
				outputTrue.write(linia.strip());
				outputTrue.newLine();
			} else {
				if (!linia.isEmpty()) {
					outputFalse.write(linia.strip());
					outputFalse.newLine();
				}
			}
		}
		input.close();
		outputTrue.close();
		outputFalse.close();
	}
	
	public static boolean matriculaItalianaValida(String matricula) {
		boolean print = true;
		if (matricula.equals(matricula.toUpperCase()) && ((matricula.length() - 1) == 6)) {
			for (int pos = 0; pos < 7; pos++) {
				if (!print) {
					break;
				}
				if (pos < 2 || pos > 4) {
					print = esLletraValidaPerMatriculaItaliana(matricula.charAt(pos));
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
		return print;
	}
	
	public static boolean esLletraValidaPerMatriculaItaliana(char caracter) {
		String lletresConfusio = "IOQU";
		if (caracter >= 'A' && caracter <= 'Z') {
			for (int posConfusio = 0; posConfusio < 4; posConfusio++) {
				if (caracter == lletresConfusio.charAt(posConfusio)) {
					return false;
				} 
			}
		} else {
			return false;
		}
		return true;
	}
}
