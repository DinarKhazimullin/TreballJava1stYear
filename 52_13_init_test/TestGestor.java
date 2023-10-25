/*
	A java program that tests if our application is working correctly
*/
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class TestGestor {
	@Test
	public void informe() {
		Client demo = GestorLite.creaClientDemo();
		String informe = demo.informe();
		String obtingut = demo.informe();
		assertEquals(informe, obtingut);
	}
}
