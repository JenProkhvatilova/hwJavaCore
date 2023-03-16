package javaCoreHW.hw8.transportations.vehicles;
public class Bus extends javaCoreHW.hw8.transportations.vehicles.Vehicle {
    private int capacity;

    public Bus (String name, String model, String brand, int year, int maxSpeed, int capacity) {
        super (name, model, brand, year, maxSpeed);
        this.capacity = capacity;
    }
    public int getCapacity() {
        return capacity;
    }
    public int setCapacity(){
        return capacity;
    }

    @Override
    public void move() {
        System.out.println("Driving a bus");
    }

}


