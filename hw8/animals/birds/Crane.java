package javaCoreHW.hw8.animals.birds;

    public abstract class Crane extends javaCoreHW.hw8.animals.birds.Birds {
        public Crane (String name, int age, String species) {
            super(name, age, species);
        }
        @Override
        public void move() {
            System.out.println("Flying");
        }
    }



