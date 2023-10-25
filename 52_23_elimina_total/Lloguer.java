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
	public double quantitat() {
		double quantitat = 0;
		switch (this.getVehicle().getCategoria()) {
			case Vehicle.BASIC:
				quantitat += 3;
				if (this.getDies() > 3) {
					quantitat += (this.getDies() - 3) * 1.5;
				}
				break;
		    case Vehicle.GENERAL:
				quantitat += 4;
				if (this.getDies() > 2) {
					quantitat += (this.getDies() - 2) * 2.5;
		        }
				break;
			case Vehicle.LUXE:
				quantitat += this.getDies() * 6;
				break;
		}
		return quantitat;
	}
	public int bonificacions() {
		int bonificacions = 1;
		if (this.getVehicle().getCategoria() == Vehicle.LUXE && this.getDies()>1) {
			bonificacions ++;
		}
		return bonificacions;
	}
}
