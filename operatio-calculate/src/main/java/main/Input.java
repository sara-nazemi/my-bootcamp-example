package main;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static int[] scannerStringToArrayInt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input array items in space separated format");
        String s = scanner.nextLine();
        String[] strings = s.split(" ");
        int[] ints1 = new int[strings.length];
        for (int i = 0; i < strings.length; i++) {
            ints1[i] = Integer.parseInt(strings[i]);
        }
        System.out.println("input is : " + Arrays.toString(ints1));
        return ints1;
    }

    public static int[] scannerForInt() {
        System.out.println("input size of array");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] ints = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("input the " + (i + 1) + "th number");
            int a = scanner.nextInt();
            ints[i] = a;
        }
        System.out.println("input is : " + Arrays.toString(ints));
        return ints;
    }
}
