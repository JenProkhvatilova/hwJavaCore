package javaCoreHW.hw8.transportations;
public abstract class Transportation {

     protected String name;
     protected String model;
     protected String brand;
     protected int year;
     protected int maxSpeed;

     public Transportation(String name, String model, String brand, int year, int maxSpeed) {
          this.name = name;
          this.model = model;
          this.brand = brand;
          this.year = year;
          this.maxSpeed = maxSpeed;

     }

     public String getName() {
          return name;
     }

     public String getModel() {
          return model;
     }

     public String getBrand() {
          return brand;
     }

     public int getYear() {
          return year;
     }

     public int getMaxSpeed() {
          return maxSpeed;
     }

}

