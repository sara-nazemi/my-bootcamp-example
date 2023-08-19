package main;

import java.util.Scanner;

public class InputOutput {

    static  Scanner in = new Scanner(System.in);

    public static double getInput() {

        double num = in.nextDouble();
        return num;
    }

    public static void printOutput(String title) {

        System.out.println(title);
    }

}
