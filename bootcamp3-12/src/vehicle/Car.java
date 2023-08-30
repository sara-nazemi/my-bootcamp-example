package vehicle;

public class Car extends Vehicle {
    private int numberOfDoors;

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void startEngine() {
        System.out.println("Car engine started");
    }
}
