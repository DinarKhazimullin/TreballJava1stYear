/*
	A java program that serves its purpose as a renting application.
*/
public class Lloguer {
	private int dies;
	private Vehicle vehicle;
	public Lloguer(Vehicle vehicle, int dies) {
		this.dies = dies;
		this.vehicle = vehicle;
	}
	public int getDies() { return dies; }
	public void setDies(int dies) { this.dies = dies; }
	public Vehicle getVehicle() { return vehicle; }
	public void setVehicle(Vehicle vehicle) { this.vehicle = vehicle; }
}
