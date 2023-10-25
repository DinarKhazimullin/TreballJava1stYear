/*
	A java program that test the class Segment, looking for the basic constructors, specific constructors and the function "longitud()"
*/
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class TestSegment {
	@Test
	public void constructorDefecte() {
		Segment s = new Segment();
		assertAll (
			() -> assertEquals("Punt(0, 0)", s.getP1().toString()),
			() -> assertEquals("Punt(0, 0)", s.getP2().toString())
		);
	}
	@Test
	public void constructorEspecific() {
		Punt p1 = new Punt(1, 5);
		Punt p2 = new Punt(10, 15);
		Segment s = new Segment(p1, p2);
		assertAll (
			() -> assertEquals(p1, s.getP1()),
			() -> assertEquals(p2, s.getP2())
		);
	}
	@Test
	public void longitud() {
		Punt p1 = new Punt(1, 5);
		Punt p2 = new Punt(10, 15);
		Segment s = new Segment(p1, p2);
		assertEquals(13.45, s.longitud(), 0.01d);
	}
}
