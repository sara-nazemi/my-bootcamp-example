package main;

import java.util.Scanner;

public class InputOutput {
    static Scanner in = new Scanner(System.in);

    public static int getInput() {
        int number = in.nextInt();
        return number;
    }

    public static void printOutput(String title) {
        System.out.println(title);
    }
}
