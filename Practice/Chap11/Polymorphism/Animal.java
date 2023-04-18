package Polymorphism;

class Animal {
    private String sound;
    private String name;

    Animal(){

    }
    Animal(String sound, String name){
        this.sound = sound;
        this.name = name;
    }
    public void makeSound() {
        System.out.println("The animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The dog barks");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The cat meows");
    }
}


