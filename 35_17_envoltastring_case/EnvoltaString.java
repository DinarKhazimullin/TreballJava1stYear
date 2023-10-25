/*
	A java program that uses the function of maps in java, using a key and a value.
*/
public class EnvoltaString {
    private String valor;

    public EnvoltaString(String valor) { this.valor = valor; }
	
	public boolean equals(EnvoltaString altre) {
		return valor.toLowerCase().equals(altre.valor.toLowerCase());
	}
	
    public String toString() { return String.format("ENVOLTAT(\"%s\")", valor); }
    
}
