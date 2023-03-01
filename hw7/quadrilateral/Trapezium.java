package javaCoreHW.hw7.quadrilateral;
public class Trapezium extends javaCoreHW.hw7.geometricShapes.Quadrilateral {
    protected double height;

    public Trapezium(double base1, double base2, double side1, double side2, double height) {
        super(base1, base2, side1, side2);
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return (sideC + sideD) * height / 2;
    }
}
