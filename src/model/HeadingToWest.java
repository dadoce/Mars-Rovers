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
	public String getPosition() {
		return "W";
	}

	@Override
	public void move(Rover rover) {
		rover.setXCoordinate(rover.getXCoordinate() - 1);
	}

}
