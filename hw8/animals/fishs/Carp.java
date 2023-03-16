package javaCoreHW.hw8;

public class Carp extends javaCoreHW.hw8.animals.fishs.Fish {
    public Carp(String name, int age, String species) {
        super(name, age, species);
    }

    @Override
    public void move() {
        System.out.println("The Carp is swimming in the lake");
    }
}


