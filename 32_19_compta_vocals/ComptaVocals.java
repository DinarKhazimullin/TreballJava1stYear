/*
	A java program in which we count the number of catalan vowerls of a user input phrase or word.
*/
public class ComptaVocals {
    public static void main(String[] args) {
        System.out.println("Introdueix un text");
        String text = Entrada.readLine();
       	String vocals = "aàeèéiíïoóòuúü";
       	for (int i = 0; i < vocals.length(); i++) {
       		int numLletres = quantesOcurrencies(text, vocals.charAt(i));
       		mostraOcurrencies(vocals.charAt(i), numLletres);
       	}
    }
    public static void mostraOcurrencies(char lletra, int quantes) {
        System.out.println("Nombre de '" + lletra + "'s: " + quantes);
    }
    public static int quantesOcurrencies(String text, char lletra) {
        int comptador = 0;
        for (int i=0; i < text.length(); i++) {
            if (text.charAt(i) == lletra) {
                comptador += 1;
            }
        }
        return comptador;
    }
}
