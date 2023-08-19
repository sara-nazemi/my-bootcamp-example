package main;

import java.util.Scanner;

public class InputOutput {
    static Scanner in = new Scanner(System.in);

    public static void getInput() {
        int number = in.nextInt();
    }

    public static void printOutput(String title) {
        System.out.println(title);
    }
}
