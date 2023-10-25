/*
	A java game of the hanged man, where the user must input letters to guess the whole word. If he fails, the hanged man gets drawn further and further until he "dies".
*/
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Penjat {
	public static void main(String[] args) throws IOException {
		String comptador = "";
		int paraulesJugades = 0;
		int paraulesEncertades = 0;
		int paraulesFallades = 0;
		int paraulesCancelades = 0;
		String paraules = "paraules.txt";
		String escriptura = "";
		String entrada = "";
		String utilitzats = "cap";
		int intents = 10;
		String paraulaCriptada;
		
		BufferedReader input = new BufferedReader(new FileReader(paraules));
		String paraula = input.readLine();
		if (paraula == null) {
			System.out.println("No tinc paraules per jugar");
		} else {
			System.out.println("Comencem a jugar");
			while (true) {
				paraulaCriptada = inicialitzacioParaula(paraula, utilitzats);
				if (paraula.equals(paraulaCriptada) || paraula.equals(entrada)) {
					paraulesJugades++;
					paraulesEncertades++;
					System.out.printf("Has encertat! La paraula era %s", paraula);
					System.out.println();
					utilitzats = "cap";
					intents = 10;
					entrada = "";
					paraula = input.readLine();
					if (paraula == null) {
						System.out.println("No queden més paraules");
						break;
					}
					paraulaCriptada = inicialitzacioParaula(paraula, utilitzats);
				}
				if (paraulaCriptada.equals(comptador)) {
					intents--;
					mostraFigura(intents);
				}
				if (intents == 0) {
					System.out.println("Has mort");
					paraulesFallades++;
					paraulesJugades++;
					utilitzats = "cap";
					intents = 10;
					entrada = "";
					paraula = input.readLine();
					paraulaCriptada = inicialitzacioParaula(paraula, utilitzats);
				}
				System.out.println("Paraula: " + paraulaCriptada);
				formatacio(utilitzats);
				System.out.println("Intents disponibles: " + intents);
				System.out.println("Introdueix una lletra");
				escriptura = Entrada.readLine();
				entrada = escriptura.toLowerCase();
				if (entrada.equals("prou")) {
					System.out.println("Vols finalitzar?");
					if (UtilitatsConfirmacio.respostaABoolean(Entrada.readLine())) {
						paraulesCancelades++;
						paraulesJugades++;
						paraula = input.readLine();
						break;
					}
					comptador = "final";
				} else if (entrada.equals("glups")) {
					paraulesCancelades++;
					paraulesJugades++;
					utilitzats = "cap";
					intents = 10;
					entrada = "";
					paraula = input.readLine();
					if (paraula == null) {
						System.out.println("No queden més paraules");
						break;
					}
				} else if (entrada.equals(paraula)) {
					paraulaCriptada = paraula;
				} else if (entrada.isEmpty() || (entrada.charAt(0) < 'a' || entrada.charAt(0) > 'z') || entrada.length() > 1) {
					System.out.println("Error: cal una lletra entre 'a' i 'z', 'prou' o 'glups'");
					comptador = "error";
				} else {
					if (utilitzats.equals("cap")) {
						utilitzats = "" + entrada.charAt(0);
						comptador = paraulaCriptada;
					} else {
						for (int i = 0; i < utilitzats.length(); i++) {
							if (entrada.charAt(0) == utilitzats.charAt(i)) {
								System.out.println("La lletra ja ha estat utilitzada");
								comptador = "utilitzat";
								break;
							} else {
								comptador = paraulaCriptada;
							}
						}
						if (!comptador.equals("utilitzat")) {
							utilitzats = utilitzats + entrada.charAt(0);
							comptador = paraulaCriptada;
						}
					}
				}
				if (paraula == null) {
					System.out.println("No queden més paraules");
					break;
				}
			}			
			input.close();
			System.out.println("Paraules jugades: " + paraulesJugades);
			System.out.println("Paraules encertades: " + paraulesEncertades);
			System.out.println("Paraules fallades: " + paraulesFallades);
			System.out.println("Paraules cancel·lades: " + paraulesCancelades);
			System.out.println("Espero que t'hagis divertit");	
		}
	}
	
	public static void formatacio(String utilitzats) {
		String format = "";
		if (utilitzats.equals("cap")) {
			System.out.println("Utilitzades: " + utilitzats);
		} else if (utilitzats.length() == 1) {
			format+= Character.toUpperCase(utilitzats.charAt(0));
			System.out.println("Utilitzades: " + format);
		} else {
			for (int i = 0; i <= utilitzats.length() - 2; i++) {
				if (i == utilitzats.length() - 2) {
					format+= Character.toUpperCase(utilitzats.charAt(i));
				} else {
					format+= Character.toUpperCase(utilitzats.charAt(i)) + ", ";
				}
			}
			format+= " i " + Character.toUpperCase(utilitzats.charAt(utilitzats.length() -1));
			System.out.println("Utilitzades: " + format);
		}
	}
	
	public static String inicialitzacioParaula(String paraula, String utilitzats) {
		boolean print = false;
		String paraulaCriptada = "";
		for (int i = 0; i < paraula.length(); i++) {
			for (int j = 0; j < utilitzats.length(); j++) {
				if (paraula.charAt(i) == utilitzats.charAt(j) && !utilitzats.equals("cap")) {
					print = true;
				} 
			}
			if (print) {
				paraulaCriptada += paraula.charAt(i);
			} else {
				paraulaCriptada += "*";
			}
			print = false;
		}
		return paraulaCriptada;
	}
	public static void mostraFigura(int intentsDisponibles) throws IOException {
		String numero = (9 - intentsDisponibles) + "";
		String cami = "recursos/figura" + numero + ".txt";
		BufferedReader input = new BufferedReader(new FileReader(cami));
		while (true) {
			String linia = input.readLine();
			if (linia == null) {
				break;
			}
			System.out.println(linia);
		}
	}
}
