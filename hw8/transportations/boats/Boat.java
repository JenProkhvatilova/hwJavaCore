package javaCoreHW.hw8.transportations.boats;

public abstract class Boat extends javaCoreHW.hw8.transportations.Transportation implements javaCoreHW.hw8.transportations.TransportationBehavior {
    protected int length;
    protected int capacity;
    protected double width;
    protected double depth;

    public Boat(String name, String model, String brand, int year, int maxSpeed, int length, int capacity, double width, double depth) {
        super(name, model, brand, year, maxSpeed);
        this.length = length;
        this.capacity = capacity;
        this.width = width;
        this.depth = depth;
    }

    public int getLength () {
        return length;
    }
    public int getCapacity () {
        return capacity;
    }
    public double getWidth () {
        return width;
    }
    public double getDepth () {
        return depth;
    }

    @Override
    public void move() {
        System.out.println("Moving");
    }
}















