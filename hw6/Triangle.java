package javaCoreHW.hw6;
public class Triangle {
    private double triangleSideAB;
    private double triangleSideBC;
    private double triangleSideAC;
    private int triangleAngleA;
    private int triangleAngleB;
    private int triangleAngleC;

    public Triangle (double triangleSideAB, double triangleSideBC, double triangleSideAC) {
        this.triangleSideAB = triangleSideAB;
        this.triangleSideBC = triangleSideBC;
        this.triangleSideAC = triangleSideAC;
        this.triangleAngleA = (int) Math.toDegrees(Math.acos((triangleSideBC * triangleSideBC + triangleSideAC *
                triangleSideAC - triangleSideAB * triangleSideAB) / (2 * triangleSideBC * triangleSideAC)));
        this.triangleAngleB = (int) Math.toDegrees(Math.acos((triangleSideAB * triangleSideAB + triangleSideAC *
                triangleSideAC - triangleSideBC * triangleSideBC) / (2 * triangleSideAB * triangleSideAC)));
        this.triangleAngleC = (int) Math.toDegrees(Math.acos((triangleSideAB * triangleSideAB + triangleSideBC *
                triangleSideBC - triangleSideAC * triangleSideAC) / (2 * triangleSideAB * triangleSideBC)));
    }


    public Triangle (double triangleSideAB, double triangleSideAC, int triangleAngleA) {
        this.triangleSideAB = triangleSideAB;
        this.triangleSideAC = triangleSideAC;
        this.triangleAngleA = triangleAngleA;
        this.triangleAngleB = (int) Math.asin((triangleSideAB / triangleSideAC) * Math.sin(triangleAngleA));
        this.triangleAngleC = 180 - triangleAngleA - triangleAngleB;
        this.triangleSideBC = (triangleSideAC * Math.sin(triangleAngleB)) / Math.sin(triangleAngleA);
    }


  public Triangle (double triangleSideAB, int triangleAngleB, double triangleSideBC) {
      this.triangleSideAB = triangleSideAB;
      this.triangleSideBC = triangleSideBC;
      this.triangleAngleB = triangleAngleB;
      this.triangleSideAC = Math.sqrt(Math.pow(triangleSideAB, 2) + Math.pow(triangleSideBC, 2) - 2 * triangleSideAB *
              triangleSideBC * Math.cos(Math.toRadians(triangleAngleB)));
      this.triangleAngleA = (int) Math.toDegrees(Math.asin((triangleSideAB / triangleSideAC) *
              Math.sin(Math.toRadians(triangleAngleB))));
      this.triangleAngleC = 180 - triangleAngleA - triangleAngleB;
  }

  public Triangle (int triangleAngleC, double triangleSideBC, double triangleSideAC) {
      this.triangleSideBC = triangleSideBC;
      this.triangleSideAC = triangleSideAC;
      this.triangleAngleC = triangleAngleC;
      this.triangleSideAB = Math.sqrt(Math.pow(triangleSideBC, 2) + Math.pow(triangleSideAC, 2) - 2 * triangleSideBC *
              triangleSideAC * Math.cos(Math.toRadians(triangleAngleC)));
      this.triangleAngleA = (int) Math.toDegrees(Math.asin((triangleSideAC / triangleSideAB) *
              Math.sin(Math.toRadians(triangleAngleC))));
      this.triangleAngleB = 180 - triangleAngleA - triangleAngleC;
  }

    public double getTriangleSideAB() {
        return triangleSideAB;
    }

    public double getTriangleSideBC() {
        return triangleSideBC;
    }

    public double getTriangleSideAC() {
        return triangleSideAC;
    }

    public double getTriangleAngleA() {
        return triangleAngleA;
    }

    public double getTriangleAngleB() {
        return triangleAngleB;
    }

    public double getTriangleAngleC() {
        return triangleAngleC;
    }

    public double calculatePerimeter() {
        return triangleSideAB + triangleSideBC + triangleSideAC;
    }

    public double calculateArea() {
        double s = calculatePerimeter() / 2;
        return Math.sqrt(s * (s - triangleSideAB) * (s - triangleSideBC) * (s - triangleSideAC));
    }
    public static void main(String[] args) {
    }
}


/*
3. Описати клас трикутник (поля описуєте самостійно) з методами:
 - геттери
 - підрахунку периметру трикутника
 - підрахунку площі трикутника

4. Описати клас кредит. (Самостійно визначаєте поля і методи)

 */