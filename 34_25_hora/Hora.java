public class Hora {
	private int hores = 0;
	private int minuts = 00;
	private int segons = 00;
	public Hora() {
		hores = getHores();
		minuts = getMinuts();
		segons = getSegons();
	}
	public Hora(int hores, int minuts, int segons) {
		if ((hores >= 0 && hores < 24) && (minuts >= 0 && minuts <= 59) && (segons >= 0 && segons <= 59)) {
			setHores(hores);
			setMinuts(minuts);
			setSegons(segons);
		}
	}
	public int getHores() {
		return hores;
	}
	public int getMinuts() {
		return minuts;
	}
	public int getSegons() {
		return segons;
	}
	public void setHores(int hores) {
		this.hores = hores;
	}
	public void setMinuts(int minuts) {
		this.minuts = minuts;
	}
	public void setSegons(int segons) {
		this.segons = segons;
	}
	public void incrementa() {
		if (segons == 59) {
			if (minuts == 59) {
				if (hores == 23) {
					this.hores = 0;
					this.minuts = 0;
					this.segons = 0;
					return;
				} else {
					this.hores++;
					this.minuts = 0;
					this.segons = 0;
				}
			} else {
				this.minuts++;
				this.segons = 0;
			}
		} else {
			this.segons++;
		}
	}
	public void decrementa() {
		if (segons == 0) {
			if (minuts == 0) {
				if (hores == 0) {
					this.hores = 23;
					this.minuts = 59;
					this.segons = 59;
				} else {
					this.hores--;
					this.minuts = 59;
					this.segons = 59;
				}
			} else {
				this.minuts--;
				this.segons = 59;
			}
		} else { 
			this.segons--;
		}
	}
	public void incrementa(int segons) {
		if (segons > 0) {
			segons += (this.hores * 3600) + (this.minuts * 60) + this.segons;
			if (segons >= 86400) {
				segons = segons % 86400;
			}
			this.hores = segons / 3600;
			this.minuts = (segons%3600) / 60;
			this.segons = (segons%3600) % 60;
		} else {
			;
		}
	}
	public void decrementa(int segons) {
		if (segons < 0) {
			segons = segons * -1;
		}
		int segonsARestar = (this.hores * 3600) + (this.minuts * 60) + this.segons;
		if (segonsARestar >= segons) {
			segons = segonsARestar - segons;
			this.hores = segons / 3600;
			this.minuts = (segons%3600) / 60;
			this.segons = (segons%3600) % 60;
		}
		if (segonsARestar == 0) {
			segons = 86400 - segons;
			this.hores = segons / 3600;
			this.minuts = (segons%3600) / 60;
			this.segons = (segons%3600) % 60;
		}
		
	}
	public int compareTo(Hora hora) {
		if (this.hores > hora.hores || this.minuts > hora.minuts || this.segons > hora.segons) {
			return 1;
		} else if (this.hores < hora.hores || this.minuts < hora.minuts || this.segons < hora.segons) {
			return -1;
		} else {
			return 0;
		}
	}
	@Override
	public String toString() {return String.format("%d:%02d:%02d", hores, minuts, segons); }
	private static String composaOperadorComparacio(Hora hora1, Hora hora2) {
    	int comparacio = hora1.compareTo(hora2);
	    if (comparacio < 0) {
    	    return "<";
    	} else if (comparacio > 0) {
    	    return ">";
    	} else {
    	    return "==";
    	}
	}

	public static void main(String[] args) {
	    Hora hora1 = new Hora();
	    Hora hora2 = new Hora(0, 0, 2);
	    System.out.printf("Inicialment hora1: %s %s hora2: %s%n", hora1, composaOperadorComparacio(hora1, hora2), hora2);
	    System.out.println("Incrementem 1 segon a la primera i decrementem 1 segon a la segona");
	    hora1.incrementa();
	    hora2.decrementa();
	    System.out.printf("Finalment hora1: %s %s hora2: %s%n", hora1, composaOperadorComparacio(hora1, hora2), hora2);
	}
}
