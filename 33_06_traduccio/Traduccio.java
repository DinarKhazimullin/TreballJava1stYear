/*
	A java program which "translates" the origin text with the words provided into a dot txt file that has everything changed.
*/
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class Traduccio {
	public static void main(String[] args) throws IOException {
		if (args.length == 3) {
			String origin = args[0];
			String traduccio = args[1];
			String destinacio = args[2];
			tradueix(origin, traduccio, destinacio);
		} else {
			System.out.println("ERROR: Cal especificar els fitxers origen, traduccio i destinació");
		}
	}
	public static void tradueix(String fitxerOrigin, String fitxerTraduccio, String fitxerDestinacio) throws IOException {
		BufferedReader input = new BufferedReader(new FileReader(fitxerOrigin));
		BufferedWriter output = new BufferedWriter(new FileWriter(fitxerDestinacio));
		String[] elements;
		while (true) {
			String linia = input.readLine();
			if (linia == null) {
				break;
			}
			output.write(tradueixLinia(linia, fitxerTraduccio));
			output.newLine();
		}
		input.close();
		output.close();
	}
	public static String tradueixLinia(String linia, String fitxerTraduccio) throws IOException {
		String traduida = linia;
		String clau = "";
		BufferedReader input = new BufferedReader(new FileReader(fitxerTraduccio));
		while (true) {
			String liniaTraduccio = input.readLine();
			if (liniaTraduccio == null) {
				break;
			}
			String[] aTraduir = liniaTraduccio.split(",");
			if (!clau.equals(aTraduir[0])) {
				traduida = traduida.replace(aTraduir[0], aTraduir[1].strip());
			}
			clau = aTraduir[0];
		}
		
		
		return traduida;
	}
}
