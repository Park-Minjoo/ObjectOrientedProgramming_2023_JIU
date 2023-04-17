package Inheritance;

public class Animal2 {
    private String name;
    private String sound;

    public Animal2(String name, String sound) {
        this.name = name;
        this.sound = sound;
    }

    public String getName() {
        return name;
    }

    public String getSound() {
        return sound;
    }

    public void makeSound() {
        System.out.println(name + " says " + sound);
    }
}
