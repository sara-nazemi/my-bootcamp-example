package barkingDog;

import main.InputOutput;

public class BarkingDog {
    private static boolean barking;
    private static int ourOfTheDay;

    public static void setOurOfTheDay(int number, boolean bark) {
        ourOfTheDay = number;
        barking = bark;
    }

    public static boolean shouldWakeup() {

        if (barking && (((ourOfTheDay < 8) && (ourOfTheDay >= 0)) || ((ourOfTheDay > 22) && (ourOfTheDay <= 23)))) {
            return true;
        } /*else if (!barking && (ourOfTheDay >= 8) && (ourOfTheDay <= 22)) {
            return false;
        }*/
        return false;
    }
}
