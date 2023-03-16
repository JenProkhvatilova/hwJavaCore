package javaCoreHW.hw8.transportations.boats;

public abstract class Barge extends javaCoreHW.hw8.transportations.boats.Boat {

    private double cargoCapacity;

    public Barge(String name, String model, String brand, int year, int maxSpeed, int length, int capacity, double width, double depth, double cargoCapacity) {
        super(name, model, brand, year, maxSpeed, length, capacity, width, depth);
        this.cargoCapacity = cargoCapacity;
    }

    public double getCargoCapacity() {
        return cargoCapacity;
    }

    public double getVolume() {
        return length * width * depth;
    }

    public boolean canTransport(double cargo) {
        return cargo <= cargoCapacity;
    }


}


