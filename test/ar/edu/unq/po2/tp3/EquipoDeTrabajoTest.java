package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

class EquipoDeTrabajoTest {
	private EquipoDeTrabajo equipo;
	private Persona p1;
	private Persona p2;
	private Persona p3;
	private Persona p4;
	private Persona p5;
	
	@BeforeEach
	
	public void setUp() throws Exception {
		equipo = new EquipoDeTrabajo("Wolfes");
		p1 = new Persona("A","Correa",20);
		p2 = new Persona("B","Borrea",20);
		p3 = new Persona("C","Eorrea",20);
		p4 = new Persona("D","Forrea",20);
		p5 = new Persona("E","Qorrea",20);
		
		equipo.addPerson(p1);
		equipo.addPerson(p2);
		equipo.addPerson(p3);
		equipo.addPerson(p4);
		equipo.addPerson(p5);
		
	}
	
	@Test
	void testPromedioEdad() {
		int promedio = equipo.promedioDeEdad();
		assertEquals (promedio, 20);
		System.out.println(promedio);
	}
	
}
