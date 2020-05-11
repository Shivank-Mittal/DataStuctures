package fr.oops.shiv;

public class Square extends Drwaing {

	int value;

	public void create() {
		setRadius(3);
		value = getRadius();
	}

	@Override
	void draw() {
		// TODO Auto-generated method stub

		System.out.println("Creating a square with radius : " + value);

	}


}
