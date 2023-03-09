package explorer;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarsRoverSpecs {
    @Nested
    @DisplayName("When rover is standing @ 3,3")
    class AtPosition3X3 {

        @BeforeEach
        public void setRoversInitialPosition(){
            MarsRover.setX(3);
            MarsRover.setY(3);
        }

        @Nested
        @DisplayName("facing towards north")
        class FacingNorth{
            @BeforeEach
            public void facingNorth(){
                MarsRover.setDir("N");
            }

            @Test
            public void turningLeftHeadsToWest(){
                MarsRover.rove('L');

                assertEquals(3, MarsRover.getX());
                assertEquals(3, MarsRover.getY());
                assertEquals("W", MarsRover.getDir());
            }

            @Test
            public void turningRightHeadsToEast(){
                MarsRover.rove('R');

                assertEquals(3, MarsRover.getX());
                assertEquals(3, MarsRover.getY());
                assertEquals("E", MarsRover.getDir());
            }

            @Test
            public void movingHeadsToNorth(){
                MarsRover.rove('M');

                assertEquals(3, MarsRover.getX());
                assertEquals(4, MarsRover.getY());
                assertEquals("N", MarsRover.getDir());
            }
        }

        @Nested
        @DisplayName("facing towards south")
        class FacingSouth{
            @BeforeEach
            public void facingNorth(){
                MarsRover.setDir("S");
            }

            @Test
            public void turningLeftHeadsToEast(){
                MarsRover.rove('L');

                assertEquals(3, MarsRover.getX());
                assertEquals(3, MarsRover.getY());
                assertEquals("E", MarsRover.getDir());
            }

            @Test
            public void turningRightHeadsToWest(){
                MarsRover.rove('R');

                assertEquals(3, MarsRover.getX());
                assertEquals(3, MarsRover.getY());
                assertEquals("W", MarsRover.getDir());
            }

            @Test
            public void movingHeadsToSouth(){
                MarsRover.rove('M');

                assertEquals(3, MarsRover.getX());
                assertEquals(2, MarsRover.getY());
                assertEquals("S", MarsRover.getDir());
            }
        }

        @Nested
        @DisplayName("facing towards east")
        class FacingEast{
            @BeforeEach
            public void facingEast(){
                MarsRover.setDir("E");
            }

            @Test
            public void turningLeftHeadsToNorth(){
                MarsRover.rove('L');

                assertEquals(3, MarsRover.getX());
                assertEquals(3, MarsRover.getY());
                assertEquals("N", MarsRover.getDir());
            }

            @Test
            public void turningRightHeadsToSouth(){
                MarsRover.rove('R');

                assertEquals(3, MarsRover.getX());
                assertEquals(3, MarsRover.getY());
                assertEquals("S", MarsRover.getDir());
            }

            @Test
            public void movingHeadsToEast(){
                MarsRover.rove('M');

                assertEquals(4, MarsRover.getX());
                assertEquals(3, MarsRover.getY());
                assertEquals("E", MarsRover.getDir());
            }
        }

        @Nested
        @DisplayName("facing towards west")
        class FacingWest{
            @BeforeEach
            public void facingWest(){
                MarsRover.setDir("W");
            }

            @Test
            public void turningLeftHeadsToSouth(){
                MarsRover.rove('L');

                assertEquals(3, MarsRover.getX());
                assertEquals(3, MarsRover.getY());
                assertEquals("S", MarsRover.getDir());
            }

            @Test
            public void turningRightHeadsToNorth(){
                MarsRover.rove('R');

                assertEquals(3, MarsRover.getX());
                assertEquals(3, MarsRover.getY());
                assertEquals("N", MarsRover.getDir());
            }

            @Test
            public void movingHeadsToWest(){
                MarsRover.rove('M');

                assertEquals(2, MarsRover.getX());
                assertEquals(3, MarsRover.getY());
                assertEquals("W", MarsRover.getDir());
            }
        }
    }
}
