/*
	A java program where we input a main number and then we can imput various numbers until a negative one is input, after that, the program will show the closest number to the main one.
*/
public class TrobaMesProxim {
	public static void main (String[] args) {
		int ancora;
		int valor;
		int diferencia;
		int diferenciaActual;
		int valorMinim = 0;
		System.out.println("Introdueix l'àncora");
		ancora = Integer.parseInt(Entrada.readLine());
		if (ancora >= 0) {
			System.out.println("Introdueix un valor");
			valor = Integer.parseInt(Entrada.readLine());
			if (valor > 0) {
				diferencia = ancora - valor;
				valorMinim = valor;
				if (diferencia < 0) {
					diferencia *= -1;
				}
				while (valor >= 0) {
					System.out.println("Introdueix un valor");
					valor = Integer.parseInt(Entrada.readLine());
						if (valor >= 0) {
							diferenciaActual = ancora - valor;
						if (diferenciaActual < 0) {
							diferenciaActual *= -1;
						}
						if (diferencia >= diferenciaActual) {
							if (valor < valorMinim) {
								diferencia = diferenciaActual;
								valorMinim = valor;
							} else {
							diferencia = diferenciaActual;
							valorMinim = valor;
							}
						}
					} 
				}
				System.out.println("El valor introduït més pròxim a " + ancora + " és " + valorMinim);
			} else {
				System.out.println("No s'ha introduït cap valor positiu");
			}
		} else {
			System.out.println("Àncora no vàlida");
		}
	}
}
