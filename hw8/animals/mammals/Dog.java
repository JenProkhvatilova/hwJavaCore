package javaCoreHW.hw8.animals.mammals;

// клас собака
public class Dog extends javaCoreHW.hw8.animals.mammals.Mammal {
    public Dog (String name, int age, String species) {
        super(name, age, species);
    }
    @Override
    public void eat() {
        System.out.println("Eating dog food");
    }

    @Override
    public void move() {
        System.out.println("Running for the cat");
    }
    @Override
    public void makeSound() {
        System.out.println("Woof");
    }
}



