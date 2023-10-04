package ar.edu.unq.po2.tp3;

public class Multiplos {
	private int finals;
	
	public Multiplos() {
		this.finals = -1;
	}
	
	public int multiplicientes(int x, int y) {
		for (int i=1; i<1001; i++ ) {
			if ((i%x == 0) && (i%y == 0)) {
				finals = i;
			}
		}
		return finals;
	}
}
