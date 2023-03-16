package javaCoreHW.hw8.animals.birds;

public abstract class Kiwi extends javaCoreHW.hw8.animals.birds.Birds {
    public Kiwi (String name, int age, String species) {
        super(name, age, species);
    }
    @Override
    public void move() {
        System.out.println("Running");
    }
}



