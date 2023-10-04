package ar.edu.unq.po2.tp3;

public class Point {
	private int x;
	private int y;
	
	public Point() {
		this.x=0;
		this.y=0;
	}

	public int getX() {
		return x;
	}

	public void movePoint(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getY() {
		return y;
	}
	
	public void sumarPoint(Point p) {
		this.x = x + p.getX();
		this.y = y + p.getY();	
	}
}
