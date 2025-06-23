package Lesson17.task2;

import Lesson17.task2.model.Animal;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[5];
        animals[0] = Animal.COW;
        animals[1] = Animal.CAT;
        animals[2] = Animal.CAT;
        animals[3] = Animal.DOG;
        animals[4] = Animal.DOG;

        soundAnimals(animals);
    }

    private static void soundAnimals(Animal[] animals) {
        for (Animal animal : animals) {
            animal.playsSound();
        }
    }
}
