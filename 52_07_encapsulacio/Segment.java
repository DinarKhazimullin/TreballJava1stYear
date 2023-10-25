/*
	A java program that works as a segment between 2 points, with different functions inside, such as getters and setters.
*/
public class Segment {
	private Punt p1;
	private Punt p2;
	public Segment() {
		this.p1 = new Punt();
		this.p2 = new Punt();
	}
	public Segment(Punt a, Punt b) {
		this.p1 = a;
		this.p2 = b;
	}
	public Punt getP1() { return p1; }
	public Punt getP2() { return p2; }
	public void setP1(Punt p) {
		this.p1 = p;
	}
	public void setP2(Punt p) {
		this.p2 = p;
	}
	public Double longitud() {
		return Math.sqrt(Math.pow(p1.getX()-p2.getX(), 2) + Math.pow(p1.getY()-p2.getY(), 2));
	}
	@Override
	public String toString() {
		return String.format("Segment(Punt(%d, %d), Punt(%d, %d))", p1.getX(), p1.getY(), p2.getX(), p2.getY());
	}
}
