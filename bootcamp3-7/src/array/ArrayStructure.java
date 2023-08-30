package array;

import java.util.Scanner;

public class ArrayStructure {
    Scanner in = new Scanner(System.in);
    int[] arrayNumbers = new int[25];
    int num;

    public void fillAndSearch() {
        System.out.println("enter 25 numbers ");
        for (int i = 0; i < arrayNumbers.length; i++) {
            arrayNumbers[i] = in.nextInt();
            if (arrayNumbers[i] == 10) {
                System.out.println("index is = " + i + " " + " number is = " + arrayNumbers[i]);
                break;
            }

        }
    }
}
