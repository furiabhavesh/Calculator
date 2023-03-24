import com.ee.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorSpecs {
    @Test
    public void addTwoNumbers() {
        //given
        Calculator calculator = new Calculator();


        //when - then
        assertEquals(5.0, calculator.add(2, 3));
        assertEquals(9.0, calculator.add(1, 8));
    }

    @Test
    public void subtractTwoNumbers() {
        //given
        Calculator calculator = new Calculator();

        //when
        double difference = calculator.subtract(2.0, 3.0);

        //then
        assertEquals(-1.0, difference);

    }
}
