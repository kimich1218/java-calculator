package calculator;

import java.util.List;

import static calculator.CalculatorOperator.*;


public class Calculator {

    public static int startingCalcultor(List<String> calculatorTools) {

        int result = Integer.parseInt(calculatorTools.get(0));
        String operator = null;

        for (int i = 1; i < calculatorTools.size(); i++) {

            if (distinguishAdd(calculatorTools.get(i))) {
                operator = calculatorTools.get(i);
            }

            if (distinguishSubtract(calculatorTools.get(i))) {
                operator = calculatorTools.get(i);
            }

            if (distinguishMultiple(calculatorTools.get(i))) {
                operator = calculatorTools.get(i);
            }

            if (distinguishDivide(calculatorTools.get(i))) {
                operator = calculatorTools.get(i);
            }

            if(distinguishNumber(calculatorTools.get(i))){
                String nextNumber = calculatorTools.get(i);
                result = calculate(operator, result, nextNumber);
            }
        }

        return result;
    }

    private static int calculate(String operator, int result, String nextNumber) {
        if (operator.equals("+")) {
            return add(result, Integer.parseInt(nextNumber));
        }
        if (operator.equals("-")) {
            return subtract(result, Integer.parseInt(nextNumber));
        }
        if (operator.equals("*")) {
            return multiple(result, Integer.parseInt(nextNumber));
        }
        if (operator.equals("/")) {
            return divide(result, Integer.parseInt(nextNumber));
        }
        return 0;
    }

    private static boolean distinguishNumber(String number) {

        boolean isNumeric =  number.matches("^[0-9]*$");

        return isNumeric;
    }

}
