package javaCoreHW.hw8.animals.birds;

public abstract class Ostrich extends javaCoreHW.hw8.animals.birds.Birds {
    public Ostrich (String name, int age, String species) {
        super(name, age, species);
    }
    @Override
    public void move() {
        System.out.println("Running");
    }
}


