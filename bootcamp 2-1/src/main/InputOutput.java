package main;

import java.util.Scanner;

public class InputOutput {
    static Scanner in = new Scanner(System.in);

    public static void outputOfNum(String title) {
        System.out.println(title);
    }

    public static int getInput() {
        return in.nextInt();
    }

}
