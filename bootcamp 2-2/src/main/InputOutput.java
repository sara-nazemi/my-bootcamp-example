package main;

import java.util.Scanner;

public class InputOutput {

    Scanner in = new Scanner(System.in);

    public double getInput() {

        double num = in.nextDouble();
        return num;
    }

    public void printOutput(String title) {

        System.out.println(title);
    }

}
