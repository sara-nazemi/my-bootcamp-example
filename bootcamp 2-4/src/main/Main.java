package main;

import equalSumChecker.EqualSumChecker;

public class Main {
    public static void main(String[] args) {

        InputOutput.printResult("please enter first number");
        int num1 = InputOutput.getInput();

        InputOutput.printResult("please enter second number");
        int num2 = InputOutput.getInput();

        InputOutput.printResult("please enter third number");
        int num3 = InputOutput.getInput();

        EqualSumChecker.setNumbers(num1, num2, num3);
        InputOutput.printResult("result is = " + EqualSumChecker.hasEqualSum());
    }
}
