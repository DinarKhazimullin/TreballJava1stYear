/*
	A java program in which we create the class "Hora" or Hour which just works as a 24-hour watch, with its setters and getters.
*/
public class Hora {
	private int hores;
	private int minuts;
	private int segons;
	public Hora() {
		this.hores = 0;
		this.minuts = 0;
		this.segons = 0;
	}
	public Hora(int hores, int minuts, int segons) throws Exception {
		setHores(hores);
		setMinuts(minuts);
		setSegons(segons);
	}
	public int getHores() { return this.hores; }
	public int getMinuts() { return this.minuts; }
	public int getSegons() { return this.segons; }
	public void setHores(int hores) throws Exception {
		if (hores >= 0 && hores < 24) {
			this.hores = hores;
		} else {
			throw new Exception("hores fora de rang: " + hores);
		}
	}
	public void setMinuts(int minuts) throws Exception {
		if (minuts >= 0 && minuts < 60) {
			this.minuts = minuts;
		} else {
			throw new Exception("minuts fora de rang: " + minuts);
		}
	}
	public void setSegons(int segons) throws Exception {
		if (segons >= 0 && segons < 60) {
			this.segons = segons;
		} else {
			throw new Exception("segons fora de rang: " + segons);
		}
	}
	@Override
	public String toString() {
		return String.format("%d:%02d:%02d", this.hores, this.minuts, this.segons);
	}
}
