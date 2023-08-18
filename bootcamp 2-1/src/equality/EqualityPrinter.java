package equality;

import main.Input;
import main.Output;

public class EqualityPrinter {
    private static int number1;
    private static int number2;
    private static int number3;

    public EqualityPrinter() {

    }

    public EqualityPrinter(int number1) {
        this.number1 = number1;

    }

    public EqualityPrinter(int number1, int number2, int number3) {
        this.number1 = number1;
        this.number2 = number2;
        this.number3 = number3;
    }

    public static void printEqual(int number1, int number2, int number3) {
        if (number1 < 0 || number2 < 0 || number3 < 0) {
            Output.printTitle("Invalid value");
        } else if (number1 == number2 && number2 == number3) {
            Output.printTitle("All numbers are equal");
        } else if (number1 != number2 && number2 != number3) {
            Output.printTitle("All numbers are different");
        } else if ((number1 == number2 && number2 != number3) || (number1 != number2 && number2 == number3)) {
            Output.printTitle("Neither all are equal or different");
        }
    }
}
