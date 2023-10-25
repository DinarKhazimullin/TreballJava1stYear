/*
	A java program that works as a "door" between the user and the application, letting us create, delete and search different wines that we can find inside our store.
*/
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
public class Entorn {
    private final Botiga botiga = new Botiga();
    public static void main(String[] args) throws IOException {
        Entorn entorn = new Entorn();
        mostraBenvinguda();
        entorn.carregaVins();
        while (true) {
            mostraPrompt();
            String comanda = Entrada.readLine().strip();
            if (comanda.isEmpty()) continue;
            if (comanda.equals("surt")) break;
            switch (comanda) {
                case "ajuda": mostraAjuda();
                             break;
                case "afegeix": entorn.processaAfegeix();
                           break;
                case "cerca": entorn.processaCerca();
                             break;
                case "modifica": entorn.processaModifica();
                            break;
                case "elimina": entorn.processaElimina();
                           break;
                default: mostraErrorComandaDesconeguda();
            }
        }
        entorn.guardaVins();
        mostraComiat();
    }
    
    public static void mostraBenvinguda() {
    	System.out.println("Celler La Bona Estrella. Escriviu ajuda per veure opcions.");
    }
    public static void mostraPrompt() {
    	System.out.print("botiga> ");
    }
    public static void mostraAjuda() {
    	System.out.printf("Comandes disponibles:%najuda%ncerca%nafegeix%nmodifica%nelimina%nsurt%n");
    }
    public void processaAfegeix() {
    	System.out.print("nom (enter cancel·la)> ");
                String nom = Entrada.readLine();
                Vi nouVi;
                int preuInt = 0;
                int estocInt = 0;
                if (!nom.isEmpty()) {
                    System.out.print("preu (en cèntims)> ");
                    String preu = Entrada.readLine();
                    if (!preu.isEmpty()) {
                  		if (UtilString.esEnter(preu)) {
                    		preuInt = Integer.parseInt(preu);
                    		if (preuInt < 0) {
                    			System.out.println("ERROR: el valor ha de ser un enter positiu");
                    			return;
                    		}
                    	}  
                    } else {
                    	preuInt = 0;
                    }
                    System.out.print("estoc (enter sense estoc)> ");
                    String estoc = Entrada.readLine();
                    if (!estoc.isEmpty()) {
                    	if (UtilString.esEnter(estoc)) {
		                	estocInt = Integer.parseInt(estoc);
		                	if (estocInt < 0) {
		                		System.out.println("ERROR: el valor ha de ser un enter positiu");
                    			return;
		                	}
		                }
		            } else {
		            	estocInt = 0;
		            }
		            nouVi = new Vi(nom, preuInt, estocInt);
                    Vi resposta = botiga.afegeix(nouVi);
                    if (resposta == null) {
                    	System.out.println("ERROR: no s'ha pogut afegir");
                   	} else {
                   		System.out.printf("Introduït:%s%n", resposta);
                   	}
                }
    }
    public void processaCerca() {
    	System.out.print("nom (enter cancel·la)> ");
    	String nom = Entrada.readLine();
    	if (nom.isEmpty()) {
    		return;
    	}
    	if (botiga.cerca(nom) != null) {
    		System.out.print("Trobat:");
    		System.out.println(botiga.cerca(nom));
    	} else {
    		System.out.println("No trobat");
    	}
    }
    public void processaModifica() {
    	int preuInt = 0;
    	int estocInt = 0; 
    	System.out.print("nom (enter cancel·la)> ");
    	String nom = Entrada.readLine();
    	if (nom.isEmpty()) {
    		return;
    	}
    	if (botiga.cerca(nom) != null) {
    		Vi viAModificar = botiga.cerca(nom);
    		System.out.print("preu (enter " + viAModificar.getPreu() + ")> ");
    		String preu = Entrada.readLine();
    		if (!preu.isEmpty()) {
    			if (UtilString.esEnter(preu)) {
    				preuInt = Integer.parseInt(preu);
    				if (preuInt < 0) {
    					System.out.println("ERROR: el valor ha de ser un enter positiu");
    					return;
    				}
    			}
    		} else {
    			preuInt = viAModificar.getPreu();
    		}
    		System.out.print("estoc (enter " + viAModificar.getEstoc() + ")> ");
    		String estoc = Entrada.readLine();
    		if (!estoc.isEmpty()) {
    			if (UtilString.esEnter(estoc)) {
    				estocInt = Integer.parseInt(estoc);
    				if (estocInt < 0) {
    					System.out.println("ERROR: el valor ha de ser un enter positiu");
    					return;
    				}
    			}
    		} else {
    			estocInt = viAModificar.getEstoc();
    		}
    		viAModificar.setPreu(preuInt);
    		viAModificar.setEstoc(estocInt);
    		System.out.print("Modificat:");
    		System.out.println(botiga.cerca(nom));
    	} else {
    		System.out.println("No trobat");
    	}
    }
    public void processaElimina() {
    	System.out.print("nom (enter cancel·la)> ");
    	String nom = Entrada.readLine();
    	if (nom.isEmpty()) {
    		return;
    	}
    	if (botiga.cerca(nom) == null) {
    		System.out.println("No trobat");
    		return;
    	}
    	System.out.println("A eliminar:");
    	System.out.println(botiga.cerca(nom));
    	System.out.print("Segur?> ");
    	String segur = Entrada.readLine();
    	if (UtilitatsConfirmacio.respostaABoolean(segur)) {
    		Vi resposta = botiga.elimina(nom);
    		if (resposta == null) {
    			System.out.println("ERROR: no s'ha pogut eliminar");
    		} else {
    			System.out.println("Eliminat");
    		}
    	} else {
    		System.out.println("No eliminat");
    	}
    }
    public static void mostraErrorComandaDesconeguda() {
    	System.out.println("ERROR: comanda no reconeguda. Escriviu help per ajuda");
    }
    public static void mostraComiat() {
    	System.out.println("adéu");
    }
    public void carregaVins() throws IOException {
    	int referencies = 0;
    	String cami = "botiga.csv";
    	File fitxer = new File(cami);
    	if (!fitxer.exists()) {
    		fitxer.createNewFile();
    		System.out.println("Referències llegides: " + referencies);
    		return;
    	}
    	BufferedReader input = new BufferedReader(new FileReader(fitxer));
    	while (true) {
    		String linea = input.readLine();
    		if (linea == null) break;
    		String[] viArray = linea.split(";");
    		if (viArray.length == 3) {
    			Vi vi = Vi.deArrayString(viArray);
    			if (vi != null) {
    				referencies++;
    				botiga.afegeix(vi);
    			}
    		}
    	}
    	input.close();
    	System.out.println("Referències llegides: " + referencies);
    }
    public void guardaVins() throws IOException {
    	int referencies = 0;
    	String cami = "botiga.csv";
    	File fitxer = new File(cami);
    	BufferedReader input = new BufferedReader(new FileReader(fitxer));
    	BufferedWriter sortida = new BufferedWriter(new FileWriter(fitxer));
    	botiga.iniciaRecorregut();
    	String linea = input.readLine();
		while (true) {
			Vi vi = botiga.getSeguent();
			if (vi == null) break;
			referencies++;
			String[] viArray = vi.aArrayString();
			String viCSV = String.join(";", viArray);
			if (linea != viCSV && linea != null) {
				sortida.write(linea);
				sortida.newLine();
			} else {
				sortida.write(viCSV);
				sortida.newLine();
			}
			if (linea != null) {
				linea = input.readLine();
			}
		}
		input.close();
		sortida.close();
		System.out.println("Referències guardades: " + referencies);
    }
}
