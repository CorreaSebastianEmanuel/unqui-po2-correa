package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

class StringTest {
	private String a;
	private String s;
	private String t;
	
	@BeforeEach 
		public void setUp() throws Exception {
	
		 a = "abc";
		 s = a;

	}
	@Test
	public void test1() {
		Boolean w = a.substring(1,3).equals("bc");
		assertEquals(w, "im");
	}

}
