package controllerTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.Map;

import model.Coordinate;
import model.Heading;
import model.HeadingToEast;
import model.HeadingToNorth;
import model.Plateaus;
import model.Rover;

import org.junit.Before;
import org.junit.Test;

import controller.RoverController;

public class RoverControllerTest {

	private Plateaus plateaus;
	private RoverController roverController;
	private Coordinate expectedCoordinate;
	private Map<String, String> instructions;
	private Heading expectedHeading;

	@Before
	public void setup() {
		plateaus = new Plateaus(new Coordinate(5, 5));
		roverController = new RoverController(plateaus);
	}

	@Test
	public void shouldMoveAndTurnRoverToExpectedPosition1() {
		instructions = new HashMap<String, String>();
		instructions.put("1 2 N", "LMLMLMLMM");
		expectedCoordinate = getCoordinate(1, 3);
		expectedHeading = new HeadingToNorth();

		roverController.controlRover(instructions);
		Rover rover = roverController.getRovers().get(0);

		assertTrue(expectedCoordinate.equals(rover.getCoordenada()));
		assertEquals(expectedHeading.getOrientation(), rover.getOrientacion());
	}

	@Test
	public void shouldMoveAndTurnRoverToExpectedPosition2() {
		instructions = new HashMap<String, String>();
		instructions.put("3 3 E", "MMRMMRMRRM");
		expectedCoordinate = getCoordinate(5, 1);
		expectedHeading = new HeadingToEast();

		roverController.controlRover(instructions);
		Rover rover = roverController.getRovers().get(0);

		assertTrue(expectedCoordinate.equals(rover.getCoordenada()));
		assertEquals(expectedHeading.getOrientation(), rover.getOrientacion());
	}

	private Coordinate getCoordinate(int x, int y) {
		return new Coordinate(x, y);
	}
}
