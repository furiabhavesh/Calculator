package explorer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarsRoverAcceptanceTest {

    @Test
    public void roverNavigatesThePlateau(){

        MarsRover.setX(3);
        MarsRover.setY(3);
        MarsRover.setDir("E");

        for (char command : "MMRMMRMRRM".toCharArray()) {
            MarsRover.rove(command);
        }

        assertEquals(5, MarsRover.getX());
        assertEquals(1, MarsRover.getY());
        assertEquals("E", MarsRover.getDir());
    }
}
