package rectangleArea;

import jdk.internal.dynalink.beans.StaticClass;
import main.InputOutput;

public class Rectangle {
    private static double x;
    private static double y;
    private static InputOutput output = new InputOutput();


    public Rectangle(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public static double conditionOfAreaRectangle(double x, double y) {
        if (x < 0 || y < 0){
            output.printOutput("invalid value");
        return -1.0;
    } else

    {
        return overLoadedRectangle(x, y);
    }

}

    public static double overLoadedRectangle(double x, double y) {
        double area = x * y;

        return area;
    }

}
