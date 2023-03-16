package javaCoreHW.hw8.transportations.aircrafts;
public abstract class Glider extends javaCoreHW.hw8.transportations.aircrafts.Aircraft {
    private int wingspan;

    public Glider(String name, String model, String brand, int year, int maxSpeed, int maxHigh, int gasCapacity, int wingspan) {
        super(name, model, brand, year, maxSpeed, maxHigh);
        this.wingspan = wingspan;
    }

    @Override
    public void move() {
        System.out.println("The glider is soaring through the air.");
    }
}


