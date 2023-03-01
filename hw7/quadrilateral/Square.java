package javaCoreHW.hw7.quadrilateral;
public class Square extends javaCoreHW.hw7.geometricShapes.Quadrilateral {
    public Square(double side) {
        super(side, side, side, side);
    }

    public double calculateArea() {
        return sideA * sideA;
    }
}