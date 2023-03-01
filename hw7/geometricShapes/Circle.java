package javaCoreHW.hw7.geometricShapes;

public class Circle extends javaCoreHW.hw7.GeometricShapes {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calculateDiameter() {
        return 2 * radius;
    }

    @Override
    public double calculatePerimeter() {  // circumference

        return 2 * Math.PI * radius;
    }

    @Override
    public double calculateArea() {

        return Math.PI * Math.pow(radius, 2);
    }
}

