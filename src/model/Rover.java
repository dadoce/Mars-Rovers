package model;

public class Rover {

	private Coordinate coordenada;
	private Heading heading;

	public Rover(Coordinate coordinate, Heading roversHeading) {
		coordenada = coordinate;
		heading = roversHeading;
	}

	public void turn(String direction) {
		if (direction.equals("L"))
			heading.turnLeft(this);
		else if (direction.equals("R"))
			heading.turnRight(this);
	}

	public void move() {
		heading.move(coordenada);
	}

	public String getOrientacion() {
		return heading.getOrientation();
	}

	public void setHeading(Heading heading) {
		this.heading = heading;
	}

	public Coordinate getCoordenada() {
		return coordenada;
	}
}
