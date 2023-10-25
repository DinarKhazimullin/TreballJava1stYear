/*
	A java program equal in functionality as the one done previous about a parrot repeating the user input word only if it starts or ends by a catalan vowel, but this time with a dot txt file instead of user input.
*/
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class FitxerVocalIniciFi {
	public static void main(String[] args) throws IOException {
		String paraules = "frases.txt";
		BufferedReader input = new BufferedReader(new FileReader(paraules));
		String paraula = input.readLine();
		if (paraula != null) {
			while (true) {
				if (UtilString.esVocal(paraula.charAt(0)) || UtilString.esVocal(paraula.charAt(paraula.length() - 1))) {
					System.out.println(paraula);
				}
				paraula = input.readLine();
				if (paraula == null) {
					break;			
				}
			}
			input.close();
		}
	}
}
