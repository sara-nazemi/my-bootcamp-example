package arrayStructure;

import java.util.Random;

public class ArrayStructure {
    int[] randomNumbers = new int[100];

    public void fillNumbers() {
        Random rnd = new Random();
        int high = 1000;
        int low = 1;
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = rnd.nextInt(high - low);
            System.out.println("index of " + i + " fill with " + randomNumbers[i]);
        }
    }
}
