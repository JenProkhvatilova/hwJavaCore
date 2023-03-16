package javaCoreHW.hw8.animals.mammals;

// клас хом'як
public class Hamster extends javaCoreHW.hw8.animals.mammals.Mammal {
    public Hamster (String name, int age, String species) {
        super(name, age, species);
    }
    @Override
    public void eat() {
        System.out.println("Eating hamster food");
    }

    @Override
    public void move() {
        System.out.println("Running in the wheel");
    }
    @Override
    public void makeSound() {
        System.out.println("Squeak");
    }
}



