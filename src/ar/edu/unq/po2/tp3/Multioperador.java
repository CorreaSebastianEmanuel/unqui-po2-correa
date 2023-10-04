package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Multioperador {
	
	private ArrayList<Integer> enteros; 
	

	public Multioperador() {
		this.enteros = new ArrayList<Integer>();	
	}
	
	public void addNumber(int numero) {
		enteros.add(numero);
	}
	
	public int suma() {
		int suma = 0;
		for (int entero:enteros) {
			suma = suma + entero;
		}
	return suma;	
	}
	
	public int resta() {
		int resta = 0;
		for (int entero:enteros) {
			resta = resta - entero;
		}
	return resta;	
	}
	
	public int multiplicacion() {
		int multiplicacion = 1;
		for (int entero:enteros) {
			multiplicacion = multiplicacion * entero;
		}
	return multiplicacion;	
	}
}


