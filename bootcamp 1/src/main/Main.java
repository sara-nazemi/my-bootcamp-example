package main;

import car.Car;

import java.util.Scanner;

public class Main {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        Car jacS5 = new Car();

        Car peugeot2008 = new Car("peugeot2008", "peugeot" + 97);

        Car jacS3 = new Car("jac s3");

        Car haimaS5 = new Car(1401, "black", 1000000000);

       jacS3.getName();

       peugeot2008.getBrand();

        haimaS5.getYear();

        jacS5.printResult();

        Car car = new Car();
        System.out.println("pleas enter car name = ");
        String nameCar = in.next();
        System.out.println("pleas enter car year = ");
        int model = in.nextInt();
        car.getInput(nameCar, model);

    }
}
