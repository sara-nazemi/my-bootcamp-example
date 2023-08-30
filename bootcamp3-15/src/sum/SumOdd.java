package sum;

public class SumOdd {

    // baresi fard budan
    private static boolean isOdd(int number) {
        if (number < 0) {
            return false;
        }

        // vaghti baghimande 1 hast yani fard
        if (number % 2 == 1) {
            return true;
        }
        return false;
    }

    public static int sumOdd(int start, int end) {
        // start kuchik tar az sefr
        // ya
        // end kuchik tar az sefr
        if (start < 0 || end < 0) {
            return -1;
        }

        // start bozorgtar az end
        if (start > end) {
            return -1;
        }

        // moteghayere majmue addad haye fard
        Integer sumOfOdds = 0;

        // loop az shuru ta payan
        for (int i = start; i <= end; i++) {

            // check kon fard budan addad
           // boolean odd = isOdd(i);

            // baresi kon ke addad fard ast
           // if (odd) {
            if (isOdd(i)) {
                // agar fard bud print kon va ba moteghayere asli jam bezan
                System.out.println("this number is odd =" + i);
                sumOfOdds += i;
            }
        }

        System.out.println("sum of odd numbers = " + sumOfOdds);
        return 1;
    }

}
