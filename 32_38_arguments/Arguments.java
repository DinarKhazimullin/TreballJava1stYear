/*
	A java program which tells if the user input argument is a digit or not
*/
public class Arguments {
	public static void main(String[] args) {
		if (args.length != 0) {
			for (int i = 0; i < args.length; i++) {
				if (UtilString.esEnter(args[i])) {
					System.out.println("[" + i + "] \"" + args[i] + "\": és enter");
				} else {
					System.out.println("[" + i + "] \"" + args[i] + "\": no és enter");
				}
			}
		} else {
			System.out.println("Cap argument");
		}
	}
}
