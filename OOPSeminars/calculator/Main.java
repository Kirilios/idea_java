package OOPSeminars.calculator;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Logger logger = new Logger();
        Calculator calculator = new Calculator(logger);
        Random rnd = new Random();
        double num1 = rnd.nextDouble(999);
        double num2 = rnd.nextDouble(999);
        Addition add = new Addition();
        double sum = calculator.makeOperation(add, num1, num2);
        String formattedSum = String.format("%.2f", sum);
        logger.log("Sum: " + formattedSum);
        Multiplication multi = new Multiplication();
        double prod = calculator.makeOperation(multi, num1, num2);
        String formattedProd = String.format("%.2f", prod);
        logger.log("Product: " + formattedProd);
        Division div = new Division();
        double quotient = calculator.makeOperation(div, num1, num2);
        String formattedQuot = String.format("%.2f", quotient);
        logger.log("Quotient: " + formattedQuot);
    }
}
