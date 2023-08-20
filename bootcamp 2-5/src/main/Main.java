package main;

import barkingDog.BarkingDog;

public class Main {
    public static void main(String[] args) {

        InputOutput.outputResult("please enter true or false");
        boolean bark = InputOutput.getInputBoolean();

        InputOutput.outputResult("please enter one integer number");
        int num = InputOutput.getInputInteger();

        BarkingDog.setOurOfTheDay(num, bark);

        InputOutput.outputResult("result is = " + BarkingDog.shouldWakeup());
    }
}
