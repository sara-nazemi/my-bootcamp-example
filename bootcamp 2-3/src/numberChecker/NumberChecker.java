package numberChecker;

public class NumberChecker {
    private static int number;

    public NumberChecker(int number) {
        this.number = number;
    }

    public static boolean isTeen() {
        if (number >= 13 && number <= 19) {
            return true;
        }
        return false;
    }
}
