package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

class MultioperadorTest {

	private Multioperador multi;
	
	@BeforeEach
	
	public void setUp() throws Exception {
		multi = new Multioperador();
		multi.addNumber(3);
		multi.addNumber(2);
		multi.addNumber(5);
		multi.addNumber(6);
		multi.addNumber(9);
		multi.addNumber(1);
		multi.addNumber(7);
		multi.addNumber(2);
	}
	
	@Test
	void test() {
		assertEquals(multi.suma(), 35);
	}
	
	@Test
	void test1() {
		assertEquals(multi.resta(), -35);
	}

	@Test
	void test2() {
		assertEquals(multi.multiplicacion(), 22680);
	}


}
