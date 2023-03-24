import com.ee.Calculator;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
}
