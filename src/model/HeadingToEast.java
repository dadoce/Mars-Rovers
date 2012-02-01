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
	public void move(Rover rover) {
		rover.setXCoordinate(rover.getXCoordinate() + 1);
	}

	@Override
	public String getPosition() {
		return "E";
	}
}
