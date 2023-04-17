import com.ee.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorSpecs {

    private Calculator calculator;

    @BeforeEach
    public void setup(){
        calculator = new Calculator();
    }
    @Test
    public void addTwoNumbers() {
        //when - then
        assertEquals(5.0, calculator.add(2, 3));
        assertEquals(9.0, calculator.add(1, 8));
    }

    @Test
    public void subtractTwoNumbers() {
        //when - then
        assertEquals(-1.0, calculator.subtract(2.0, 3.0));
        assertEquals(-2.0, calculator.subtract(2.0, 4.0));
    }

    @Test
    public void divideTwoNumbersResultsInSixDecimalPrecision() {
        // when - then
        assertEquals(0.666666, calculator.divide(2.0, 3.0));
        assertEquals(0.333333, calculator.divide(1.0, 3.0));
        assertEquals(0.999999, calculator.divide(5.0, 5.000001));
    }

    @Test
    public void divisionByZeroResultsInErrorMessage() {
        // when - then
        assertThrows(ArithmeticException.class, ()-> calculator.divide(2,0));
    }

    @Test
    public void replayAdd() {
        //Given
        calculator.add(5,3);
        //When
        String actual = calculator.replay();
        //Then
        assertEquals("5.0 + 3.0 = 8.0", actual);
    }
}
