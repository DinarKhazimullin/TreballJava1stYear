/*
	A java program that sorts 3 numbers that the user provided in smallest to biggest order
*/
public class TresEnOrdre {
	public static void main(String[] args) {
		System.out.println("Primer?");
		int primer = Integer.parseInt(Entrada.readLine());
		System.out.println("Segon?");
		int segon = Integer.parseInt(Entrada.readLine());
		System.out.println("Tercer?");
		int tercer = Integer.parseInt(Entrada.readLine());
		
		if (primer > segon) {
		int tmp1 = primer;
		primer = segon;
		segon = tmp1;
		}
		if (segon > tercer) {
		int tmp2 = segon;
		segon = tercer;
		tercer = tmp2;	
		}
		if (primer > segon) {
		int tmp1 = primer;
		primer = segon;
		segon = tmp1;
		}
		
		System.out.println(primer + ", " + segon + " i " + tercer);
	}
}
