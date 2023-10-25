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
	public static boolean esEnter(String textStrip) {
		boolean enter = false;
		for (int i = 0; i < textStrip.length(); i++) {
			if (i == 0 && !Character.isDigit(textStrip.charAt(i))) {
				if (textStrip.charAt(i) == '-' || textStrip.charAt(i) == '+') {
					enter = true;
				} else {
					return false;
				}
			} else if (Character.isDigit(textStrip.charAt(i))) {
				enter = true;
			} else {
				return false;
			}
		}
		return enter;
	}
	public static boolean esEnter(String text, boolean estricte) {
		boolean enter = false;
		if (estricte) {
			for (int i = 0; i < text.length(); i++) {
				if (i == 0 && !Character.isDigit(text.charAt(i))) {
					if (text.charAt(i) == '-' || text.charAt(i) == '+') {
						enter = true;
					} else {
						return false;
					}
				} else if (Character.isDigit(text.charAt(i))) {
					enter = true;
				} else {
					return false;
				}
			}
		} else {
			String textStrip = text.strip();
			for (int i = 0; i < textStrip.length(); i++) {
				if (i == 0 && !Character.isDigit(textStrip.charAt(i))) {
					if (textStrip.charAt(i) == '-' || textStrip.charAt(i) == '+') {
						enter = true;
					} else {
						return false;
					}
				} else if (Character.isDigit(textStrip.charAt(i))) {
					enter = true;
				} else {
					return false;
				}
			}
		}
		return enter;
	}
	public static int aEnter(String text, boolean estricte) {
		int numero = 0;
		if (estricte) {
			numero = Integer.parseInt(text);
		} else {
			String textStrip = text.strip();
			numero = Integer.parseInt(textStrip);
		}
		return numero;
	}
}
