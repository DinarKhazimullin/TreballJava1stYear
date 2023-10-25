/*
	A java program in which we ask for a sentence or a word, and 2 numbers, and then we show by screen the interval between both numbers of the sentence
*/
public class MostraInterval {
	public static void main(String[] args) {
		System.out.println("text?");
		String text = Entrada.readLine();
		System.out.println("inici?");
		int valorInicial = Integer.parseInt(Entrada.readLine());
		System.out.println("final?");
		int valorFinal = Integer.parseInt(Entrada.readLine());
		if (valorInicial < 0) {
			valorInicial = 0;
		} else if (valorFinal < 0) {
			valorFinal = 0;
		}
		mostraInterval(text, valorInicial, valorFinal);
	}
	
	public static void mostraInterval(String text, int inici, int fi) {
		if (inici > fi) {
			for (int i = inici; i >= fi; i--) {
				if (i >= 0 && i < text.length()) {
					System.out.println(text.charAt(i));
				}
			}
		} else {
			for (int i = inici; i <= fi; i++) {
				if (i < text.length() && i >= 0) {
					System.out.println(text.charAt(i));
				}
			}
		}
	}
}
