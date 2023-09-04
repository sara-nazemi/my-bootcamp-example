package circleArea;

import main.InputOutput;

public class Circle {

    private static double radius;

    public static void setRadius(double radius1) {
        radius = radius1;
    }

    public static double conditionAreaCircle() {
        if (radius < 0) {
            InputOutput.printOutput("invalid value");
            return -1.0;
        } else {

            return areaCircle();
        }
    }

    public static double areaCircle() {
        double area = Math.PI * radius * radius;
        return area;
    }
}
