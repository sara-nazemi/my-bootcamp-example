package equalSumChecker;

public class EqualSumChecker {
    private static int number1;
    private static int number2;
    private static int number3;

    public static void setNumbers(int num1, int num2, int num3) {
        number1 = num1;
        number2 = num2;
        number3 = num3;
    }
    public static boolean hasEqualSum(){
        if((number1+number2)==number3){
            return true;
        }
        return false;
    }
}
