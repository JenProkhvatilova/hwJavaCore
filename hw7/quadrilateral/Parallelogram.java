package javaCoreHW.hw7.quadrilateral;
public class Parallelogram extends javaCoreHW.hw7.geometricShapes.Quadrilateral  { //Параллелограмм
    private double base;
    private double height;

    public Parallelogram(double sideA, double sideB, double sideC, double sideD, double base, double height) {
        super(sideA, sideB, sideC, sideD);
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    public double calculateArea() {
        return base * height;
    }
}
