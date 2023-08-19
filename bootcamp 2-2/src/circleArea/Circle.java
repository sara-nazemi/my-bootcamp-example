package circleArea;

import main.InputOutput;

public class Circle {

    private static InputOutput output=new InputOutput();
    private static double radius;


    public Circle(double radius) {
        this.radius = radius;
    }

    public static double conditionAreaCircle(double radius) {
        if (radius < 0) {
            output.printOutput("invalid value");
            return -1.0;
        } else {

            return areaCircle(radius);
        }
    }

    public static double areaCircle(double radius) {
        double area = Math.PI * radius * radius;
        return area;
    }
}
