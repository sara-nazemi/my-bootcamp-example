package main;

import numberChecker.NumberChecker;
import numberChecker.NumbersChecker;

public class Main {
    public static void main(String[] args) {


        InputOutput.printOutput("----------three numbers----------");

        InputOutput.printOutput("please first number");
        int number1 = InputOutput.getInput();
        InputOutput.printOutput("please second number");
        int number2 = InputOutput.getInput();
        InputOutput.printOutput("please third number");
        int number3 = InputOutput.getInput();

        NumbersChecker.setNumbers(number1, number2, number3);
        InputOutput.printOutput("result is = " + NumbersChecker.hasTeen());


        InputOutput.printOutput("--------one number-------");

        InputOutput.printOutput("please enter number");
        int number4 = InputOutput.getInput();

        NumberChecker.setNumber(number4);
        InputOutput.printOutput("result is = " + NumberChecker.isTeen());
    }
}
