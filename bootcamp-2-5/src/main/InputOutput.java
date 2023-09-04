package main;

import java.util.Scanner;

public class InputOutput {

    static Scanner in = new Scanner(System.in);

    public static boolean getInputBoolean() {
        boolean bark = in.nextBoolean();
        return bark;
    }

    public static int getInputInteger() {
        int hour = in.nextInt();
        return hour;
    }

    public static void outputResult(String title) {
        System.out.println(title);
    }
}
