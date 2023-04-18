package Polymorphism;

public class PolymorphismExample {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        Dog dog1 = new Dog();
        Animal animal2 = new Dog();
        Animal animal3 = new Cat();

        animal1.makeSound();
        animal2.makeSound();
        animal3.makeSound();
    }
}