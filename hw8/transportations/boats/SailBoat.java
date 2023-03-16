package javaCoreHW.hw8.transportations.boats;

public abstract class SailBoat extends javaCoreHW.hw8.transportations.boats.Boat {
    private double mastHeight;
    private double keelDepth;

    public SailBoat(String name, String model, String brand, int year, int maxSpeed, int length, int capacity, double width, double depth, double mastHeight, double keelDepth) {
        super(name, model, brand, year, maxSpeed, length, capacity, width, depth);
        this.mastHeight = mastHeight;
        this.keelDepth = keelDepth;
    }

    public double getMastHeight() {
        return mastHeight;
    }

    public void setMastHeight(double mastHeight) {
        this.mastHeight = mastHeight;
    }

    public double getKeelDepth() {
        return keelDepth;
    }

    public void setKeelDepth(double keelDepth) {
        this.keelDepth = keelDepth;
    }

    public void displayInfo() {
        System.out.println("Sailing the boat with mast height " + mastHeight + " and keel depth " + keelDepth);
    }
}