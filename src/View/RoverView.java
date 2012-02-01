package View;

import java.util.ArrayList;

import controller.RoverController;

public class RoverView {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RoverController roverController = new RoverController();
		ArrayList<String> inputLines = new ArrayList<String>();
		
		//Change the input as you want :)
		//I wanted to make a better interface and improve codes and tests
		//but didn't have enough time.
		inputLines.add("5 5");
		inputLines.add("1 2 N");
		inputLines.add("LMLMLMLMM");
		inputLines.add("3 3 E");
		inputLines.add("MMRMMRMRRM");
		
		roverController.setInputLines(inputLines);
		roverController.setUpCoordinatesAndInstructions();
		roverController.demandRovesToDivideAndConquerTerritory();
		String result = roverController.getRoversCoordinatesAndHeadings();
		
		System.out.println(result);
	}

}
