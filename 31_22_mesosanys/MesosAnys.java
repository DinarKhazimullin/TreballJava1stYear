/*
	A java program which takes a month and a year and displays the next and previous month
*/
public class MesosAnys{
	public static void main(String[] args) {
		System.out.println("Mes?");
		int mes = Integer.parseInt(Entrada.readLine());
		System.out.println("Any?");
		int any = Integer.parseInt(Entrada.readLine());
		if (mes >= 2 && mes <= 11)	{
			int mesanterior = mes - 1;
			int mesposterior = mes + 1;
			System.out.println("Mes anterior " + mesanterior + "/" + any + " i mes següent " + mesposterior + "/" + any);
		} else if (mes == 1) {
			int mesanterior = 12;
			int anyanterior = any - 1;
			int mesposterior = mes + 1;
			System.out.println("Mes anterior " + mesanterior + "/" + anyanterior + " i mes següent " + mesposterior + "/" + any);
		} else if (mes == 12) {
			int mesanterior = mes - 1;
			int mesposterior = 1;
			int anyposterior = any + 1;
			System.out.println("Mes anterior " + mesanterior + "/" + any + " i mes següent " + mesposterior + "/" + anyposterior);
		} else {
			System.out.println("error");
		}
	}
}
