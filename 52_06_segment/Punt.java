/*
	A java class about a point, with 2 getters, the getter of axis X and the getter of axis Y.
*/
public class Punt {
	private int x = 0;
	private int y = 0;
	public Punt() { }
	public Punt(int x, int y) {
		setX(x);
		setY(y);
	}
	public int getX() { return x; }
	public int getY() { return y; }
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void suma(Punt p) {
		this.x += p.x;
		this.y += p.y;
	}
	@Override
	public String toString() {
		return String.format("Punt(%d, %d)", this.x, this.y);
	}
}
