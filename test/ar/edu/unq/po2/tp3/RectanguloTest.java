package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

class RectanguloTest {
	private Rectangulo rectangulo;
	
	
	@BeforeEach
	
	public void setUp() throws Exception {
		rectangulo = new Rectangulo(2,4);
	}
	
	@Test
	void test() {	
		assertEquals(rectangulo.tipoDeRectangulo(), "Vertical");
	}
}
