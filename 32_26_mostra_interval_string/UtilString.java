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
	public static String nomesLletres(String text) {
		String lletres = "";
		for (int i = 0; i < text.length(); i++) {
			if (Character.isLetter(text.charAt(i))) {
				lletres = lletres + text.charAt(i);
			}
		}
		return lletres;
	}
	public static String lletresSeparades(String lletres) {
		String lletresSeparades = "";
		for (int i = 0; i < lletres.length(); i++) {
			if (i == 0) {
				lletresSeparades = lletresSeparades + lletres.charAt(i);
			} else {
				lletresSeparades = lletresSeparades + ", " + lletres.charAt(i);
			}
		}
		return lletresSeparades;
	}
	
	public static String intervalString(String text, int vInici, int vFinal) {
		String textInterval = "";
		if (vInici < 0 && vFinal < 0) {
			textInterval = textInterval + text.charAt(0);
		} else if (vInici > vFinal) {
			for (int i = vInici; i >= vFinal; i--) {
				if (i >= 0 && i < text.length()) {
					textInterval = textInterval + text.charAt(i);
				}
			}
		} else {
			for (int i = vInici; i <= vFinal; i++) {
				if (i < text.length() && i >= 0) {
					textInterval = textInterval + text.charAt(i);
				}
			}
		}
		return textInterval;
	}
}
