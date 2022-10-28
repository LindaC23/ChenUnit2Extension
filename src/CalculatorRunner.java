import java.util.Scanner;

public class CalculatorRunner {
    public static void main(String[] args) {
        // creating objects
        Calculator calc = new Calculator();
        Scanner scan = new Scanner(System.in);

        // prompting the user to enter a value
        System.out.print("Enter an expression with *, /, +, -, %, or ^: ");
        String expression = scan.nextLine();
        int indexOfOperation = -1;

        // checking for the index of the operation
        while (indexOfOperation == -1){
            if (expression.indexOf("*") != -1){
                indexOfOperation = expression.indexOf("*");
            }
            if (expression.indexOf("/") != -1){
                indexOfOperation = expression.indexOf("/");
            }
            if (expression.indexOf("+") != -1){
                indexOfOperation = expression.indexOf("+");
            }
            if (expression.indexOf("-") != -1){
                indexOfOperation = expression.indexOf("-");
            }
            if (expression.indexOf("%") != -1){
                indexOfOperation = expression.indexOf("%");
            }
            if (expression.indexOf("^") != -1){
                indexOfOperation = expression.indexOf("^");
            }
        }

        // parsing the numbers from the string
        double num1 = Double.parseDouble(expression.substring(0, indexOfOperation - 1));
        double num2 = Double.parseDouble(expression.substring(indexOfOperation + 2));

        // executing the operation
        if (expression.substring(indexOfOperation, indexOfOperation + 1).equals("*")){
            System.out.println(expression + " is: " + calc.multiply(num1, num2));
        }
        if (expression.substring(indexOfOperation, indexOfOperation + 1).equals("/")){
            System.out.println(expression + " is " + calc.divide(num1, num2));
        }
        if (expression.substring(indexOfOperation, indexOfOperation + 1).equals("+")){
            System.out.println(expression + " is " + calc.add(num1, num2));
        }
        if (expression.substring(indexOfOperation, indexOfOperation + 1).equals("-")){
            System.out.println(expression + " is " + calc.subtract(num1, num2));
        }
        if (expression.substring(indexOfOperation, indexOfOperation + 1).equals("%")){
            System.out.println(expression + " is " + calc.mod(num1, num2));
        }
        if (expression.substring(indexOfOperation, indexOfOperation + 1).equals("^")){
            System.out.println(expression + " is " + calc.exponent(num1, num2));
        }
    }

}
