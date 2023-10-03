package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Counter {
	
	private ArrayList<Integer> contador;
	private int pares;
	private int impares;
	private int multiplos;
	
	public Counter() {
		this.contador = new ArrayList<Integer>();
		this.pares = 0;
		this.impares = 0;
		this.multiplos = 0;
	}
	
	public void addNumber(int numero) {
		contador.add(numero);
	}
	
	public int pares() {
		for (int entero:contador) {
			if (((entero%2) == 0)) {
				pares++;
			}
		}
	return pares;		
	}
	
	public int impares() {
		for (int entero:contador) {
			if (((entero%2) == 1)) {
				impares++;
			}
		}
	return impares;		
	}
	
	public int multiplos(int numero) {
		for (int entero:contador) {
			if (((entero%numero) == 0)) {
				multiplos++;
			}
		}
	return multiplos;		
	}
	
	
}
