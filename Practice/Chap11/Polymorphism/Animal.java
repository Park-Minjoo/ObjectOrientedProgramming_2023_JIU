package Polymorphism;

class Animal {
    public void makeSound() {
        System.out.println("동물이 소리를 낸다.");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("개가 짖는다.");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("고양이가 울부짖는다.");
    }
}

