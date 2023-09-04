package array;

import java.util.Scanner;

public class ArrayStructure {
    Scanner in = new Scanner(System.in);
    double[] arrayNumbers = new double[7];
    double[] arrayNumbers2 = new double[7];

    public void fillAndMultiplyArray() {
        System.out.println("enter 7 double numbers");
        double num = 1;
        for (int i = 0; i < arrayNumbers.length; i++) {
            arrayNumbers[i] = in.nextDouble();
            System.out.println("multiply is = " + arrayNumbers[i] * arrayNumbers2[i]);
        }

    }
}
