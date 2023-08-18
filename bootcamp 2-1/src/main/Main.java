package main;

import equality.EqualityPrinter;

public class Main {
    public static void main(String[] args) {


        //get number2
        Output.printTitle("please enter first number");
        int num1 = Input.getInput();

        //get number3
        Output.printTitle("please enter second number");
        int num2 = Input.getInput();

        //get number3
        Output.printTitle("please enter third number");
        int num3 = Input.getInput();

        EqualityPrinter num = new EqualityPrinter(5);

        EqualityPrinter numberWithConstructor = new EqualityPrinter(1, 12, 12);

        EqualityPrinter numberWithoutConstructor = new EqualityPrinter();

        numberWithoutConstructor.printEqual(num1, num2, num3);

    }
}
