package View;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import model.Plateaus;
import model.Rover;

import controller.RoverController;

public class RoverView {

	public static void main(String[] args) {

		Plateaus plateaus = new Plateaus("5 5");
		RoverController roverController = new RoverController(plateaus);

		Map<String, String> inputLines = new HashMap<String, String>();
		inputLines.put("1 2 N", "LMLMLMLMM");
		inputLines.put("3 3 E", "MMRMMRMRRM");

		roverController.controlRover(inputLines);

		System.out.println(showRoversCoordinatesAndHeadings(roverController));
	}

	public static String showRoversCoordinatesAndHeadings(
			RoverController controller) {
		StringBuilder output = new StringBuilder();

		for (Rover rover : controller.getRovers())
			output.append(rover.getCoordenada().getX() + " "
					+ rover.getCoordenada().getY() + " "
					+ rover.getOrientacion() + "\n");

		return output.toString();
	}
}
