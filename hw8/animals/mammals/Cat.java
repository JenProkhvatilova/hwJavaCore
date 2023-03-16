package javaCoreHW.hw8.animals.mammals;

// клас собака
public class Cat extends javaCoreHW.hw8.animals.mammals.Mammal  {
    public Cat (String name, int age, String species) {
        super(name, age, species);
    }
    @Override
    public void eat() {
        System.out.println("Eating cat food");
    }

    @Override
    public void move() {
        System.out.println("Running from the dog");
    }
    @Override
    public void makeSound() {
        System.out.println("May");
    }
}


