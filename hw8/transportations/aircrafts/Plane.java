package javaCoreHW.hw8.transportations.aircrafts;
public abstract class Plane extends javaCoreHW.hw8.transportations.aircrafts.Aircraft {
    private int numEngines;

    public Plane(String name, String model, String brand, int year, int maxSpeed, int maxHigh, int numEngines) {
        super(name, model, brand, year, maxSpeed, maxHigh);
        this.numEngines = numEngines;
    }

    @Override
    public void move() {
        System.out.println("The plane is cruising through the sky.");
    }
}


