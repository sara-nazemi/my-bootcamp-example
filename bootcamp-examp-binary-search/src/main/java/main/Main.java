package main;

import binary.BinarySearch;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] a = {23, 12, 5, 67, 4, 3, 54, 65};

        Arrays.sort(a);
        System.out.println("Sorted Array is " + Arrays.toString(a));
        int index = BinarySearch.binarySearch(a, 4);
        System.out.println("Result index is = " + index);

    }

}
