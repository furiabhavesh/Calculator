package com.ee;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Calculator {
    public double add(double operand1, double operand2) {
        return operand1+operand2;
    }

    public double subtract(double operand1, double operand2) {
        return operand1-operand2;
    }

    public double divide(double dividend, double divisor) {
        double quotient = dividend/divisor;
        return BigDecimal.valueOf(quotient).setScale(6, RoundingMode.DOWN).doubleValue();
    }
}
