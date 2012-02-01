package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import model.Coordinate;
import model.Heading;
import model.HeadingToEast;
import model.HeadingToNorth;
import model.HeadingToSouth;
import model.HeadingToWest;
import model.Plateaus;
import model.Rover;

public class RoverController {

	private List<Rover> rovers;
	private Plateaus plateaus;

	public RoverController(Plateaus plateaus) {
		this.plateaus = plateaus;
		rovers = new ArrayList<Rover>();
	}

	public void controlRover(Map<String, String> commands) {
		Set<String> dado = commands.keySet();

		for (String roverLabel : dado) {
			Rover rover = getRover(roverLabel);
			moveAndOrTurnRover(rover, commands.get(roverLabel));
			rovers.add(rover);
		}
	}

	private Rover getRover(String roverLabel) {
		String[] identifiers = roverLabel.split(" ");

		int coordinateX = Integer.parseInt(identifiers[0]);
		int coordinateY = Integer.parseInt(identifiers[1]);			
		char orientation = identifiers[2].charAt(0);
		
		return new Rover(new Coordinate(coordinateX, coordinateY),
				getHeading(orientation));
	}

	private void moveAndOrTurnRover(Rover rover, String instructions) {
		for (char instruction : instructions.toCharArray()) 
			if (isToMove(instruction))
				rover.move();		
			else if (isToTurn(instruction))
				rover.turn(String.valueOf(instruction));
	}

	private Heading getHeading(char orientation) {
		Heading heading = null;

		switch (orientation) {
		case 'N':
			heading = new HeadingToNorth();
			break;
		case 'S':
			heading = new HeadingToSouth();
			break;
		case 'E':
			heading = new HeadingToEast();
			break;
		case 'W':
			heading = new HeadingToWest();
			break;
		default:
			System.out.println("Ups!");
		}

		return heading;
	}

	private boolean isToMove(char instruction) {
		return instruction == 'M';
	}

	private boolean isToTurn(char instruction) {
		return instruction == 'L' || instruction == 'R';
	}	

	public List<Rover> getRovers() {
		return rovers;
	}
}
