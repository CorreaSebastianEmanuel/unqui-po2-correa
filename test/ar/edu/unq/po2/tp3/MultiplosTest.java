package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MultiplosTest {
	private Multiplos multiplos;
	
	@BeforeEach
	public void setUp() throws Exception {

		multiplos = new Multiplos();
	}
	
	@Test
	public void testMultiplos() {
		int amount = multiplos.multiplicientes(2,6);
		assertEquals(amount, 996);
	}

}
