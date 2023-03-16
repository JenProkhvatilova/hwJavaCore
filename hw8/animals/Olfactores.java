package javaCoreHW.hw8.animals;
public abstract class Olfactores {
    private String name;
    private int age;
    private String species;

    public Olfactores(String name, int age, String species) {
        this.name = name;
        this.age = age;
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public String getSpecies() {
        return species;
    }
}



