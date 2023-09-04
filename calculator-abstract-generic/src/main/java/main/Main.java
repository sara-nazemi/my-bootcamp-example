package main;

import calculator.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Integer[] x = scanner1();
        NumericCalculator intNum = new IntegerCalculator(x);
        Long[] y = scanner2();
        NumericCalculator longNum = new LongCalculator(y);
        intNum.avg();
        String[] s = scanner3();
        GeneralCalculator stringNum = new StringCalculator(s);


    }

    public static Integer[] scanner1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Array integer items =");
        String s = scanner.nextLine();
        String[] strings = s.split(" ");
        ArrayList<Integer> ints = new ArrayList<>();

        for (String string : strings) {
            ints.add(Integer.parseInt(string));
        }
        System.out.println("Inputs is : " + ints);
        return ints.toArray(new Integer[0]);
    }

    public static Long[] scanner2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Array long items =");
        String s = scanner.nextLine();
        String[] strings = s.split(" ");
        ArrayList<Long> ints = new ArrayList<>();

        for (String string : strings) {
            ints.add(Long.parseLong(string));
        }
        System.out.println("Inputs is : " + ints);
        return ints.toArray(new Long[0]);
    }

    public static String[] scanner3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Array integer items =");
        String s = scanner.nextLine();
        String[] strings = s.split(" ");
        return strings;
    }
}
