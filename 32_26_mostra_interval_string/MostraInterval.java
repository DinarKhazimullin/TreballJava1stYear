/*
	A java program in which the user inputs a word or a phrase and then two digits. After that, we show the words between these two digits, relative to their position
*/
public class MostraInterval {
	public static void main (String[] args) {
		System.out.println("text?");
		String text = Entrada.readLine();
		System.out.println("inici?");
		int vInici = Integer.parseInt(Entrada.readLine());
		System.out.println("final?");
		int vFinal = Integer.parseInt(Entrada.readLine());
		String textInterval = UtilString.intervalString(text, vInici, vFinal);
		System.out.println(textInterval);
	}
}
