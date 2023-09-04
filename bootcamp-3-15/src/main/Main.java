package main;

import sum.SumOdd;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter start and end ");
        int start = in.nextInt();
        int end = in.nextInt();

        int result = SumOdd.sumOdd(start, end);

        if (result == -1) {
            System.out.println("adade shuru va payam motabar nemibashad");
        }
    }

}
