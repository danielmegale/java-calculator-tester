package org.java.calculator;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {

    private static Calculator calculator;

    @BeforeAll
    public static void setup() {
        calculator = new Calculator();
    }

    @Test
    public void testAddition() {
        float result = calculator.add(5.0f, 3.0f);
        assertEquals(8.0f, result, 0.001f);
    }

    @Test
    public void testSubtraction() {
        float result = calculator.subtract(5.0f, 3.0f);
        assertEquals(2.0f, result, 0.001f);
    }

    @Test
    public void testDivision() throws Exception {
        float result = calculator.divide(6.0f, 2.0f);
        assertEquals(3.0f, result, 0.001f);
    }

    @Test
    public void testMultiplication() {
        float result = calculator.multiply(4.0f, 3.0f);
        assertEquals(12.0f, result, 0.001f);
    }

    @Test
    public void testDivisionByZero() {
        assertThrows(ArithmeticException.class, () -> calculator.divide(5.0f, 0.0f));
    }
}
