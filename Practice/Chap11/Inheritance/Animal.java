package Inheritance;

class Animal {
    public void makeSound() {
        System.out.println("Some sound");
    }
}

class Cat extends Animal {
    public void makeSound() {
        System.out.println("Meow");
    }
}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("Woof");
    }
}

