package rectangleArea;

import jdk.internal.dynalink.beans.StaticClass;
import main.InputOutput;

public class Rectangle {
    private static double x;
    private static double y;

    public static void setNumbers(double num1, double num2) {
        x = num1;
        y = num2;
    }

    public static double conditionOfAreaRectangle() {
        if (x < 0 || y < 0) {
            InputOutput.printOutput("invalid value");
            return -1.0;
        } else {
            return overLoadedRectangle();
        }

    }

    public static double overLoadedRectangle() {
        double area = x * y;

        return area;
    }

}
