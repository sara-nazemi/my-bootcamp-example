package main;

import circleArea.Circle;
import rectangleArea.Rectangle;

public class Main {
    public static void main(String[] args) {


        InputOutput.printOutput("---------circle---------");

        InputOutput.printOutput("please enter radius");
        double num = InputOutput.getInput();

        Circle.setRadius(num);

        InputOutput.printOutput("circle radius is = " + num);
        InputOutput.printOutput("circle area is = " + Circle.conditionAreaCircle());


        InputOutput.printOutput("--------rectangle--------");

        InputOutput.printOutput("please enter rectangle length");
        double num1 = InputOutput.getInput();

        InputOutput.printOutput("please enter rectangle width");
        double num2 = InputOutput.getInput();
        Rectangle.setNumbers(num1, num2);

        InputOutput.printOutput("rectangle length is = " + num1 + " , " + "rectangle width is = " + num2);
        InputOutput.printOutput("rectangle area is = " + Rectangle.conditionOfAreaRectangle());
    }
}
