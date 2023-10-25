/*
	A java program in which a ball falls down each time we press enter and finalizes when a string is input
*/
 public class Pilota {
     public static final int N_FILES = 9;
     public static final int N_COLS = 13;

     public static void netejaPantalla() {
         System.out.print("\033[H\033[2J");
         System.out.flush();
     }
     public static void mostraCamp(char[][] camp) {
         for (int i=0; i<N_FILES; i++) {
             for (int j=0; j<N_COLS; j++) {
                 System.out.print(camp[i][j]);
             }
             System.out.println();
         }
     }
     public static void netejaCamp(char[][] camp) {
         for (int fila = 0; fila < N_FILES; fila++) {
         	for (int col = 0; col < N_COLS; col++) {
         		camp[fila][col] = '·';
         	}
         }
     }
     public static void netejaPosicio(char[][] camp, int fila, int col) {
         camp[fila][col] = '·';
     }
     public static void posicionaPilota(char[][] camp, int fila, int col) {
         camp[fila][col] = 'O';
     }
     public static int seguentFila(int actual) {
     	actual++;
     	if (actual >= N_FILES) {
        	actual = 0;
        }
        return actual;
         
     }
     public static int seguentCol(int actual) {
        actual++;
     	if (actual >= N_COLS) {
        	actual = 0;
        }
        return actual;
     }
     public static void main(String[] args)  {
         char[][] camp = new char[N_FILES][N_COLS];
         netejaCamp(camp);
         int fila = 0;
         int col = 0;
         do {
             posicionaPilota(camp, fila, col);
             netejaPantalla();
             mostraCamp(camp);
             netejaPosicio(camp, fila, col);
             fila = seguentFila(fila);
             col = seguentCol(col);
             System.out.printf("%nEnter per continuar");
         } while (Entrada.readLine().isEmpty());
     }
 }
