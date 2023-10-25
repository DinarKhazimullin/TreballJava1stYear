/*
	A java program that uses the class "Punt" or point to display the values of said class.
*/
public class UsaPunt {
	public static void main(String[] args) {
		int x1 = args.length != 0 && UtilString.esEnter(args[0]) ? Integer.parseInt(args[0]) : 0;
		int y1 = args.length > 1 && UtilString.esEnter(args[1]) ? Integer.parseInt(args[1]) : 0;
		int x2 = args.length > 2 && UtilString.esEnter(args[2]) ? Integer.parseInt(args[2]) : 0;
		int y2 = args.length > 3 && UtilString.esEnter(args[3]) ? Integer.parseInt(args[3]) : 0;
		Punt punt1 = new Punt(x1, y1);
		Punt punt2 = new Punt(x2, y2);
		Segment segment1 = new Segment(punt1, punt2);
		Segment segment2 = new Segment();
		segment2.setP1(segment1.getP2());
		segment2.setP2(segment1.getP1());
		System.out.printf("p1: %s%n", punt1);
		System.out.printf("p2:");
	}
}
