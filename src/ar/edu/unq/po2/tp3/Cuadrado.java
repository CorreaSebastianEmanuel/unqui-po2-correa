package ar.edu.unq.po2.tp3;

public class Cuadrado {
	
		private int lado;
		
		public Cuadrado (int lado) {
			this.lado = lado;

		}
		
		public int area() {
			return  (this.lado * 2);
		}
		
		public int parametro() {
			return (this.lado * 4);
		}
		
	}
