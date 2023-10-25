/*
	A java program in which we create our own figure
	
	Exercise.
	Create the following figure.
	Remember, use logical operators and comparations to create diferences between ground and sky.
	Clue: you can replace certain parts instead of doing 3 main fors.
	(Per a Moises: aquest es el meu repte, o almenys un intent en fer-ho. Per si preguntes que es, es una representacio del "antic" egipte, de esquerda a dreta es troba la piramide de Kefren (la segona mes gran), Keops (la mes gran i coneguda), la tercera estructura es el Sphinx i la cuarta es Micerinos (la mes petita). El que es troba a dalt de la piramide pots interpertar-ho com si fos una lluna o una de les estrelles de la constelacio d'Orion amb les que s'alineen les piramides. Els simbols d'igual (=) significan una carretera)
*/
public class repte {
	public static void main (String[] args) {
		
		for (int linia = 0; linia < 20; linia++) {
			
			for (int columna = 0; columna < 80; columna++) {
				if (((linia >= 7) && (linia <= 15)) && ((columna >= 25) && (columna <= 41))) {
					if ((linia == 11) && !((columna > 28) && (columna < 38))) {
						System.out.print("_");
					} else if (columna > (26 + linia)) {
						if (linia < 11) {
							System.out.print(" ");
						} else {
							System.out.print("~");
						}					
					} else if (columna < (40 - linia)) {
						if (linia < 11) {
							System.out.print(" ");
						} else {
							System.out.print("~");
						}
					} else {
						System.out.print("1");
					}
				} else if (((linia >= 8) && (linia <= 13)) && ((columna >= 10) && (columna <= 20))) {
					if ((linia == 11) && !((columna > 11) && (columna < 19))) {
						System.out.print("_");
					} else if (columna > (7 + linia)) {
						if (linia < 11) {
							System.out.print(" ");
						} else {
							System.out.print("~");
						}					
					} else if (columna < (23 - linia)) {
						if (linia < 11) {
							System.out.print(" ");
						} else {
							System.out.print("~");
						}
					} else {
						System.out.print("1");
					}
				} else if (((linia >= 9) && (linia <= 12)) && ((columna >= 60) && (columna <= 67))) {
					if ((linia == 11) && !((columna > 60) && (columna < 67))) {
						System.out.print("_");
					} else if (columna > (55 + linia)) {
						System.out.print(" ");						
					} else if (columna < (72 - linia)) {
						System.out.print(" ");
					} else {
						System.out.print("1");
					}
				} else if (((linia >= 10) && (linia <= 11)) && ((columna >= 45) && (columna <= 49))) {
					if (columna < (56 - linia)) {
						System.out.print(" ");
					} else if (columna > (38 + linia)) {
						System.out.print(" ");
					} else {
						System.out.print("1");
					}
				} else if ((linia == 12) && (columna == 47)) {
					System.out.print("1");
				} else if (((linia >= 13) && (linia <= 14)) && ((columna >= 44) && (columna <= 50))) {
					if (columna < (58 - linia)) {
						System.out.print("~");
					} else if (columna > (36 + linia)) {
						System.out.print("~");
					} else {
						System.out.print("1");
					}
				} else if ((((linia >= 2) && (linia <= 4)) && ((columna >= 32) && (columna <= 34)))) {
					if (((linia == 2) || (linia == 4)) && ((columna == 32) || (columna == 34))) {
						System.out.print(" ");
					} else {
						System.out.print("1");
					}
				} else if (linia == 17) {
					System.out.print("=");
				} else if (linia == 11) {
					System.out.print("_");
				} else if (linia == 3) {
					if ((columna == 12) || (columna == 34) || (columna == 56) || (columna == 78)) {
						System.out.print(".");
					} else {
						System.out.print(" ");
					}
				} else if (linia == 5) {
					if ((columna == 1) || (columna == 21) || (columna == 43) || (columna == 65) || (columna == 80)) {
						System.out.print(".");
					} else {
						System.out.print(" ");
					}
				} else if (linia == 7) {
					if ((columna == 12) || (columna == 34) || (columna == 56) || (columna == 78)) {
						System.out.print(".");
					} else {
						System.out.print(" ");
					}
				} else if (linia < 11) {
					System.out.print(" ");
				} else {
					System.out.print("~");
				}
			}
			
			System.out.println("");
			
		}
	}

}
