package interfaces;

public class Cat implements Animal, Sleep {
    public static final String NAME = "Felix";

    @Override
    public void makeSound() {
        System.out.println("Meow meow meow!");
    }

    @Override
    public void walk() {
        System.out.println("Cat walks!");
    }

    @Override
    public void eat() {
        System.out.println("Car eats!");
    }

    @Override
    public void sleep() {

    }
}
