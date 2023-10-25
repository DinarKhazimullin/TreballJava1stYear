/*
	A java program that tests if our application is working correctly
*/
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class TestGestor {
	@Test
	public void informeAmb3Lloguers() {
		Client demo = GestorLite.creaClientDemo();
		String informe = String.format("Informe de lloguers del client Eugènia Salinas Roig (51590695Q)%n	Seat 600: 90.0€%n	Tata Vista: 180.0€%n	Fiat Uno: 540.0€%nImport a pagar: 810.0€%nPunts guanyats: 4%n");
		String obtingut = demo.informe();
		assertEquals(informe, obtingut);
	}
	@Test
	public void informeAmb0Lloguers() {
		Client demo = new Client("51590695Q", "Eugènia Salinas Roig", "93614214242");
		String informe = String.format("Informe de lloguers del client Eugènia Salinas Roig (51590695Q)%nImport a pagar: 0.0€%nPunts guanyats: 0%n");
		String obtingut = demo.informe();
		assertEquals(informe, obtingut);
	}
	@Test
	public void informeAmb1LloguerBasic1Dia() {
		Vehicle seat = new Vehicle("Seat", "600", 1);
		Client demo = new Client("51590695Q", "Eugènia Salinas Roig", "93614214242");
		demo.getLloguers().add(new Lloguer(seat, 1));	
		String informe = String.format("Informe de lloguers del client Eugènia Salinas Roig (51590695Q)%n	Seat 600: 90.0€%nImport a pagar: 90.0€%nPunts guanyats: 1%n");
		String obtingut = demo.informe();
		assertEquals(informe, obtingut);
	}
	@Test
	public void informeAmb1LloguerBasic2Dia() {
		Vehicle seat = new Vehicle("Seat", "600", 1);
		Client demo = new Client("51590695Q", "Eugènia Salinas Roig", "93614214242");
		demo.getLloguers().add(new Lloguer(seat, 2));
		String informe = String.format("Informe de lloguers del client Eugènia Salinas Roig (51590695Q)%n	Seat 600: 90.0€%nImport a pagar: 90.0€%nPunts guanyats: 1%n");
		String obtingut = demo.informe();
		assertEquals(informe, obtingut);
	}
	@Test
	public void informeAmb1LloguerBasic3Dia() {
		Vehicle seat = new Vehicle("Seat", "600", 1);
		Client demo = new Client("51590695Q", "Eugènia Salinas Roig", "93614214242");
		demo.getLloguers().add(new Lloguer(seat, 3));
		String informe = String.format("Informe de lloguers del client Eugènia Salinas Roig (51590695Q)%n	Seat 600: 90.0€%nImport a pagar: 90.0€%nPunts guanyats: 1%n");
		String obtingut = demo.informe();
		assertEquals(informe, obtingut);
	}
	@Test
	public void informeAmb1LloguerBasic5Dia() {
		Vehicle seat = new Vehicle("Seat", "600", 1);
		Client demo = new Client("51590695Q", "Eugènia Salinas Roig", "93614214242");
		demo.getLloguers().add(new Lloguer(seat, 5));
		String informe = String.format("Informe de lloguers del client Eugènia Salinas Roig (51590695Q)%n	Seat 600: 180.0€%nImport a pagar: 180.0€%nPunts guanyats: 1%n");
		String obtingut = demo.informe();
		assertEquals(informe, obtingut);
	}
	@Test
	public void informeAmb2LloguerBasicMenys3Dia() {
		Vehicle seat = new Vehicle("Seat", "600", 1);
		Vehicle tata = new Vehicle("Tata", "Vista", 1);
		Client demo = new Client("51590695Q", "Eugènia Salinas Roig", "93614214242");
		demo.getLloguers().add(new Lloguer(seat, 2));
		demo.getLloguers().add(new Lloguer(tata, 2));
		String informe = String.format("Informe de lloguers del client Eugènia Salinas Roig (51590695Q)%n	Seat 600: 90.0€%n	Tata Vista: 90.0€%nImport a pagar: 180.0€%nPunts guanyats: 2%n");
		String obtingut = demo.informe();
		assertEquals(informe, obtingut);
	}
	@Test
	public void informeAmb2LloguerBasicMes3Dia() {
		Vehicle seat = new Vehicle("Seat", "600", 1);
		Vehicle tata = new Vehicle("Tata", "Vista", 1);
		Client demo = new Client("51590695Q", "Eugènia Salinas Roig", "93614214242");
		demo.getLloguers().add(new Lloguer(seat, 5));
		demo.getLloguers().add(new Lloguer(tata, 5));
		String informe = String.format("Informe de lloguers del client Eugènia Salinas Roig (51590695Q)%n	Seat 600: 180.0€%n	Tata Vista: 180.0€%nImport a pagar: 360.0€%nPunts guanyats: 2%n");
		String obtingut = demo.informe();
		assertEquals(informe, obtingut);
	}
	@Test
	public void informeAmb2LloguerBasicUnMenys3DiaUnMes3Dia() {
		Vehicle seat = new Vehicle("Seat", "600", 1);
		Vehicle tata = new Vehicle("Tata", "Vista", 1);
		Client demo = new Client("51590695Q", "Eugènia Salinas Roig", "93614214242");
		demo.getLloguers().add(new Lloguer(seat, 2));
		demo.getLloguers().add(new Lloguer(tata, 5));
		String informe = String.format("Informe de lloguers del client Eugènia Salinas Roig (51590695Q)%n	Seat 600: 90.0€%n	Tata Vista: 180.0€%nImport a pagar: 270.0€%nPunts guanyats: 2%n");
		String obtingut = demo.informe();
		assertEquals(informe, obtingut);
	}
	@Test
	public void informeTotsLloguerBasicMenys3Dia() {
		Vehicle seat = new Vehicle("Seat", "600", 1);
		Vehicle tata = new Vehicle("Tata", "Vista", 1);
		Vehicle fiat = new Vehicle("Fiat", "Uno", 1);
		Client demo = new Client("51590695Q", "Eugènia Salinas Roig", "93614214242");
		demo.getLloguers().add(new Lloguer(seat, 2));
		demo.getLloguers().add(new Lloguer(tata, 2));
		demo.getLloguers().add(new Lloguer(fiat, 2));
		String informe = String.format("Informe de lloguers del client Eugènia Salinas Roig (51590695Q)%n	Seat 600: 90.0€%n	Tata Vista: 90.0€%n	Fiat Uno: 90.0€%nImport a pagar: 270.0€%nPunts guanyats: 3%n");
		String obtingut = demo.informe();
		assertEquals(informe, obtingut);
	}
	@Test
	public void informeTotsLloguerBasicMes3Dia() {
		Vehicle seat = new Vehicle("Seat", "600", 1);
		Vehicle tata = new Vehicle("Tata", "Vista", 1);
		Vehicle fiat = new Vehicle("Fiat", "Uno", 1);
		Client demo = new Client("51590695Q", "Eugènia Salinas Roig", "93614214242");
		demo.getLloguers().add(new Lloguer(seat, 5));
		demo.getLloguers().add(new Lloguer(tata, 5));
		demo.getLloguers().add(new Lloguer(fiat, 5));
		String informe = String.format("Informe de lloguers del client Eugènia Salinas Roig (51590695Q)%n	Seat 600: 180.0€%n	Tata Vista: 180.0€%n	Fiat Uno: 180.0€%nImport a pagar: 540.0€%nPunts guanyats: 3%n");
		String obtingut = demo.informe();
		assertEquals(informe, obtingut);
	}
	@Test
	public void informeTotsLloguerTotsMenys3Dia() {
		Vehicle seat = new Vehicle("Seat", "600", 1);
		Vehicle tata = new Vehicle("Tata", "Vista", 2);
		Vehicle fiat = new Vehicle("Fiat", "Uno", 3);
		Client demo = new Client("51590695Q", "Eugènia Salinas Roig", "93614214242");
		demo.getLloguers().add(new Lloguer(seat, 2));
		demo.getLloguers().add(new Lloguer(tata, 2));
		demo.getLloguers().add(new Lloguer(fiat, 2));
		String informe = String.format("Informe de lloguers del client Eugènia Salinas Roig (51590695Q)%n	Seat 600: 90.0€%n	Tata Vista: 120.0€%n	Fiat Uno: 360.0€%nImport a pagar: 570.0€%nPunts guanyats: 4%n");
		String obtingut = demo.informe();
		assertEquals(informe, obtingut);
	}
	@Test
	public void informeTotsLloguerTotsMes3Dia() {
		Vehicle seat = new Vehicle("Seat", "600", 1);
		Vehicle tata = new Vehicle("Tata", "Vista", 2);
		Vehicle fiat = new Vehicle("Fiat", "Uno", 3);
		Client demo = new Client("51590695Q", "Eugènia Salinas Roig", "93614214242");
		demo.getLloguers().add(new Lloguer(seat, 5));
		demo.getLloguers().add(new Lloguer(tata, 5));
		demo.getLloguers().add(new Lloguer(fiat, 5));
		String informe = String.format("Informe de lloguers del client Eugènia Salinas Roig (51590695Q)%n	Seat 600: 180.0€%n	Tata Vista: 345.0€%n	Fiat Uno: 900.0€%nImport a pagar: 1425.0€%nPunts guanyats: 4%n");
		String obtingut = demo.informe();
		assertEquals(informe, obtingut);
	}
	@Test
	public void informeTotsLloguerVariat() {
		Vehicle seat = new Vehicle("Seat", "600", 3);
		Vehicle tata = new Vehicle("Tata", "Vista", 2);
		Vehicle fiat = new Vehicle("Fiat", "Uno", 3);
		Client demo = new Client("51590695Q", "Eugènia Salinas Roig", "93614214242");
		demo.getLloguers().add(new Lloguer(seat, 5));
		demo.getLloguers().add(new Lloguer(tata, 2));
		demo.getLloguers().add(new Lloguer(fiat, 5));
		String informe = String.format("Informe de lloguers del client Eugènia Salinas Roig (51590695Q)%n	Seat 600: 900.0€%n	Tata Vista: 120.0€%n	Fiat Uno: 900.0€%nImport a pagar: 1920.0€%nPunts guanyats: 5%n");
		String obtingut = demo.informe();
		assertEquals(informe, obtingut);
	}
	@Test
	public void informeTotsLloguerVariat2() {
		Vehicle seat = new Vehicle("Seat", "600", 1);
		Vehicle tata = new Vehicle("Tata", "Vista", 2);
		Vehicle fiat = new Vehicle("Fiat", "Uno", 2);
		Client demo = new Client("51590695Q", "Eugènia Salinas Roig", "93614214242");
		demo.getLloguers().add(new Lloguer(seat, 5));
		demo.getLloguers().add(new Lloguer(tata, 5));
		demo.getLloguers().add(new Lloguer(fiat, 5));
		String informe = String.format("Informe de lloguers del client Eugènia Salinas Roig (51590695Q)%n	Seat 600: 180.0€%n	Tata Vista: 345.0€%n	Fiat Uno: 345.0€%nImport a pagar: 870.0€%nPunts guanyats: 3%n");
		String obtingut = demo.informe();
		assertEquals(informe, obtingut);
	}
	@Test
	public void informeTotsLloguerVariat3() {
		Vehicle seat = new Vehicle("Seat", "600", 3);
		Vehicle tata = new Vehicle("Tata", "Vista", 1);
		Vehicle fiat = new Vehicle("Fiat", "Uno", 2);
		Client demo = new Client("51590695Q", "Eugènia Salinas Roig", "93614214242");
		demo.getLloguers().add(new Lloguer(seat, 3));
		demo.getLloguers().add(new Lloguer(tata, 4));
		demo.getLloguers().add(new Lloguer(fiat, 1));
		String informe = String.format("Informe de lloguers del client Eugènia Salinas Roig (51590695Q)%n	Seat 600: 540.0€%n	Tata Vista: 135.0€%n	Fiat Uno: 120.0€%nImport a pagar: 795.0€%nPunts guanyats: 4%n");
		String obtingut = demo.informe();
		assertEquals(informe, obtingut);
	}
	@Test
	public void informeHTMLDemo() {
		Client demo = GestorLite.creaClientDemo();
		String informeHTML = String.format("<p>Informe de lloguers del client <em>Eugènia Salinas Roig</em> (<strong>51590695Q</strong>)</p>%n<table>%n  <tr>%n    <td><strong>Marca</strong></td>%n    <td><strong>Model</strong></td>%n    <td><strong>Import</strong></td>%n  </tr>%n  <tr><td>Seat</td><td>600</td><td>90.0€</td></tr>%n  <tr><td>Tata</td><td>Vista</td><td>180.0€</td></tr>%n  <tr><td>Fiat</td><td>Uno</td><td>540.0€</td></tr>%n</table>%n<p>Import a pagar: <em>810.0€</em></p>%n<p>Punts guanyats: <em>4</em></p>%n");
		String obtingut = demo.informeHTML();
		assertEquals(informeHTML, obtingut);
	}
}
