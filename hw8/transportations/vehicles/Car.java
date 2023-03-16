package jjavaCoreHW.hw8.transportations.vehicles;

// клас легкового автомобіля
public class Car extends javaCoreHW.hw8.transportations.vehicles.Vehicle {
    private int horsepower;
    private int capacity;

    public Car (String name, String model, String brand, int year, int maxSpeed, int capacity, int horsepower) {
        super (name, model, brand, year, maxSpeed);
        this.horsepower = horsepower;
        this.capacity = capacity;

    }
    public int getHorsepower() {
        return horsepower;
    }
    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }
    public int getCapacity() {
        return capacity;
    }
    public int setCapacity(){
        return capacity;
    }

    @Override
    public void move() {
        System.out.println("Driving a car");
    }

}
