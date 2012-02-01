package model;

public class HeadingToEast implements Heading {

	@Override
	public void turnLeft(Rover rover) {
		rover.setHeading(new HeadingToNorth());
	}

	@Override
	public void turnRight(Rover rover) {
		rover.setHeading(new HeadingToSouth());
	}

	@Override
	public void move(Coordinate coordenada) {
		coordenada.setX(coordenada.getX() + 1);
	}

	@Override
	public String getOrientation() {
		return "E";
	}
}
