/*
	A java program that has as function to test the class "Punt" or Point. This time, testing a new variable named "Y".
*/
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class TestPunt {
	@Test
	public void constructor() {
		new Punt();
	}
	@Test
	public void constructorDefecteXZero() {
		Punt p = new Punt();
		assertEquals(0, p.getX());
	}
	@Test
	public void constructorDefecteYZero() {
		Punt p = new Punt();
		assertEquals(0, p.getY());
	}
	@Test
	public void setX42() throws Exception {
		Punt p = new Punt();
		p.setX(42);
		assertEquals(42, p.getX());
	}
	@Test
	public void setY42() throws Exception{
		Punt p = new Punt();
		p.setY(42);
		assertEquals(42, p.getY());
	}
	@Test
	public void constructorEspecific() throws Exception {
		Punt p = new Punt(1, 2);
		assertAll(
			() -> assertEquals(1, p.getX()),
			() -> assertEquals(2, p.getY())
		);
	}
	@Test
	public void sumaPunts() throws Exception { 
		Punt a = new Punt(5, 10);
		Punt b = new Punt(10, 15);
		a.suma(b);
		assertAll(
			() -> assertEquals(15, a.getX()),
			() -> assertEquals(25, a.getY())
		);
	}
}
