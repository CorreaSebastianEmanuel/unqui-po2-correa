package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;


class PersonaTest {
	
	private Persona persona;
	private Persona persona2;
	
	@BeforeEach
	
	public void setUp() throws Exception {

		persona = new Persona("Alberto", "Correa", 20);
		persona2 = new Persona("Roberto", "Dominguez", 26);
		
	}


	@Test
	void test() {
		assertEquals(persona.menorQue(persona2),true);
	}

}
