package interfaces;

public class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Wooof!");
    }

    @Override
    public void walk() {
        System.out.println("Dog walks!");
    }

    @Override
    public void eat() {
        System.out.println("Dog eats!");
    }
}
