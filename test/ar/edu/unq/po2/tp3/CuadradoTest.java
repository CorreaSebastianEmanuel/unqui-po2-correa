package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

class CuadradoTest {
	private Cuadrado cuadrado;
	
	
	@BeforeEach
	
	public void setUp() throws Exception {
		cuadrado = new Cuadrado(2);
	}
	
	@Test
	void test() {	
		assertEquals(cuadrado.parametro(), 8);
	}
}
