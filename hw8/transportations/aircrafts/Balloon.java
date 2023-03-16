package javaCoreHW.hw8.transportations.aircrafts;
public abstract class Balloon extends javaCoreHW.hw8.transportations.aircrafts.Aircraft {
    private int gasCapacity;

    public Balloon(String name, String model, String brand, int year, int maxSpeed, int maxHigh, int gasCapacity) {
        super(name, model, brand, year, maxSpeed, maxHigh);
        this.gasCapacity = gasCapacity;
    }

    @Override
    public void move() {
        System.out.println("The balloon is floating in the air.");
    }
}

