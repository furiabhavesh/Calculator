import com.ee.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorSpecs {
    @Test
    public void addTwoNumbers() {
        //given
        Calculator calculator = new Calculator();

        //when
        double total1 = calculator.add(2, 3);
        double total2 = calculator.add(1, 8);

        //then
        assertEquals(5, total1);
        assertEquals(9, total2);
    }
}
