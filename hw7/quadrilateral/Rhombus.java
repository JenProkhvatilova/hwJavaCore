package javaCoreHW.hw7.quadrilateral;
public class Rhombus  extends javaCoreHW.hw7.geometricShapes.Quadrilateral { // Ромб
    protected double diagonal1;
    protected double diagonal2;

    public Rhombus(double side, double diagonal1, double diagonal2) {
        super(side, side, side, side);
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }

    @Override
    public double calculateArea() {
        return diagonal1 * diagonal2 / 2;
    }
}



/*
geometric shapes:
    - Circle
    - Triangle:
     - Rectangular
     - Isosceles
     - Equilateral
    - Quadrilateral:
     - Square
     - Rectangle
     - Parallelogram
     - Trapezium
     - Rhombus
 */