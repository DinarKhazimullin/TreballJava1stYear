/*
	A java class that has information about a cat named Renat that has as information its position, which is stored in another class.
*/
public class GatRenat {
	private GatPosicio posicio;
	public GatRenat() {
		this.posicio = GatPosicio.fromString("estirat");
	}
	public GatRenat(GatPosicio posicio) {
		this.posicio = posicio;
	}
	public GatRenat(String posicio) {
		this.posicio = GatPosicio.fromString(posicio);
	}
	public GatPosicio getPosicio() { return this.posicio; }
	public void setPosicio(GatPosicio posicio) {
		this.posicio = posicio;
	}
	public void setPosicio(String posicio) {
		this.posicio = GatPosicio.fromString(posicio);
	}
}
