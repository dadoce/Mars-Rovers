package model;

public class HeadingToWest implements Heading{

	@Override
	public void turnLeft(Rover rover) {
		rover.setHeading(new HeadingToSouth());
	}

	@Override
	public void turnRight(Rover rover) {
		rover.setHeading(new HeadingToNorth());
	}

	@Override
	public String getOrientation() {
		return "W";
	}

	@Override
	public void move(Coordinate coordinate) {
		coordinate.setX(coordinate.getX() - 1);
	}

}
