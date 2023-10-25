/*
	A java class about a point, with 2 getters, the getter of axis X and the getter of axis Y.
*/
public class Punt {
	private int[] coord = new int[2];
	public Punt() { 
		coord[0] = 0;
		coord[1] = 0;
	}
	public Punt(int x, int y) throws Exception {
		setX(x);
		setY(y);
	}
	public int getX() { return coord[0]; }
	public int getY() { return coord[1]; }
	public void setX(int x) throws Exception{
		if (x >= 0) {
			coord[0] = x;
		} else {
			throw new IllegalArgumentException();
		}
	}
	public void setY(int y) throws Exception{
		if (y >= 0) {
			coord[1] = y;
		} else {
			throw new IllegalArgumentException();
		}
	}
	public void suma(Punt p) {
		this.coord[0] += p.coord[0];
		this.coord[1] += p.coord[1];
	}
	@Override
	public String toString() {
		return String.format("Punt(%d, %d)", this.coord[0], this.coord[1]);
	}
}
