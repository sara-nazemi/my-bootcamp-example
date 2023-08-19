package main;

import numberChecker.NumberChecker;
import numberChecker.NumbersChecker;

public class Main {
    public static void main(String[] args) {

        NumbersChecker num = new NumbersChecker(20, 98, 76);

        InputOutput.printOutput("----------three numbers----------");

        InputOutput.printOutput("result is = " + NumbersChecker.hasTeen());

        InputOutput.printOutput("--------one number-------");

        NumberChecker num1 = new NumberChecker(17);

        InputOutput.printOutput("result is = " + NumberChecker.isTeen());
    }
}
