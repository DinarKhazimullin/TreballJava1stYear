/*
	A java program in which we show by screen every elevator input by the user.
*/
public class Ascensor {
    public int pis = 0;

    public static Ascensor[] creaAscensors(int quants) {
        Ascensor[] ascensors = new Ascensor[quants];
        for (int i = 0; i < quants; i++) {
        	ascensors[i] = new Ascensor();
        	ascensors[i].pis = i;
        }
        return ascensors;
    }

    public static void main(String[] args){
        String input = args[0];
        boolean valid = true;
        for (int i = 0; i < input.length(); i++) {
        	if (!Character.isDigit(input.charAt(i))) {
        		valid = false;
        		break;
        	}
        }
        if (!valid || input.charAt(0) <= '0') {
        	System.out.println("Cap ascensor");
        	return;
        }
        int quants = Integer.parseInt(input);
        Ascensor[] ascensors = creaAscensors(quants);
        for (int i = 0; i < ascensors.length; i++) {
            System.out.printf("Ascensor %d al pis %d%n", i, ascensors[i].pis);
        }
    }
}
