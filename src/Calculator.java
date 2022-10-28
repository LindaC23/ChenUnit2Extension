public class Calculator {
    // no instance variables

    // constructor
    public Calculator() {};

    // method that multiplies the two numbers provided and returns the value
    public double multiply(double num1, double num2){
        return num1 * num2;
    }

    // method that divides the first number provided by the second number and returns the value
    public double divide(double num1, double num2){
        return num1 / num2;
    }

    // method that adds the two numbers provided and returns the value
    public double add(double num1, double num2){
        return num1 + num2;
    }

    // method that subtracts the first number provided by the second number and returns the value
    public double subtract(double num1, double num2){
        return num1 - num2;
    }

    // method that mods the first number provided by the second number and returns the value
    public double mod(double num1, double num2){
        return num1 % num2;
    }

    // method that raises the first number provided to the power of the second number
    public double exponent(double num1, double num2){
        return Math.pow(num1, num2);
    }

}
