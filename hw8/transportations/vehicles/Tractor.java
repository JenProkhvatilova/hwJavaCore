package javaCoreHW.hw8.transportations.vehicles;

// клас легкового автомобіля
public class Tractor extends javaCoreHW.hw8.transportations.vehicles.Vehicle {
    private int pullingCapacity;

    public Tractor(String name, String model, String brand, int year, int maxSpeed, int pullingCapacity) {
        super(name, model, brand, year, maxSpeed);
        this.pullingCapacity = pullingCapacity;
    }

    public int getPullingCapacity() {
        return pullingCapacity;
    }

    public void setPullingCapacity(int pullingCapacity) {
        this.pullingCapacity = pullingCapacity;
    }

    @Override
    public void move() {
        System.out.println("Driving a tractor");
    }
    public void pull() {
        System.out.println("Pulling the plow");
    }

}

