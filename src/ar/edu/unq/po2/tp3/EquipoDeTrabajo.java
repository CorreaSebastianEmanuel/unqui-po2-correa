package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class EquipoDeTrabajo {
	
	private String nombreEquipo;
	private ArrayList<Persona> conjuntoIntegrantes;
	
	public EquipoDeTrabajo(String nombre) {
		this.nombreEquipo = nombre;
		this.conjuntoIntegrantes = new ArrayList<Persona>();
	}
	
	public void addPerson(Persona p) {
		this.conjuntoIntegrantes.add(p);
	}
	
	public String getName() {
		return this.nombreEquipo;
	}
	
	public int promedioDeEdad() {
		int todasLasEdades = 0;
		for(Persona integrante:conjuntoIntegrantes) {
			todasLasEdades = todasLasEdades + integrante.getEdad();
		}
	return todasLasEdades / conjuntoIntegrantes.size();
	}
	
	
}
