package main;

import star.Star;

public class Main {
    public static void main(String[] args) {
        Long l = System.currentTimeMillis();
        Star.editStar2(6);
        Long l2 = System.currentTimeMillis();
        System.out.println(l2 - 1);
    }
}
