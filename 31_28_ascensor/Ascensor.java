/*
	A Java program which let's us use an elevator on a three floor building
*/
public class Ascensor {
	public static void main(String[] args){
		System.out.println("pis?");
		String pis = Entrada.readLine().toLowerCase();
		System.out.println("botó?");
		String boto = Entrada.readLine().toLowerCase();
		if (pis.equals("planta baixa")) {
			if (boto.equals("pujar un")) {
				System.out.println("primer pis");
			} else if (boto.equals("pujar dos")) {
				System.out.println("segon pis");
			} else {
				System.out.println("error");
			}
		} else if (pis.equals("primer pis")) {
			if (boto.equals("pujar un")) {
				System.out.println("segon pis");
			} else if (boto.equals("baixar un")) {
				System.out.println("planta baixa");
			} else {
				System.out.println("error");
			}
		} else if (pis.equals("segon pis")) {
			if (boto.equals("baixar un")) {
				System.out.println("primer pis");
			} else if (boto.equals("baixar dos")) {
				System.out.println("planta baixa");
			} else {
				System.out.println("error");
			}
		} else {
			System.out.println("error");
		}
	}
}
