package nu.olivier;

public class Vehicle {
    private String brand;
    private String model;
    private int weight;

    private int currentVelocity;
    private int currentDirection;

    public Vehicle(String brand, String model, int weight) {
        this.brand = brand;
        this.model = model;
        this.weight = weight;

        this.currentDirection = 0;
        this.currentVelocity = 0;
    }

    public void steer(int direction) {
        this.currentDirection += direction;
        System.out.println("Vehicle.steer(): Stteering at " + currentDirection + " degrees.");
    }

    public void move (int velocity, int direction) {
        currentVelocity = velocity;
        currentDirection = direction;
        System.out.println("Vehicle.move(): Moving at " + currentVelocity + " in direction " + currentDirection);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getWeight() {
        return weight;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void stop() {
        this.currentVelocity = 0;
    }
}
