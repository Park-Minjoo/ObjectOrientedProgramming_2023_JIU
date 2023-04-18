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

    public String getSound(){
        return this.sound;
    }

    public String getName(){
        return this.name;
    }

    public void makeSound() {
        System.out.println("The animal makes a sound");
    }
}

class Dog extends Animal {
    Dog(){

    }
    Dog(String name, String sound){
        super(sound, name);
    }
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


