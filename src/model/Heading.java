package model;

public interface Heading {

	void turnLeft(Rover rover);
	void turnRight(Rover rover);
	void move(Coordinate coordenada);
	String getOrientation();
}
