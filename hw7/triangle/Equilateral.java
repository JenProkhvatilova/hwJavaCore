package javaCoreHW.hw7.triangle;
public class Equilateral  extends javaCoreHW.hw7.geometricShapes.Triangle { // равносторонний

    public Equilateral(double triangleSideAB) {
        super(triangleSideAB, triangleSideAB, triangleSideAB);
    }

    @Override
    public double calculateArea() {
        return (Math.sqrt(3) / 4) * triangleSideAB * triangleSideAB;
    }
}