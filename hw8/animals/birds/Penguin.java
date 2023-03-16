package javaCoreHW.hw8.animals.birds;

public abstract class Penguin extends javaCoreHW.hw8.animals.birds.Birds {
    public Penguin (String name, int age, String species) {
        super(name, age, species);
    }
    @Override
    public void move() {
        System.out.println("Running");
    }
    @Override
    public void swim(){
        System.out.println("Swimming");
    }
}



