package arrayStructure;

import java.util.Collections;
import java.util.Scanner;

public class ArrayStructure {
    Scanner in = new Scanner(System.in);
    double[] arrayNumbers = new double[12];

    public void fillOfNumbers() {
        System.out.println("enter 12 decimal numbers");
        double min = 0;
        for (int i = 1; i < arrayNumbers.length; i++) {
            arrayNumbers[i] = in.nextDouble();
            if (i == 0) {
                min = arrayNumbers[i];
            } else if (min > arrayNumbers[i]) {
                min = arrayNumbers[i];
            }
        }
        System.out.println("min number is = " + min);
    }
}
