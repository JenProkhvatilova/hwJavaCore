package javaCoreHW.hw8.transportations.vehicles;

// абстрактний клас
public abstract class Vehicle extends javaCoreHW.hw8.transportations.Transportation implements javaCoreHW.hw8.transportations.TransportationBehavior {

  public Vehicle(String name, String model, String brand, int year, int maxSpeed) {
        super(name, model, brand, year, maxSpeed);
    }

    @Override
    public void move() {
        System.out.println("Drive");
    }
}



