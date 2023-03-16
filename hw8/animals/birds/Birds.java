package javaCoreHW.hw8.animals.birds;

    public abstract class Birds extends javaCoreHW.hw8.animals.Olfactores implements javaCoreHW.hw8.animals.OlfactoresBehavior {
        public Birds (String name, int age, String species) {
            super(name, age, species);
        }
        @Override
        public void move() {
        }
        @Override
        public void eat(){
            System.out.println("Eating");
        }
        @Override
        public void makeSound(){
            System.out.println("Cheep");
        }
        public void swim() {
            System.out.println("Drown");
        }
    }



