package com.ee;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Calculator {

    private static final int PRECISION = 6;

    public double add(double operand1, double operand2) {
        return operand1+operand2;
    }

    public double subtract(double operand1, double operand2) {
        return operand1-operand2;
    }

    public double divide(double dividend, double divisor) {
        if(divisor == 0){
            throw new ArithmeticException("Can't divide by zero");
        }
        return BigDecimal.valueOf(dividend/divisor)
                .setScale(PRECISION, RoundingMode.DOWN)
                .doubleValue();
    }
}
