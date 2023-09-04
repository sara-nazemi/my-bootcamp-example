package numberChecker;

public class NumberChecker {
    private static int number;

    public static void setNumber(int num) {
        number = num;
    }

    public static boolean isTeen() {
        if (number >= 13 && number <= 19) {
            return true;
        }
        return false;
    }
}
