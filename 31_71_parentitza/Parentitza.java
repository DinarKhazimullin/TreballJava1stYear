/*
	A java program in which we input a sentence and it puts parentheses between each word
*/
public class Parentitza {
	public static void main (String[] args) {
		System.out.println("Text?");
		String text = Entrada.readLine();
		for (int i = 0; i < text.length(); i++) {
			if ((Character.isLetter(text.charAt(i))) || (Character.isLetter(text.charAt(i)))) {
				System.out.print("(" + text.charAt(i) + ")");
			} else if (i == text.length() - 1) {
				System.out.println(text.charAt(i));
			} else {
				System.out.print(text.charAt(i));
			}
		}
	}
}
