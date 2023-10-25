/*
	A java program that uses the class "Punt" or point to display the values of said class.
*/
public class UsaPunt {
	public static void main(String[] args) {
		Punt punt = new Punt();
		int x = args.length != 0 && UtilString.esEnter(args[0]) ? Integer.parseInt(args[0]) : 0;
		int y = args.length > 1 && UtilString.esEnter(args[1]) ? Integer.parseInt(args[1]) : 0;
		punt.setX(x);
		punt.setY(y);
		System.out.printf("punt.getX() -> %d%n", punt.getX());
		System.out.printf("punt.getY() -> %d%n", punt.getY());
	}
}
