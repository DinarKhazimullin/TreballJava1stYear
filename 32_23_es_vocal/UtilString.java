/*
	A java program which checks if a character is a vowel or not
*/
public class UtilString {
	public static boolean esVocal(char vocal) {
		String vocals = "aeiouàèéíïòóúiü";
		vocal = Character.toLowerCase(vocal);
		for (int i = 0; i < vocals.length(); i++) {
			if (vocal == vocals.charAt(i)) {
				return true;
			}
		}
		return false;
	}
}
