package main;

import java.util.Arrays;

public class Main {

    static int[] a = new int[]{1, 2, 3, 4, 5, 2, 2, 5, 7, 3, 6};

    public static void main(String[] args) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j] && i != j) {
                    removeElement(j);
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }

    public static void removeElement(int index) {
        int[] b = Arrays.copyOf(a, a.length);
        a = new int[a.length - 1];

        for (int i = 0; i < b.length; i++) {
            if (i != index) {
                int i2 = i < index ? i : i - 1;
                a[i2] = b[i];
            }
        }
    }
}
