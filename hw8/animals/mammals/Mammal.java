package javaCoreHW.hw8.animals.mammals;
public abstract class Mammal extends javaCoreHW.hw8.animals.Olfactores implements javaCoreHW.hw8.animals.OlfactoresBehavior {
    public Mammal (String name, int age, String species) {
            super(name, age, species);
    }
    public void move() {
        System.out.println("Running...");
    }

    public void eat(){
        System.out.println("Eating...");
    }
    public void makeSound(){
    }
}



