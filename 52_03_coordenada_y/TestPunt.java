/*
	A java program that has as function to test the class "Punt" or Point. This time, testing a new variable named "Y".
*/
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
public class TestPunt {
	@Test
	public void constructor() {
		new Punt();
	}
	@Test
	public void constructorDefecteXZero() {
		Punt p = new Punt();
		Assertions.assertEquals(0, p.getX());
	}
	@Test
	public void constructorDefecteYZero() {
		Punt p = new Punt();
		Assertions.assertEquals(0, p.getY());
	}
}
