package main;

import circleArea.Circle;
import rectangleArea.Rectangle;

public class Main {
    public static void main(String[] args) {

        Circle radiusByConstructor = new Circle(14.5);

        InputOutput input = new InputOutput();

        input.printOutput("---------circle---------");

        input.printOutput("please enter circle radius");
        double num = input.getInput();

        input.printOutput("circle radius is = " + num);
        input.printOutput("circle area is = " + Circle.conditionAreaCircle(num));


        input.printOutput("--------rectangle--------");

        input.printOutput("please enter rectangle length");
        double num1 = input.getInput();

        input.printOutput("please enter rectangle width");
        double num2 = input.getInput();

        input.printOutput("rectangle length is = " + num1 + " " + "rectangle width is = " + num2);
        input.printOutput("rectangle area is = " + Rectangle.conditionOfAreaRectangle(num1, num2));
    }
}
