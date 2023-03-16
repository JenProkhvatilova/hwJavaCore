package javaCoreHW.hw8.animals.birds;

public abstract class Pitching extends javaCoreHW.hw8.animals.birds.Birds {
    public Pitching (String name, int age, String species) {
        super(name, age, species);
    }
    @Override
    public void move() {
        System.out.println("Flying");
    }
    @Override
    public void swim(){
        System.out.println("Swimming");
    }
}



