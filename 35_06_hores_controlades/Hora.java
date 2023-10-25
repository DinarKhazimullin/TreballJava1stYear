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
	public int getHores() { return this.hores; }
	public int getMinuts() { return this.minuts; }
	public int getSegons() { return this.segons; }
	public boolean setHores(int hores) {
		if (hores >= 0 && hores < 24) {
			this.hores = hores;
			return true;
		}
		return false;
	}
	public boolean setMinuts(int minuts) {
		if (minuts >= 0 && minuts < 60) {
			this.minuts = minuts;
			return true;
		}
		return false;
	}
	public boolean setSegons(int segons) {
		if (segons >= 0 && segons < 60) {
			this.segons = segons;
			return true;
		}
		return false;
	}
	@Override
	public String toString() {
		return String.format("%d:%02d:%02d", this.hores, this.minuts, this.segons);
	}
}
