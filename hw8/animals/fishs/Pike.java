package javaCoreHW.hw8;
// клас щука
public class Pike extends javaCoreHW.hw8.animals.fishs.Fish {
    public Pike (String name, int age, String species) {
        super(name, age, species);
    }

    @Override
    public void move() {
        System.out.println("The Pike is swimming in the lake");
    }
}

