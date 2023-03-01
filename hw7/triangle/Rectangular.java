package javaCoreHW.hw7.triangle;
public class Rectangular extends javaCoreHW.hw7.geometricShapes.Triangle { // Прямоугольный


    public Rectangular (double triangleSideAB, double triangleSideBC) {
        super(triangleSideAB, triangleSideBC, Math.sqrt(triangleSideAB * triangleSideAB + triangleSideBC * triangleSideBC));
    }

    @Override
    public double calculateArea() {
        return 0.5 * triangleSideAB * triangleSideAB;
    }

}
