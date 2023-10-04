package ar.edu.unq.po2.tp3;


public class Persona {
	private String nombre;
	private String apellido;
	private int edad;
	
	public Persona(String nombre, String apellido, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}
	
	public String getApellido() {
		return apellido;
	}

	public int getEdad() {
		return edad;
	}
	
	public Boolean menorQue(Persona p) {
		return (edad < p.getEdad());
	}
	
	public String getName() {
		return this.nombre;
	}

}
