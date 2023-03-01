package javaCoreHW.hw7.geometricShapes;
public class Quadrilateral extends javaCoreHW.hw7.GeometricShapes {
    protected double sideA;
    protected double sideB;
    protected double sideC;
    protected double sideD;

    public Quadrilateral(double sideA, double sideB, double sideC, double sideD) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.sideD = sideD;
    }

    public double calculatePerimeter() {

        return sideA + sideB + sideC + sideD;
    }

    public double calculateArea() {
        // implement area calculation based on the type of quadrilateral
        return 0.0;
    }
}
