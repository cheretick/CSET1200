package Assignment9;

class Animal {
    double size;
    String shape;
    String color;
    double speed;
    String gender;
    String diet;

    public void move() {
        System.out.println("the animal moves");
    }

    public void sleep(int minutes) {
        System.out.println("the animal sleeps for " + minutes + " minutes");
    }

    public void eat() {
        System.out.println("the animal eats");
    }
}

class HouseCat extends Animal {
    double hairLength;
    String name;
    String veterinarian;

    public void purr() {
        System.out.println("the cat purrs");
    }

    public void play() {
        System.out.println("The cat plays");
    }

    public void chaseMouse() {
        System.out.println("The cat chases a mouse");
    }

    @Override
    public void eat() {
        System.out.println("The cat eats");
    }

    // Overloads sleep()
    public void sleep(double hours) {
        System.out.println("The cat sleeps for " + hours + " hours");
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        Animal animal = new Animal();
        HouseCat cat = new HouseCat();

        animal.eat();
        cat.eat();

        animal.sleep(20);
        cat.sleep(58);
        cat.sleep(2.5);
    }
}
