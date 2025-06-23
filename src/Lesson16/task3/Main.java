package Lesson16.task3;

import Lesson16.task3.model.Animal;
import Lesson16.task3.model.Cat;
import Lesson16.task3.model.Cow;
import Lesson16.task3.model.Dog;

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
            animal.sound();
        }
    }
}
