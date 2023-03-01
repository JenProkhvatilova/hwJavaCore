package javaCoreHW.hw7.triangle;
public class Isosceles extends javaCoreHW.hw7.geometricShapes.Triangle  { //Равнобедренный
    public Isosceles(double base, double leg) {
        super(base, leg, leg);
    }

    @Override
    public double calculateArea() {
        return 0.5 * triangleSideAB * Math.sqrt(triangleSideAB*triangleSideAB - 0.25*triangleSideAB*triangleSideAB);
    }
}
