package array;

import java.util.Scanner;

public class ArrayStructure {
    Scanner in = new Scanner(System.in);
    String[] strings = new String[30];

    public void search() {
        System.out.println("please enter a string...");
        for (int i = 0; i < strings.length; i++) {
            strings[i] = in.next();
            if (strings[i].equals("hello")) {
                System.out.println("word is = " + strings[i] + " , " + "index is = " + i);
                break;
            }

        }

    }

}
