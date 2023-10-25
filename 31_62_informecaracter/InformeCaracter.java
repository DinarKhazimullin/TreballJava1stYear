/*
	A java program which asks us a text and gives us information about the first letter 
*/
public class InformeCaracter {
	public static void main (String[] args) {
		System.out.println("Caràcter?");
		String text = Entrada.readLine();
		if (text.isBlank()) {
			System.out.println("Caràcter buit");
		} else {
			char primeraLletraText = text.charAt(0);
			System.out.println("Character.getName('" + primeraLletraText + "'): " + Character.getName(primeraLletraText));
			System.out.println("Character.isDigit('" + primeraLletraText + "'): " + Character.isDigit(primeraLletraText));
			System.out.println("Character.isJavaIdentifierStart('" + primeraLletraText + "'): " + Character.isJavaIdentifierStart(primeraLletraText));
			System.out.println("Character.isJavaIdentifierPart('" + primeraLletraText + "'): " + Character.isJavaIdentifierPart(primeraLletraText));			System.out.println("Character.isLetter('" + primeraLletraText + "'): " + Character.isLetter(primeraLletraText));
			System.out.println("Character.isLowerCase('" + primeraLletraText + "'): " + Character.isLowerCase(primeraLletraText));
			System.out.println("Character.isUpperCase('" + primeraLletraText + "'): " + Character.isUpperCase(primeraLletraText));
			System.out.println("Character.isWhitespace('" + primeraLletraText + "'): " + Character.isWhitespace(primeraLletraText));
			System.out.println("Character.toLowerCase('" + primeraLletraText + "'): " + Character.toLowerCase(primeraLletraText));
			System.out.println("Character.toUpperCase('" + primeraLletraText + "'): " + Character.toUpperCase(primeraLletraText));	
		}
	}
}
