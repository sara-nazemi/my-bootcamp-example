package numberChecker;

import javax.swing.*;

public class NumbersChecker {
    private static int num1;
    private static int num2;
    private static int num3;

    public static void setNumbers(int number1, int number2, int number3) {
        num1 = number1;
        num2 = number2;
        num3 = number3;
    }

    public static boolean hasTeen() {
        if ((num1 >= 13 && num1 <= 19) || (num2 >= 13 && num2 <= 19) || (num3 >= 13 && num3 <= 19)) {
            return true;
        }
        return false;
    }
}
