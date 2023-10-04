package ar.edu.unq.po2.tp3;

public class Rectangulo {
	private int ancho;
	private int largo;
	
	public Rectangulo (int ancho, int largo) {
		this.ancho = ancho;
		this.largo = largo;

	}
	
	public int area() {
		return  (this.ancho * this.largo);
	}
	
	public int parametro() {
		return (this.ancho * 2 + this.largo * 2);
	}
	
	public String tipoDeRectangulo() {
		if (this.ancho > this.largo) {
			return ("Horizontal");
		}
		else return ("Vertical");
	}
}
