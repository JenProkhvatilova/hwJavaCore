package javaCoreHW.hw7.quadrilateral;
 public class Rectangle extends javaCoreHW.hw7.geometricShapes.Quadrilateral { //Прямоугольник
     public Rectangle(double length, double width) {
         super(length, width, length, width);
     }

     public double calculateArea() {
         return sideA * sideB;
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