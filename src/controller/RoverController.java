package controller;

import java.util.ArrayList;

import model.Rover;

public class RoverController {
	

	private ArrayList<String> inputLines;
	private ArrayList<Rover> roverList;
	private ArrayList<String> instructionList;
	//Will be used for further implementations at rover movement limits or whatever :)
	private int maxPlateausXCoordinate;
	private int maxPlateausYCoordinate;
	
	public RoverController() {
		setInputLines(new ArrayList<String>());
		roverList = new ArrayList<Rover>();
		instructionList = new ArrayList<String>();
	}
	
	public void setUpCoordinatesAndInstructions(){
		int inputLineNumber = 0;
		for (String inputLine : inputLines) {
			inputLineNumber++;
			if (inputLineNumber == 1) {
				maxPlateausXCoordinate = Integer.parseInt(inputLine.substring(0, 1));
				maxPlateausYCoordinate = Integer.parseInt(inputLine.substring(2, 3));
			} else if ( (inputLineNumber%2) == 0){
				roverList.add(new Rover(Integer.parseInt(inputLine.substring(0, 1)), 
										Integer.parseInt(inputLine.substring(2, 3)),
										inputLine.substring(4, 5)));
			} else if ( ((inputLineNumber%2) == 1) && (inputLineNumber != 1) ){
				instructionList.add(inputLine);
			}
			
		}
	}

	public void moveAndOrTurnRover(Rover rover, String instructions){
		for (char instruction : instructions.toCharArray()) {
			if (instruction=='M'){
					rover.move();
			} else if (instruction=='L' || instruction=='R' ){
				rover.turn(String.valueOf(instruction));
			}
		}
	}
	
	public void demandRovesToDivideAndConquerTerritory(){
		//CONQUER ALL TERRITORY! \o_
		int count = 0;
		for (Rover rover : roverList) {
			moveAndOrTurnRover(rover, instructionList.get(count));
			count++;
		}
	}
	
	public String getRoversCoordinatesAndHeadings(){
		StringBuffer output = new StringBuffer("");
		for (Rover rover : roverList) {
			output.append(rover.getXCoordinate())
				  .append(" ")
				  .append(rover.getYCoordinate())
				  .append(" ")
				  .append(rover.getHeading())
				  .append("\n");
		}
		return output.toString();
	}

	public ArrayList<String> getInputLines() {
		return inputLines;
	}

	public void setInputLines(ArrayList<String> inputLines) {
		this.inputLines = inputLines;
	}

	
	
	
}
