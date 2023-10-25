/*
	A java program that only will add digits from the user input arguments
*/
public class SumaEnters {
	public static void main(String[] args) {
		int[] filtra = filtraEnters(args);
		System.out.println(sumaEnters(filtra));
	}
	public static int quantsEnters(String[] valors) {
		int quants = 0;
		for (int i = 0; i < valors.length; i++) {
			if (UtilString.esEnter(valors[i])) {
				quants++;
			}
		}
		return quants;
	}
	public static int[] filtraEnters(String[] valors) {
		int filtra[] = new int[quantsEnters(valors)];
		int pos = 0;
		for (int i = 0; i < valors.length; i++) {
			if (UtilString.esEnter(valors[i])) {
				filtra[pos] = Integer.parseInt(valors[i]);
				pos++;
			}
		}
		return filtra;
	}
	public static int sumaEnters(int[] valors) {
		int suma = 0;
		for (int i = 0; i < valors.length; i++) {
			suma = suma + valors[i];
		}
		return suma;
	}
}
