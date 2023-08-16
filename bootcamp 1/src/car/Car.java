package car;


public class Car {
    private String name;
    private String brand;
    private int year;
    private String color;
    private long price;


    public Car() {
        this.color = "white";
    }

    public Car(String name) {
        this.name = name;
    }

    public Car(String name, long price) {
        this.name = name;
        this.price = price;
    }

    public Car(String name, String brand, int model) {
        this.name = name;
        this.brand = brand;
        this.year = model;
    }

    public Car(String name, String brand, String color) {
        this.name = name;
        this.brand = brand;
        this.color = color;
    }

    public Car(String name, String brand, String color, long price) {
        this.name = name;
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    public Car(String name, String brand, int model, String color) {
        this.name = name;
        this.brand = brand;
        this.year = model;
        this.color = color;
    }

    public Car(String name, String color, long price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }

    public Car(int model, String color, long price) {
        this.year = model;
        this.color = color;
        this.price = price;
    }

    public Car(String name, String brand) {
        this.name = name;
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    public void getInput(String name, int year) {
        System.out.println("name is = "+name+"\tyear is = "+year);
        if (name.equals("jacS5")) {
            this.price = 2000000000;
            System.out.println("price is = " + this.price + " toman");
        } else {
            System.out.println("sorry, not available");

        }

    }


    public void printResult() {
        String print = " name is = " + this.name +
                "\n brand is = " + this.brand +
                "\n model is = " + this.year +
                "\n color is = " + this.color;
    }
}
