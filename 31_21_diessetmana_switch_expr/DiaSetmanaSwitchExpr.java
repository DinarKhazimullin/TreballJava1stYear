/*
	A java program which says the day of the week based on the number provided by the user
*/
public class DiaSetmanaSwitchExpr{
	public static void main(String[] args) {
		int numero = Integer.parseInt(args[0]);
		String diaSetmana;
		switch (numero) {
		case 1 -> diaSetmana = "Dilluns";
		case 2 -> diaSetmana = "Dimarts";
		case 3 -> diaSetmana = "Dimecres";
		case 4 -> diaSetmana = "Dijous";
		case 5 -> diaSetmana = "Divendres";
		case 6 -> diaSetmana = "Dissabte";
		case 7 -> diaSetmana = "Diumenge";
		default -> diaSetmana = "Error";
		}
		System.out.println(diaSetmana);
	}	
}
