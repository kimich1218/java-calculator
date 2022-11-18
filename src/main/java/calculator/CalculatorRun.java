package calculator;

import view.EnterOperateAndNumber;

import java.util.List;

import static calculator.Calculator.startingCalcultor;

public class CalculatorRun {

    public void run() {

        List<String> strings = EnterOperateAndNumber.userEnterOperatorAndNumber();
        System.out.println(startingCalcultor(strings));
    }
}
