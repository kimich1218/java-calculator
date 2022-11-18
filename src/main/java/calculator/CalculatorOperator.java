package calculator;

public class CalculatorOperator {

    public static int add(int number1, int number2) {
        return number1 + number2;
    }

    public static int subtract(int number1, int number2) {
        return number1 - number2;
    }

    public static int multiple(int number1, int number2) {
        return number1 * number2;
    }

    public static int divide(int number1, int number2) {
        return number1 / number2;
    }

    public static Boolean distinguishAdd(String operatorAdd) {

        if (operatorAdd.equals("+")) {
            return true;
        }else{
            return false;
        }
    }

    public static Boolean distinguishSubtract(String operatorSubract) {

        if (operatorSubract.equals("-")) {
            return true;
        }else{
            return false;
        }
    }

    public static Boolean distinguishMultiple(String operatorMultiple) {

        if (operatorMultiple.equals("*")) {
            return true;
        }else{
            return false;
        }
    }

    public static Boolean distinguishDivide(String operatorDivide) {

        if (operatorDivide.equals("/")) {
            return true;
        }else{
            return false;
        }
    }


}
