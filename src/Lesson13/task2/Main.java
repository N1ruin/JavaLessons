package Lesson13.task2;

import Lesson13.task2.model.Animal;
import Lesson13.task2.model.Cat;
import Lesson13.task2.model.Cow;
import Lesson13.task2.model.Dog;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[6];
        initArray(animals);
        soundAnimals(animals);

    }

    private static void initArray(Animal[] array) {
        array[0] = new Cat();
        array[1] = new Dog();
        array[2] = new Dog();
        array[3] = new Cow();
        array[4] = new Cat();
        array[5] = new Cat();
    }

    private static void soundAnimals(Animal[] animals) {

        for (Animal animal : animals) {
            String identifier = animal.getIdentifier();

            switch (identifier) {
                case "cat": {
                    ((Cat) animal).meow();
                    break;
                }
                case "dog": {
                    ((Dog) animal).woof();
                    break;
                }
                case "cow": {
                    ((Cow) animal).mooo();
                    break;
                }
            }
        }
    }
}
