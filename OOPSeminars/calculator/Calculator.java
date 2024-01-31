package OOPSeminars.calculator;



public class Calculator {
    private Logger logger;

    public Calculator(Logger logger) {
        this.logger = logger;
    }

    public double makeOperation(Operation operation, double num1, double num2){
        double result = operation.calculate(num1,num2);
        logger.log("Operation performed: " + operation.getClass().getSimpleName()
                + ", Numbers: " + num1 + ", " + num2 + ", Result is:" + result);
        return result;

    }
}
