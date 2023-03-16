package javaCoreHW.hw8.transportations.aircrafts;

// абстрактний клас для літаків
public abstract class Aircraft  extends javaCoreHW.hw8.transportations.Transportation implements javaCoreHW.hw8.transportations.TransportationBehavior {
    private int maxHigh;

    public Aircraft(String name, String model, String brand, int year, int maxSpeed, int maxHigh) {
        super(name, model, brand, year, maxSpeed);
        this.maxHigh = maxHigh;
    }

    public abstract void move();
}




