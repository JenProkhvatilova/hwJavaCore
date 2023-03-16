package javaCoreHW.hw8.animals.fishs;

public abstract class Fish extends javaCoreHW.hw8.animals.Olfactores implements javaCoreHW.hw8.animals.OlfactoresBehavior {
    public Fish (String name, int age, String species) {
        super(name, age, species);
    }
    @Override
    public void move() {
        System.out.println("Swimming");
    }

    @Override
    public void eat(){
        System.out.println("Eating fish food");
    }
    @Override
    public void makeSound(){
        System.out.println("Bulb-Bulb");
    }
}





