package arrayStructure;

import java.util.Random;
import java.util.Scanner;

public class ArrayStructure {
    double[] randomNumbers = new double[6];

    public void fillRandomNumbersAndPrintAverage() {
        Random rnd = new Random();
        double temp = 0;
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = rnd.nextDouble();
            temp += randomNumbers[i];
            System.out.println("index of " + i + " fill with " + randomNumbers[i]);
        }
        temp = temp / randomNumbers.length;
        System.out.println("average is = " + temp);
    }

    public void fillInputNumbersAndPrintAverage() {
        System.out.println("enter 6 decimal numbers:");
        Scanner in = new Scanner(System.in);
        double temp = 0;
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = in.nextDouble();
            temp += randomNumbers[i];
            System.out.println("index of " + i + " fill with " + randomNumbers[i]);
        }
        temp = temp / randomNumbers.length;
        System.out.println("average is = " + temp);
    }

}
