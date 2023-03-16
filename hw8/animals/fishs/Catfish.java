package javaCoreHW.hw8;

public class Catfish extends javaCoreHW.hw8.animals.fishs.Fish {
    public Catfish (String name, int age, String species) {
        super(name, age, species);
    }

    @Override
    public void move() {
        System.out.println("The Catfish is swimming in the lake");
    }
}
