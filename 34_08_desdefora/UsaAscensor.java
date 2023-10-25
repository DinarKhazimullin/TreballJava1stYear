/*
	A program which creates an elevator object outside this file, and printing it's result.
*/
public class UsaAscensor {
	public static void main(String[] args) {
		Ascensor ascensors = new Ascensor();
		System.out.println("L'ascensor creat des de fora està al pis " + ascensors.pis);
	}
}
