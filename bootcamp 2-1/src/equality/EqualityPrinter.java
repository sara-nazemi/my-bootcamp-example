package equality;

import main.InputOutput;

public class EqualityPrinter {
    private static int number1;
    private static int number2;
    private static int number3;

    public static void setNumbers(int num1, int num2, int num3) {
        number1 = num1;
        number2 = num2;
        number3 = num3;
    }

    public static void printEqual() {
        if (number1 < 0 || number2 < 0 || number3 < 0) {
            InputOutput.outputOfNum("Invalid value");
        } else if (number1 == number2 && number2 == number3) {
            InputOutput.outputOfNum("All numbers are equal");
        } else if (number1 != number2 && number2 != number3) {
            InputOutput.outputOfNum("All numbers are different");
        }
            InputOutput.outputOfNum("Neither all are equal or different");
    }
}
