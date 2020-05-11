package fr.oops.shiv;

public abstract class Drwaing {

	private int radius;

	public void setRadius(int Radius) {
		this.radius = Radius;
	}

	public int getRadius() {
		return this.radius;
	}

	abstract void draw();

}
