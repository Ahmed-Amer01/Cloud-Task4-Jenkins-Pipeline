package test;
import org.junit.Test;
import org.junit.Assert;

import main.Calculator;

public class CalculatorTest {
    
    @Test
    public void testAddPositive() {
        Calculator calculator = new Calculator();
        double a = 5;
        double b = 3;
        double expected = 8;

        double actual = calculator.add(a, b);
        Assert.assertEquals(expected, actual, 0.0000000);
    }

    @Test
    public void testAddNegative() {
        Calculator calculator = new Calculator();
        double a = -5;
        double b = -3;
        double expected = -8;

        double actual = calculator.add(a, b);
        Assert.assertEquals(expected, actual, 0.0000000);
    }

    @Test
    public void testAddZero() {
        Calculator calculator = new Calculator();
        double a = 3;
        double b = 0;
        double expected = 3;

        double actual = calculator.add(a, b);
        Assert.assertEquals(expected, actual, 0.0000000);
    }

    @Test
    public void testAddAll() {
        Calculator calculator = new Calculator();
        double a = -5;
        double b = 3;
        double c = 0;
        double expected = -2;

        double actual = calculator.add(a, calculator.add(b, c));
        Assert.assertEquals(expected, actual, 0.0000000);
    }

    @Test
    public void testSubtractPositiveBiggerFirst() {
        Calculator calculator = new Calculator();
        double a = 5;
        double b = 3;
        double expected = 2;

        double actual = calculator.subtract(a, b);
        Assert.assertEquals(expected, actual, 0.0000000);
    }

    @Test
    public void testSubtractPositiveSmallerFirst() {
        Calculator calculator = new Calculator();
        double a = 3;
        double b = 5;
        double expected = -2;

        double actual = calculator.subtract(a, b);
        Assert.assertEquals(expected, actual, 0.0000000);
    }

    @Test
    public void testSubtractNegativeSmallerFirst() {
        Calculator calculator = new Calculator();
        double a = -5;
        double b = -3;
        double expected = -2;

        double actual = calculator.subtract(a, b);
        Assert.assertEquals(expected, actual, 0.0000000);
    }

    @Test
    public void testSubtractNegativeBiggerFirst() {
        Calculator calculator = new Calculator();
        double a = -3;
        double b = -5;
        double expected = 2;

        double actual = calculator.subtract(a, b);
        Assert.assertEquals(expected, actual, 0.0000000);
    }

    @Test
    public void testSubtractZeroFromPos() {
        Calculator calculator = new Calculator();
        double a = 3;
        double b = 0;
        double expected = 3;

        double actual = calculator.subtract(a, b);
        Assert.assertEquals(expected, actual, 0.0000000);
    }

    @Test
    public void testSubtractPosFromZero() {
        Calculator calculator = new Calculator();
        double a = 0;
        double b = 3;
        double expected = -3;

        double actual = calculator.subtract(a, b);
        Assert.assertEquals(expected, actual, 0.0000000);
    }

    @Test
    public void testSubtractZeroFromNeg() {
        Calculator calculator = new Calculator();
        double a = -3;
        double b = 0;
        double expected = -3;

        double actual = calculator.subtract(a, b);
        Assert.assertEquals(expected, actual, 0.0000000);
    }

    @Test
    public void testSubtractNegFromZero() {
        Calculator calculator = new Calculator();
        double a = 0;
        double b = -3;
        double expected = 3;

        double actual = calculator.subtract(a, b);
        Assert.assertEquals(expected, actual, 0.0000000);
    }

    @Test
    public void testSubtractAll() {
        Calculator calculator = new Calculator();
        double a = -5;
        double b = 3;
        double c = 0;
        double expected = -8;

        double actual = calculator.subtract(a, calculator.subtract(b, c));
        Assert.assertEquals(expected, actual, 0.0000000);
    }

    @Test
    public void testMultiplyPositive() {
        Calculator calculator = new Calculator();
        double a = 5;
        double b = 3;
        double expected = 15;

        double actual = calculator.multiply(a, b);
        Assert.assertEquals(expected, actual, 0.0000000);
    }

    @Test
    public void testMultiplyNegative() {
        Calculator calculator = new Calculator();
        double a = -5;
        double b = -3;
        double expected = 15;

        double actual = calculator.multiply(a, b);
        Assert.assertEquals(expected, actual, 0.0000000);
    }

    @Test
    public void testMultiplyPosNeg() {
        Calculator calculator = new Calculator();
        double a = 5;
        double b = -3;
        double expected = -15;

        double actual = calculator.multiply(a, b);
        Assert.assertEquals(expected, actual, 0.0000000);
    }

    @Test
    public void testMultiplyNegPos() {
        Calculator calculator = new Calculator();
        double a = -5;
        double b = 3;
        double expected = -15;

        double actual = calculator.multiply(a, b);
        Assert.assertEquals(expected, actual, 0.0000000);
    }

    @Test
    public void testMultiplyZero() {
        Calculator calculator = new Calculator();
        double a = 3;
        double b = 0;
        double expected = 0;

        double actual = calculator.multiply(a, b);
        Assert.assertEquals(expected, actual, 0.0000000);
    }

    @Test
    public void testMultiplyAll() {
        Calculator calculator = new Calculator();
        double a = -5;
        double b = 3;
        double c = 0;
        double expected = 0;

        double actual = calculator.multiply(a, calculator.multiply(b, c));
        Assert.assertEquals(expected, actual, 0.0000000);
    }

    @Test
    public void testDividePositiveBiggerFirst() {
        Calculator calculator = new Calculator();
        double a = 6;
        double b = 3;
        double expected = 2;

        double actual = calculator.divide(a, b);
        Assert.assertEquals(expected, actual, 0.0000000);
    }

    @Test
    public void testDividePositiveSmallerFirst() {
        Calculator calculator = new Calculator();
        double a = 3;
        double b = 6;
        double expected = 0.5;

        double actual = calculator.divide(a, b);
        Assert.assertEquals(expected, actual, 0.0000000);
    }

    @Test
    public void testDivideNegativeBiggerFirst() {
        Calculator calculator = new Calculator();
        double a = -6;
        double b = -3;
        double expected = 2;

        double actual = calculator.divide(a, b);
        Assert.assertEquals(expected, actual, 0.0000000);
    }

    @Test
    public void testDivideNegativeSmallerFirst() {
        Calculator calculator = new Calculator();
        double a = -3;
        double b = -6;
        double expected = 0.5;

        double actual = calculator.divide(a, b);
        Assert.assertEquals(expected, actual, 0.0000000);
    }

    @Test
    public void testDividePosNeg() {
        Calculator calculator = new Calculator();
        double a = 6;
        double b = -3;
        double expected = -2;

        double actual = calculator.divide(a, b);
        Assert.assertEquals(expected, actual, 0.0000000);
    }

    @Test
    public void testDivideNegPos() {
        Calculator calculator = new Calculator();
        double a = -6;
        double b = 3;
        double expected = -2;

        double actual = calculator.divide(a, b);
        Assert.assertEquals(expected, actual, 0.0000000);
    }

    @Test
    public void testDivideZeroOnPos() {
        Calculator calculator = new Calculator();
        double a = 0;
        double b = 3;
        double expected = 0;

        double actual = calculator.divide(a, b);
        Assert.assertEquals(expected, actual, 0.0000000);
    }

    @Test
    public void testDivideZeroOnNeg() {
        Calculator calculator = new Calculator();
        double a = 0;
        double b = -3;
        double expected = 0;

        double actual = calculator.divide(a, b);
        Assert.assertEquals(expected, actual, 0.0000000);
    }

    @Test
    public void testDivideByZero() {
        Calculator calculator = new Calculator();
        double a = 3;
        double b = 0;
        
        IllegalArgumentException exception = Assert.assertThrows(IllegalArgumentException.class, () -> calculator.divide(a, b));

        Assert.assertEquals("Cannot divide by zero.", exception.getMessage());
    }

    @Test
    public void testPowerPosPos() {
        Calculator calculator = new Calculator();
        double a = 2;
        double b = 3;
        double expected = 8;

        double actual = calculator.power(a, b);
        Assert.assertEquals(expected, actual, 0.0000000);
    }

    @Test
    public void testPowerPosNeg() {
        Calculator calculator = new Calculator();
        double a = 2;
        double b = -3;
        double expected = 0.125;

        double actual = calculator.power(a, b);
        Assert.assertEquals(expected, actual, 0.0000000);
    }

    @Test
    public void testPowerNegPos() {
        Calculator calculator = new Calculator();
        double a = -2;
        double b = 3;
        double expected = -8;

        double actual = calculator.power(a, b);
        Assert.assertEquals(expected, actual, 0.0000000);
    }

    @Test
    public void testPowerNegNeg() {
        Calculator calculator = new Calculator();
        double a = -2;
        double b = -2;
        double expected = 0.25;

        double actual = calculator.power(a, b);
        Assert.assertEquals(expected, actual, 0.0000000);
    }

    @Test
    public void testPowerZero() {
        Calculator calculator = new Calculator();
        double a = 0;
        double b = 3;
        double expected = 0;

        double actual = calculator.power(a, b);
        Assert.assertEquals(expected, actual, 0.0000000);
    }

    @Test
    public void testPowerByZero() {
        Calculator calculator = new Calculator();
        double a = 3;
        double b = 0;
        double expected = 1;
        
        double actual = calculator.power(a, b);
        Assert.assertEquals(expected, actual, 0.0000000);
    }

    @Test
    public void testSquareRootPos() {
        Calculator calculator = new Calculator();
        double a = 25;
        double expected = 5;

        double actual = calculator.squareRoot(a);
        Assert.assertEquals(expected, actual, 0.0000000);
    }

    @Test
    public void testSquareRootNeg() {
        Calculator calculator = new Calculator();
        double a = -25;
        
        IllegalArgumentException exception = Assert.assertThrows(IllegalArgumentException.class, () -> calculator.squareRoot(a));

        Assert.assertEquals("Cannot take the square root of a negative number.", exception.getMessage());
    }

    @Test
    public void testSquareRootZero() {
        Calculator calculator = new Calculator();
        double a = 0;
        double expected = 0;
        
        double actual = calculator.squareRoot(a);
        Assert.assertEquals(expected, actual, 0.0000000);
    }
}
