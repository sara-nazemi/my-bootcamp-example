package main;

import jdk.internal.dynalink.beans.StaticClass;

import java.util.Scanner;

public class InputOutput {
    static Scanner in = new Scanner(System.in);

    public static int getInput() {
        return in.nextInt();
    }

    public static void printResult(String title) {
        System.out.println(title);
    }
}
