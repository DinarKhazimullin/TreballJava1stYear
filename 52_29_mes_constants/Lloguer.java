/*
	A java program that serves its purpose as a renting application.
*/
public class Lloguer {
	private int dies;
	private Vehicle vehicle;
	private static final int UNITAT_DE_COST_BASIC = 3;
	private static final int NOMBRE_DE_DIES_INICIALS_BASIC = 3;
	private static final int UNITAT_DE_COST_GENERAL = 4;
	private static final int NOMBRE_DE_DIES_INICIALS_GENERAL = 2;
	private static final int UNITAT_DE_COST_LUXE = 6;
	private static final double TARIFA_DE_COST_BASIC = 1.5;
	private static final double TARIFA_DE_COST_GENERAL = 2.5;
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
				quantitat += UNITAT_DE_COST_BASIC;
				if (this.getDies() > NOMBRE_DE_DIES_INICIALS_BASIC) {
					quantitat += (this.getDies() - NOMBRE_DE_DIES_INICIALS_BASIC) * TARIFA_DE_COST_BASIC;
				}
				break;
		    case Vehicle.GENERAL:
				quantitat += UNITAT_DE_COST_GENERAL;
				if (this.getDies() > NOMBRE_DE_DIES_INICIALS_GENERAL) {
					quantitat += (this.getDies() - NOMBRE_DE_DIES_INICIALS_GENERAL) * TARIFA_DE_COST_GENERAL;
		        }
				break;
			case Vehicle.LUXE:
				quantitat += this.getDies() * UNITAT_DE_COST_LUXE;
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
