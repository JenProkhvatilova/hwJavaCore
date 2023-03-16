package javaCoreHW.hw8.transportations.boats;

public abstract class MotorBoat extends javaCoreHW.hw8.transportations.boats.Boat {

    private int currentSpeed;
    private int fuelCapacity;
    private int fuelLevel;

    public MotorBoat(String name, String model, String brand, int year, int maxSpeed, int length, int capacity, double width, double depth, int currentSpeed, int fuelCapacity, int fuelLevel) {
        super(name, model, brand, year, maxSpeed, length, capacity, width, depth);
        this.currentSpeed = 0;
        this.fuelCapacity = fuelCapacity;
        this.fuelLevel = fuelCapacity;
    }

    public void accelerate(int speed) {
        if (currentSpeed + speed <= maxSpeed) {
            currentSpeed += speed;
            System.out.println("Accelerating to " + currentSpeed + " knots");
        } else {
            System.out.println("Cannot exceed maximum speed of " + maxSpeed + " knots");
        }
    }

    public void decelerate(int speed) {
        if (currentSpeed - speed >= 0) {
            currentSpeed -= speed;
            System.out.println("Decelerating to " + currentSpeed + " knots");
        } else {
            System.out.println("Cannot go below 0 knots");
        }
    }

    public void refuel(int amount) {
        if (fuelLevel + amount <= fuelCapacity) {
            fuelLevel += amount;
            System.out.println("Refueled " + amount + " gallons of fuel");
        } else {
            System.out.println("Fuel tank capacity exceeded");
        }
    }

    public void displayInfo() {
        System.out.println("Boat name: " + name);
        System.out.println("Length: " + length + " feet");
        System.out.println("Maximum speed: " + maxSpeed + " knots");
        System.out.println("Current speed: " + currentSpeed + " knots");
        System.out.println("Fuel capacity: " + fuelCapacity + " gallons");
        System.out.println("Fuel level: " + fuelLevel + " gallons");
    }
}


