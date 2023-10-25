/*
	A java program which simulate a cat, implementing composition, being its eyes
*/
public class GatRenat {
	private String posicio;
	private UllDeGat ullDret;
	private UllDeGat ullEsquerre;
	public GatRenat() {
		this.posicio = "estirat";
		this.ullDret = new UllDeGat();
		this.ullEsquerre = new UllDeGat();
	}
	public GatRenat(String posicio) {
		this.posicio = "estirat";
		this.ullDret = new UllDeGat();
		this.ullEsquerre = new UllDeGat();
	}
	public UllDeGat getUllDret() { return ullDret; }
	public UllDeGat getUllEsquerre() { return ullEsquerre; }
	public String getPosicio() { return posicio; }
	public String aixecat() { this.posicio = "dret"; this.getUllDret().obret(); this.getUllEsquerre().obret(); return posicio; }
	public String seu() { this.posicio = "assegut"; this.getUllDret().obret(); this.getUllEsquerre().tancat(); return posicio; }
	public String estirat() { this.posicio = "estirat"; this.getUllDret().tancat(); this.getUllEsquerre().tancat(); return posicio; }
    public static void main(String[] args) {
		GatRenat renat = new GatRenat();
		UllDeGat ullDret = renat.getUllDret();
		UllDeGat ullEsquerre = renat.getUllEsquerre();
		System.out.printf("Quan està %s: %b + %b%n",
		        renat.getPosicio(),
		        renat.getUllDret().estaObert(),
		        renat.getUllEsquerre().estaObert());
		renat.seu();
		System.out.printf("Quan està %s: %b + %b%n",
		        renat.getPosicio(),
		        renat.getUllDret().estaObert(),
		        renat.getUllEsquerre().estaObert());
		renat.aixecat();
		System.out.printf("Quan està %s: %b + %b%n",
		        renat.getPosicio(),
		        renat.getUllDret().estaObert(),
		        renat.getUllEsquerre().estaObert());
	}
}
class UllDeGat {
	private boolean ull;
	public UllDeGat() {
		this.ull = false;
	}
	public UllDeGat(boolean ull) {
		this.ull = ull;
	}
	public void obret() {
		ull = true;
	}
	public void tancat() {
		ull = false;
	}
	public boolean estaObert() {
		return ull;
	}
}
