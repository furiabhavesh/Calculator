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

            @Nested
            @DisplayName("turning")
            class Turn{

                @Test
                @DisplayName("left heads to west")
                public void turningLeftHeadsToWest(){
                    MarsRover.rove('L');

                    assertEquals("W", MarsRover.getDir());
                }

                @Test
                @DisplayName("right heads to east")
                public void turningRightHeadsToEast(){
                    MarsRover.rove('R');

                    assertEquals("E", MarsRover.getDir());
                }
                @AfterEach
                public void positionDoesNotChange(){
                    assertEquals(3, MarsRover.getX());
                    assertEquals(3, MarsRover.getY());
                }
            }

            @Nested
            @DisplayName("moving ahead")
            class Move {
                @BeforeEach
                public void move() {
                    MarsRover.rove('M');
                }

                @Test
                @DisplayName("heads to north")
                public void movingHeadsToNorth(){
                    assertEquals(3, MarsRover.getX());
                    assertEquals(4, MarsRover.getY());
                    assertEquals("N", MarsRover.getDir());
                }
            }
        }

        @Nested
        @DisplayName("facing towards south")
        class FacingSouth{
            @BeforeEach
            public void facingNorth(){
                MarsRover.setDir("S");
            }

            @Nested
            @DisplayName("turning")
            class Turn{

                @Test
                @DisplayName("left heads to east")
                public void turningLeftHeadsToEast(){
                    MarsRover.rove('L');
                    assertEquals("E", MarsRover.getDir());
                }

                @Test
                @DisplayName("right heads to west")
                public void turningRightHeadsToWest(){
                    MarsRover.rove('R');
                    assertEquals("W", MarsRover.getDir());
                }

                @AfterEach
                public void positionDoesNotChange(){
                    assertEquals(3, MarsRover.getX());
                    assertEquals(3, MarsRover.getY());
                }
            }

            @Nested
            @DisplayName("moving ahead")
            class Move {
                @BeforeEach
                public void move() {
                    MarsRover.rove('M');
                }

                @Test
                @DisplayName("heads to south")
                public void movingHeadsToSouth(){
                    assertEquals(3, MarsRover.getX());
                    assertEquals(2, MarsRover.getY());
                    assertEquals("S", MarsRover.getDir());
                }
            }
        }

        @Nested
        @DisplayName("facing towards east")
        class FacingEast{
            @BeforeEach
            public void facingEast(){
                MarsRover.setDir("E");
            }

            @Nested
            @DisplayName("turning")
            class Turn{

                @Test
                @DisplayName("left heads to north")
                public void turningLeftHeadsToNorth(){
                    MarsRover.rove('L');
                    assertEquals("N", MarsRover.getDir());
                }

                @Test
                @DisplayName("right heads to south")
                public void turningRightHeadsToSouth(){
                    MarsRover.rove('R');

                    assertEquals("S", MarsRover.getDir());
                }
                @AfterEach
                public void positionDoesNotChange(){
                    assertEquals(3, MarsRover.getX());
                    assertEquals(3, MarsRover.getY());
                }
            }

            @Nested
            @DisplayName("moving ahead")
            class Move {
                @BeforeEach
                public void move() {
                    MarsRover.rove('M');
                }

                @Test
                @DisplayName("heads to east")
                public void movingHeadsToEast(){
                    assertEquals(4, MarsRover.getX());
                    assertEquals(3, MarsRover.getY());
                    assertEquals("E", MarsRover.getDir());
                }
            }
        }

        @Nested
        @DisplayName("facing towards west")
        class FacingWest{
            @BeforeEach
            public void facingWest(){
                MarsRover.setDir("W");
            }

            @Nested
            @DisplayName("turning")
            class Turn{

                @Test
                @DisplayName("left heads to south")
                public void turningLeftHeadsToWest(){
                    MarsRover.rove('L');

                    assertEquals("S", MarsRover.getDir());
                }

                @Test
                @DisplayName("right heads to north")
                public void turningRightHeadsToNorth(){
                    MarsRover.rove('R');

                    assertEquals("N", MarsRover.getDir());
                }
                @AfterEach
                public void positionDoesNotChange(){
                    assertEquals(3, MarsRover.getX());
                    assertEquals(3, MarsRover.getY());
                }
            }

            @Nested
            @DisplayName("moving ahead")
            class Move {
                @BeforeEach
                public void move() {
                    MarsRover.rove('M');
                }

                @Test
                @DisplayName("heads to west")
                public void movingHeadsToWest(){
                    assertEquals(2, MarsRover.getX());
                    assertEquals(3, MarsRover.getY());
                    assertEquals("W", MarsRover.getDir());
                }
            }
        }
    }
}
