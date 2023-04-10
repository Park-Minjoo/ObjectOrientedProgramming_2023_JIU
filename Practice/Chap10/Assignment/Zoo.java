package Assignment;


public class Zoo {
    private Animal[] animals;
    private int numAnimals;

    public Zoo() {
        this.animals = new Animal[10]; // initialize with capacity for 10 animals
        this.numAnimals = 0;
    }

    public void addAnimal(Animal animal) {
        if (this.numAnimals == this.animals.length) {
            // animals array is full, resize it to accommodate more animals
            Animal[] newAnimals = new Animal[this.animals.length * 2];
            for (int i = 0; i < this.numAnimals; i++) {
                newAnimals[i] = this.animals[i];
            }
            this.animals = newAnimals;
        }

        this.animals[this.numAnimals] = animal;
        this.numAnimals++;
    }

    public Animal[] getAnimals() {
        Animal[] animalCopy = new Animal[this.numAnimals];
        for (int i = 0; i < this.numAnimals; i++) {
            animalCopy[i] = this.animals[i];
        }
        return animalCopy;
    }

    public int getNumAnimals() {
        return this.numAnimals;
    }

    public void makeAllSounds() {
        for (int i = 0; i < this.numAnimals; i++) {
            this.animals[i].makeSound();
        }
    }
}
