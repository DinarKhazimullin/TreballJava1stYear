/*
	A java program which says the day of the week based on the number provided by the user
*/
public class DiaSetmanaSwitch{
	public static void main(String[] args) {
		int numero = Integer.parseInt(args[0]);
		String diaSetmana;
		switch (numero) {
		case 1:	diaSetmana = "Dilluns";
				break;
		case 2:	diaSetmana = "Dimarts";
				break;
		case 3:	diaSetmana = "Dimecres";
				break;
		case 4:	diaSetmana = "Dijous";
				break;
		case 5:	diaSetmana = "Divendres";
				break;
		case 6:	diaSetmana = "Dissabte";
				break;
		case 7: diaSetmana = "Diumenge";
				break;
		default: diaSetmana = "Error";
		}
		System.out.println(diaSetmana);
	}	
}
