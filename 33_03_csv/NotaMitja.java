/*
	A java program in which we take a csv file, which is about student's grades, and make for each of them their average grade score.
*/
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class NotaMitja {
	public static void main(String[] args) throws IOException {
		int nota = 0;
		String notes = "notes.csv";
		String[] elements;
		BufferedReader input = new BufferedReader(new FileReader(notes));
		String linia = input.readLine();
		if ((linia = input.readLine()) == null) {
			System.out.println("Cap entrada");
		}
		while (true) {
			nota = 0;
			if (linia == null) {
				break;
			}
			elements = linia.split(",");
			for (int i = 1; i < elements.length; i++) {
				if (Character.isDigit(elements[i].charAt(0))) {
					nota += Integer.parseInt(elements[i]);
				}
			}
			System.out.printf("%s (%.2f)%n", elements[0], (nota/6.0));
			linia = input.readLine();
		}
		input.close();
	}
}
