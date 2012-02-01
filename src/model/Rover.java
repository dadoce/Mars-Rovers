package model;

public class Rover {

	private int xCoordinate;
	private int yCoordinate;
	//private String heading;
	private Heading heading;
	
	public Rover(int roversXCoordinate, int roversYCoordinate,
			Heading roversHeading) {
		this.xCoordinate = roversXCoordinate;
		this.yCoordinate = roversYCoordinate;
		this.heading = roversHeading;
	}

	public int getXCoordinate() {
		return xCoordinate;
	}

	public void setXCoordinate(int xCoordinate) {
		this.xCoordinate = xCoordinate;
	}

	public int getYCoordinate() {
		return yCoordinate;
	}

	public void setYCoordinate(int yCoordinate) {
		this.yCoordinate = yCoordinate;
	}

	public String getHeading() {
		return heading.getPosition();
	}

	public void setHeading(Heading heading) {
		this.heading = heading;
	}

	public void turn(String direction) {
		if (direction.equals("L")) 
			heading.turnLeft(this);
		else if (direction.equals("R")) 
			heading.turnRight(this);
		
/*		
		if (this.heading.equals("E")) {
			if (direction.equals("L")) {
				this.heading = "N";
			} else if (direction.equals("R")) {
				this.heading = "S";
			}
		} else if (this.heading.equals("N")) {
			if (direction.equals("L")) {
				this.heading = "W";
			} else if (direction.equals("R")) {
				this.heading = "E";
			}
		} else if (this.heading.equals("W")) {
			if (direction.equals("L")) {
				this.heading = "S";
			} else if (direction.equals("R")) {
				this.heading = "N";
			}
		} else if (this.heading.equals("S")) {
			if (direction.equals("L")) {
				this.heading = "E";
			} else if (direction.equals("R")) {
				this.heading = "W";
			}
		}
*/
	}

	public void move() {
		heading.move(this);
/*
		if (this.heading.equals("E")) {
			this.xCoordinate += 1;
		} else if (this.heading.equals("N")) {
			this.yCoordinate += 1;
		} else if (this.heading.equals("W")) {
			this.xCoordinate -= 1;
		} else if (this.heading.equals("S")) {
			this.yCoordinate -= 1;
		}
*/
	}

}
