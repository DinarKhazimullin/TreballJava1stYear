/*
	A java program to test our renting application, in which we create a client and their details, and we show the clients information.
*/
public class GestorLite {
	public static Client creaClientDemo() {
		Vehicle seat = new Vehicle("Seat", "600", 1);
		Vehicle tata = new Vehicle("Tata", "Vista", 1);
		Vehicle fiat = new Vehicle("Fiat", "Uno", 3);
		Client clientDemo = new Client("51590695Q", "Eugènia Salinas Roig", "93614214242");
		clientDemo.getLloguers().add(new Lloguer(seat, 2));
		clientDemo.getLloguers().add(new Lloguer(tata, 5));
		clientDemo.getLloguers().add(new Lloguer(fiat, 3));
		return clientDemo;
	}
	public static void mostraClient(Client clientDemo) {
		System.out.printf("Client: %s%n        %s%n        %s%n", clientDemo.getNom(), clientDemo.getNif(), clientDemo.getTelefon());
		System.out.printf("Lloguers: %d%n", clientDemo.getLloguers().size());
		for (int i = 0; i < clientDemo.getLloguers().size(); i++ ) {
			Lloguer lloguer = clientDemo.getLloguers().get(i);
			System.out.printf("        %d. vehicle: %s %s%n           dies llogats: %d%n", i+1, lloguer.getVehicle().getMarca(), lloguer.getVehicle().getModel(), lloguer.getDies());
		}
	}
	public static void main(String[] args) {
		Client demo = creaClientDemo();
		mostraClient(demo);
		System.out.println("------");
		System.out.print(demo.informe());
		System.out.println("======");
		System.out.print(demo.informeHTML());
	}
}
