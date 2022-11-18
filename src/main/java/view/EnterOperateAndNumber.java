package view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EnterOperateAndNumber {

    public static List<String> userEnterOperatorAndNumber() {

        System.out.println("원하는 식을 작성하세요.");
        Scanner scanner = new Scanner(System.in);
        String operatorAndNumber = scanner.nextLine();

        List<String> operatorAndNumberList = new ArrayList<>();

        String[] operatorAndNumberListSplit = operatorAndNumber.split(" ");

        for (String split : operatorAndNumberListSplit) {
            operatorAndNumberList.add(split);

        }
        return operatorAndNumberList;
    }

}
