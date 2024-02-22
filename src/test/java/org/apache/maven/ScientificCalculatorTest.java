package org.apache.maven;

import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.*;


public class ScientificCalculatorTest {

    @Test
    public void testSquareRoot() {
        assertEquals(4.0, Math.sqrt(16), 0.001);
        assertEquals(5.0, Math.sqrt(25), 0.001);
        assertEquals(2.0, Math.sqrt(4), 0.001);
    }

    @Test
    public void testFactorial() {
        assertEquals(1, ScientificCalculator.factorial(0));
        assertEquals(1, ScientificCalculator.factorial(1));
        assertEquals(120, ScientificCalculator.factorial(5));
    }

    @Test
    public void testNaturalLogarithm() {
        assertEquals(0.0, Math.log(1), 0.001);
        assertEquals(1.609, Math.log(5), 0.001);
        assertEquals(2.302, Math.log(10), 0.001);
    }

    @Test
    public void testPower() {
        assertEquals(8.0, Math.pow(2, 3), 0.001);
        assertEquals(1.0, Math.pow(5, 0), 0.001);
        assertEquals(1024.0, Math.pow(2, 10), 0.001);
    }
}
