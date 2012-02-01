package model;

public class HeadingToNorth implements Heading {

	@Override
	public void turnLeft(Rover rover) {
		rover.setHeading(new HeadingToWest());
	}

	@Override
	public void turnRight(Rover rover) {
		rover.setHeading(new HeadingToEast());
	}

	@Override
	public void move(Rover rover) {
		rover.setYCoordinate(rover.getYCoordinate() + 1);
	}

	@Override
	public String getPosition() {
		return "N";
	}


}
