package modelTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import model.Coordinate;
import model.Heading;
import model.HeadingToEast;
import model.HeadingToNorth;
import model.HeadingToSouth;
import model.HeadingToWest;
import model.Rover;

import org.junit.Test;

public class RoverTest {

	private Rover rover;
	
	@Test
	public void shouldFaceNorthIfRoverFacingEastTurnsLeft() {
		rover = getRover(0, 0, new HeadingToEast());
		rover.turn("L");
		
		assertEquals("N", rover.getOrientacion());
	}

	@Test
	public void shouldFaceSouthIfRoverFacingEastTurnsRight() {
		rover = getRover(0, 0, new HeadingToEast());
		rover.turn("R");
		
		assertEquals("S", rover.getOrientacion());
	}

	@Test
	public void shouldFaceWestIfRoverFacingNorthTurnsLeft() {
		rover = getRover(0, 0, new HeadingToNorth());
		rover.turn("L");
		
		assertEquals("W", rover.getOrientacion());
	}

	@Test
	public void shouldFaceEastIfRoverFacingNorthTurnsRight() {
		rover = getRover(0, 0, new HeadingToNorth());
		rover.turn("R");
		
		assertEquals("E", rover.getOrientacion());
	}

	@Test
	public void shouldFaceSouthIfRoverFacingWestTurnsLeft() {
		rover = getRover(0, 0, new HeadingToWest());
		rover.turn("L");
		
		assertEquals("S", rover.getOrientacion());
	}

	@Test
	public void shouldFaceNorthIfRoverFacingWestTurnsRight() {
		rover = getRover(0, 0, new HeadingToWest());
		rover.turn("R");
		
		assertEquals("N", rover.getOrientacion());
	}

	@Test
	public void shouldFaceEastIfRoverFacingSouthTurnsLeft() {
		rover = getRover(0, 0, new HeadingToSouth());
		rover.turn("L");
		
		assertEquals("E", rover.getOrientacion());
	}

	@Test
	public void shouldFaceWestIfRoverFacingSouthTurnsRight() {
		rover = getRover(0, 0, new HeadingToSouth());
		rover.turn("R");
		
		assertEquals("W", rover.getOrientacion());
	}

	@Test
	public void shouldIncreaseXCoordinateByOneIfRoverFacingEastMoves() {
		rover = getRover(0, 0, new HeadingToEast());
		rover.move();

		assertTrue(rover.getCoordenada().equals(new Coordinate(1, 0)));
	}

	@Test
	public void shouldIncreaseYCoordinateByOneIfRoverFacingNorthMoves() {
		rover = getRover(0, 0, new HeadingToNorth());
		rover.move();

		assertTrue(rover.getCoordenada().equals(new Coordinate(0, 1)));
	}

	@Test
	public void shouldDecreaseXCoordinateByOneIfRoverFacingWestMoves() {
		rover = getRover(1, 0, new HeadingToWest());
		rover.move();

		assertTrue(rover.getCoordenada().equals(new Coordinate(0, 0)));
	}

	@Test
	public void shouldDecreaseYCoordinateByOneIfRoverFacingSouthMoves() {
		rover = getRover(0, 1, new HeadingToSouth());
		rover.move();

		assertTrue(rover.getCoordenada().equals(new Coordinate(0, 0)));
	}

	private Rover getRover(final int x, final int y, final Heading heading) {
		return new Rover(new Coordinate(x, y), heading);
	}

}
