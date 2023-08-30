package star;

public class Star {
    static StringBuilder string = new StringBuilder();

    public static void editStar(int n) {
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for (int i = (n - 1); i >= 1; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void editStar2(int n) {
        String j = "";
        for (int i = 1; i <= n; i++) {
            j += "*";
            System.out.println(j);
        }
        for (int i = (n - 1); i >= 1; i--) {
            //j.length() - 1
            j = j.substring(0, i);
            System.out.println(j);
        }
    }

    public static void editStar3(int n) {

        for (int i = 1; i <= n; i++) {
            StringBuilder j = string.append("*");
            System.out.println(j);
        }
        for (int i = n; i >= 1; i--) {
            //j.length() - 1
            StringBuilder j = string.delete(i - 1, i);
            System.out.println(j);
        }
    }
}

