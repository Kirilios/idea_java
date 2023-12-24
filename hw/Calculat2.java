package hw;

import java.util.ArrayDeque;


public class Calculat2 {

    private final ArrayDeque<Double> results = new ArrayDeque<>();

    public double calculate(char op, double a, double b) {

        double result = 0;
        if (op == '+')
            result = a + b;
        else if (op == '-')
            result = a - b;
        else if (op == '*')
            result = a * b;
        else if (op == '/')
            result = a / b;

        if (op == '<') {
            results.removeLast();
            result = results.removeLast();

        /* Вариант без удаления элементов
        Integer beforeLast = null;
        Integer last = null;
        for (Integer item : results) {
            beforeLast = last;
            last = item;
        }
        result = beforeLast;
         */
        } else
            results.add(result);


        return result;
    }
}

    class Printer {
        public static void main(String[] args) {
            int a, b, c, d;
            char op, op2, undo;

            if (args.length == 0) {
                // При отправке кода на Выполнение, вы можете варьировать эти параметры
                a = 3;
                op = '+';
                b = 7;
                c = 4;
                op2 = '+';
                d = 7;
                undo = '<';
            } else {
                a = Integer.parseInt(args[0]);
                op = args[1].charAt(0);
                b = Integer.parseInt(args[2]);
                c = Integer.parseInt(args[3]);
                op2 = args[4].charAt(0);
                d = Integer.parseInt(args[5]);
                undo = args[6].charAt(0);
            }

            Calculat2 calculator = new Calculat2();
            double result = (int) calculator.calculate(op, a, b);
            System.out.println(result);
            double result2 = (int) calculator.calculate(op2, c, d);
            System.out.println(result2);
            double prevResult = (int) calculator.calculate(undo, 0, 0);
            System.out.println(prevResult);
        }
    }
    //лучшее решение
/*class Calculator {
    public Deque<Double> resultsStack = new ArrayDeque<>();
    public double prevResult;

    public double calculate(char op, int a, int b) {
        if (op == '<') {
            if (resultsStack.size() >= 2) {
                resultsStack.pop();
                prevResult = resultsStack.peek();
            }
            return prevResult;
        } else {
            double result = performOperation(op, a, b);
            resultsStack.push(result);
            prevResult = result;
            return result;
        }
    }

    private double performOperation(char op, int a, int b) {
        double result = 0;
        switch (op) {
            case '+':
                result = add(a, b);
                break;
            case '-':
                result = minus(a, b);
                break;
            case '*':
                result = mult(a, b);
                break;
            case '/':
                result = divide(a, b);
                break;
        }
        return result;
    }

    private double divide(int a, int b) {
        if (b != 0)
            return (double) a / b;
        return -1;
    }

    private int mult(int a, int b) {
        return a * b;
    }

    private int minus(int a, int b) {
        return a - b;
    }

    private int add(int a, int b) {
        return a + b;
    }
}*/
