package Assignment;

public class Animal {
    private String name;
    private String sound;

    public Animal(String name, String sound) {
        this.name = name;
        this.sound = sound;
    }

    public String getName() {
        return this.name;
    }

    public String getSound() {
        return this.sound;
    }

    public void makeSound() {
        System.out.println(this.name + " says " + this.sound);
    }
}

