package main;
public class Calculator {
    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero.");
        }
        
        return a / b;
    }

    public double power(double a, double b) {
        return (double) Math.pow(a, b);
    }

    public double squareRoot(double a) {
        if (a < 0) {
            throw new IllegalArgumentException("Cannot take the square root of a negative number.");
        }

        return (double) Math.sqrt(a);
    }
}
