package main;

import equality.EqualityPrinter;

public class Main {
    public static void main(String[] args) {

        InputOutput.outputOfNum("please enter first number");
        int num1 = InputOutput.getInput();

        InputOutput.outputOfNum("please enter second number");
        int num2 = InputOutput.getInput();

        InputOutput.outputOfNum("please enter third number");
        int num3 = InputOutput.getInput();

        EqualityPrinter.setNumbers(num1, num2, num3);

        EqualityPrinter.printEqual();


    }
}
