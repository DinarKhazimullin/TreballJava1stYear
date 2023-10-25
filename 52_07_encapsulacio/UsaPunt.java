/*
	A java program that uses the class "Punt" or point to display the values of said class.
*/
public class UsaPunt {
	public static void main(String[] args) {
		Punt punt = new Punt();
		int x1 = args.length != 0 && UtilString.esEnter(args[0]) ? Integer.parseInt(args[0]) : 0;
		int y1 = args.length > 1 && UtilString.esEnter(args[1]) ? Integer.parseInt(args[1]) : 0;
		int x2 = args.length > 2 && UtilString.esEnter(args[2]) ? Integer.parseInt(args[2]) : 0;
		int y2 = args.length > 3 && UtilString.esEnter(args[3]) ? Integer.parseInt(args[3]) : 0;
		Punt p1 = new Punt(x1, y1);
		Punt p2 = new Punt(x2, y2);
		System.out.printf("p1: (%d, %d)%n", p1.getX(), p1.getY());
		System.out.printf("p2: (%d, %d)%n", p2.getX(), p2.getY());
		p1.suma(p2);
		System.out.printf("p1+p2: (%d, %d)%n", p1.getX(), p1.getY());
	}
}
