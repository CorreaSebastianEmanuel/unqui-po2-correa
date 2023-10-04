package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

class PointTest {
	private Point punto;
	private Point punto2;
	
	@BeforeEach
	
	public void setUp() throws Exception {
		punto = new Point();
		punto2 = new Point();
		punto.movePoint(4, 2);
		punto2.movePoint(3, 6);
	}
	
	@Test
	void testSuma() {
		punto.sumarPoint(punto2);
		assertEquals(punto.getX(), 7);
	}

}
