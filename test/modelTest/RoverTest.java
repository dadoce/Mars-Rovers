package modelTest;

import junit.framework.Assert;
import model.HeadingToEast;
import model.HeadingToNorth;
import model.HeadingToSouth;
import model.HeadingToWest;
import model.Rover;

import org.junit.Test;

public class RoverTest {


	@Test
	public void shouldFaceNorthIfRoverFacingEastTurnsLeft(){
		Rover rover = new Rover(0,0,new HeadingToEast());
		rover.turn("L");
		Assert.assertTrue(rover.getHeading().equals("N"));
	}

	@Test
	public void shouldFaceSouthIfRoverFacingEastTurnsRight(){
		Rover rover = new Rover(0,0,new HeadingToEast());
		rover.turn("R");
		Assert.assertTrue(rover.getHeading().equals("S"));
	}

	@Test
	public void shouldFaceWestIfRoverFacingNorthTurnsLeft(){
		Rover rover = new Rover(0,0,new HeadingToNorth());
		rover.turn("L");
		Assert.assertTrue(rover.getHeading().equals("W"));
	}
	

	@Test
	public void shouldFaceEastIfRoverFacingNorthTurnsRight(){
		Rover rover = new Rover(0,0,new HeadingToNorth());
		rover.turn("R");
		Assert.assertTrue(rover.getHeading().equals("E"));
	}


	@Test
	public void shouldFaceSouthIfRoverFacingWestTurnsLeft(){
		Rover rover = new Rover(0,0,new HeadingToWest());
		rover.turn("L");
		Assert.assertTrue(rover.getHeading().equals("S"));
	}

	@Test
	public void shouldFaceNorthIfRoverFacingWestTurnsRight(){
		Rover rover = new Rover(0,0,new HeadingToWest());
		rover.turn("R");
		Assert.assertTrue(rover.getHeading().equals("N"));
	}

	@Test
	public void shouldFaceEastIfRoverFacingSouthTurnsLeft(){
		Rover rover = new Rover(0,0,new HeadingToSouth());
		rover.turn("L");
		Assert.assertTrue(rover.getHeading().equals("E"));
	}

	@Test
	public void shouldFaceWestIfRoverFacingSouthTurnsRight(){
		Rover rover = new Rover(0,0,new HeadingToSouth());
		rover.turn("R");
		Assert.assertTrue(rover.getHeading().equals("W"));
	}

	@Test
	public void shouldIncreaseXCoordinateByOneIfRoverFacingEastMoves(){
		Rover rover = new Rover(0,0,new HeadingToEast());
		rover.move();
		Assert.assertTrue((rover.getXCoordinate()==1)&&(rover.getYCoordinate()==0));
	}

	@Test
	public void shouldIncreaseYCoordinateByOneIfRoverFacingNorthMoves(){
		Rover rover = new Rover(0,0,new HeadingToNorth());
		rover.move();
		Assert.assertTrue((rover.getXCoordinate()==0)&&(rover.getYCoordinate()==1));
	}

	@Test
	public void shouldDecreaseXCoordinateByOneIfRoverFacingWestMoves(){
		Rover rover = new Rover(1,0,new HeadingToWest());
		rover.move();
		Assert.assertTrue((rover.getXCoordinate()==0)&&(rover.getYCoordinate()==0));
	}

	@Test
	public void shouldDecreaseYCoordinateByOneIfRoverFacingSouthMoves(){
		Rover rover = new Rover(0,1,new HeadingToSouth());
		rover.move();
		Assert.assertTrue((rover.getXCoordinate()==0)&&(rover.getYCoordinate()==0));
	}
	
}
