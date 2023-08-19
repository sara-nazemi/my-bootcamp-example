package numberChecker;

import javax.swing.*;

public class NumbersChecker {
    private static int num1;
    private static int num2;
    private static int num3;

    public NumbersChecker(int num1, int num2, int num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    public static boolean hasTeen() {
        if ((num1 >= 13 && num1 <= 19) || (num2 >= 13 && num2 <= 19) || (num3 >= 13 && num3 <= 19)) {
            return true;
        }
        return false;
    }
}
