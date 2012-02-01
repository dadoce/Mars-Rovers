package controllerTest;

import java.util.ArrayList;

import junit.framework.Assert;
import model.Rover;

import org.junit.Test;

import controller.RoverController;

public class RoverControllerTest {
	
	@Test
	public void shouldMoveAndTurnRoverToExpectedPosition1(){
		Rover rover = new Rover(1,2,"N");
		String instructions = "LMLMLMLMM";
		int expectedXCoordinate = 1;
		int expectedYCoordinate = 3;
		String expectedHeading = "N";
		
		RoverController roverController = new RoverController();
		roverController.moveAndOrTurnRover(rover, instructions);
		boolean isExpectedXCoordinate = rover.getXCoordinate() == expectedXCoordinate;
		boolean isExpectedYCoordinate = rover.getYCoordinate() == expectedYCoordinate;
		boolean isExpectedHeading = rover.getHeading().equals(expectedHeading);
		Assert.assertTrue(isExpectedXCoordinate && isExpectedYCoordinate && isExpectedHeading); 					
	}
	
	
	@Test
	public void shouldMoveAndTurnRoverToExpectedPosition2(){
		Rover rover = new Rover(3,3,"E");
		String instructions = "MMRMMRMRRM";
		int expectedXCoordinate = 5;
		int expectedYCoordinate = 1;
		String expectedHeading = "E";
		
		RoverController roverController = new RoverController();
		roverController.moveAndOrTurnRover(rover, instructions);
		boolean isExpectedXCoordinate = rover.getXCoordinate() == expectedXCoordinate;
		boolean isExpectedYCoordinate = rover.getYCoordinate() == expectedYCoordinate;
		boolean isExpectedHeading = rover.getHeading().equals(expectedHeading);
		Assert.assertTrue(isExpectedXCoordinate && isExpectedYCoordinate && isExpectedHeading); 					
	}
	
	@Test
	public void shouldPrintExpectedOutputForThisInputTest(){
		ArrayList<String> inputLines = new ArrayList<String>();
		inputLines.add("5 5");
		inputLines.add("1 2 N");
		inputLines.add("LMLMLMLMM");
		inputLines.add("3 3 E");
		inputLines.add("MMRMMRMRRM");
		RoverController roverController = new RoverController();
		roverController.setInputLines(inputLines);
		roverController.setUpCoordinatesAndInstructions();
		roverController.demandRovesToDivideAndConquerTerritory();
		System.out.println(roverController.getRoversCoordinatesAndHeadings());
		String expectedOutput = "1 3 N\n5 1 E\n";
		
		Assert.assertEquals(expectedOutput, roverController.getRoversCoordinatesAndHeadings());
		
	}

}
