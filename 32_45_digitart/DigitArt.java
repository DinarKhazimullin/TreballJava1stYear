 /*
 	A java program which draws tables with user input caracters
 */
 public class DigitArt {
     public static char[][] construeix1() {
         return new char[][] {
             {'·', '·', '·', '·', '·'},
                 {'·', 'X', 'X', '·', '·'},
                 {'·', '·', 'X', '·', '·'},
                 {'·', '·', 'X', '·', '·'},
                 {'·', '·', 'X', '·', '·'},
                 {'·', 'X', 'X', 'X', '·'},
                 {'·', '·', '·', '·', '·'}
         };
     }

     public static char[][] construeix2() {
         return new char[][] {
                 {'·', '·', '·', '·', '·', '·'},
                 {'·', 'X', 'X', 'X', 'X', '·'},
                 {'·', '·', '·', '·', 'X', '·'},
                 {'·', 'X', 'X', 'X', 'X', '·'},
                 {'·', 'X', '·', '·', '·', '·'},
                 {'·', 'X', 'X', 'X', 'X', '·'},
                 {'·', '·', '·', '·', '·', '·'},
         };
     }

     public static char[][] construeix3() {
         return new char[][] {
                 {'·', '·', '·', '·', '·', '·'},
                 {'·', 'X', 'X', 'X', 'X', '·'},
                 {'·', '·', '·', '·', 'X', '·'},
                 {'·', 'X', 'X', 'X', 'X', '·'},
                 {'·', '·', '·', '·', 'X', '·'},
                 {'·', 'X', 'X', 'X', 'X', '·'},
                 {'·', '·', '·', '·', '·', '·'},
         };
     }
     public static void mostraResultat(char[][] origen, char[][] resultat) {
         for (int linia = 0; linia < origen.length; linia++) {
         	for (int colOrigen = 0; colOrigen < origen[linia].length; colOrigen++) {
         		System.out.print(origen[linia][colOrigen]);
         	}
         	System.out.print(" -> ");
         	for (int colResultat = 0; colResultat < resultat[0].length; colResultat++) {
         		System.out.print(resultat[linia][colResultat]);
         	}
         	System.out.println();
         }
     }
     public static void processaCaracter(char ch) {
         char[][] origen;
         switch (ch) {
             case '1': origen = construeix1();
                       break;
             case '2': origen = construeix2();
                       break;
             case '3': origen = construeix3();
                       break;
             default: return;    // no conec aquest caràcter
         }
         char[][] desti = UtilTaula.substitueix(origen, 'X', ch);
         mostraResultat(origen, desti);
         System.out.println();
     }
     public static void processaArgument(String arg) {
         /* XXX crida a processaCaracter() per cada caracter de arg */
         for (int i = 0; i < arg.length(); i++) {
         	processaCaracter(arg.charAt(i));
         }
     }
     public static void main(String[] args){
         // comprova que com a mínim hi hagi un argument
         if (args.length != 0) {
         	// processa cada argument
         	/* XXX crida a processaArgument() per cada argument */
         	for (int i = 0; i < args.length; i++) {
         		processaArgument(args[i]);
         	}
         } else {
         	System.out.println("Especifiqueu un o més dígits en la línia de comandes");
         }
     }
 }
