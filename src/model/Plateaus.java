package model;

public class Plateaus {

	private Coordinate coordinate;

	public Plateaus(Coordinate coordinate) {
		this.coordinate = coordinate;
	}

	public Plateaus(String coordinate) {
		String[] coordinates = coordinate.split(" ");
		this.coordinate = new Coordinate(Integer.parseInt(coordinates[0]),
				Integer.parseInt(coordinates[1]));
	}

	public Coordinate getCoordinate() {
		return coordinate;
	}

}
