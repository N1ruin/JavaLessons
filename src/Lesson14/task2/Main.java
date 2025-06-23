package Lesson14.task2;

import Lesson13.task2.model.Animal;

public class Main {
    public static void main(String[] args) {
        Lesson13.task2.model.Animal[] animals = new Lesson13.task2.model.Animal[6];
        initArray(animals);
        soundAnimals(animals);
    }

    private static void initArray(Lesson13.task2.model.Animal[] array) {
        array[0] = new Lesson13.task2.model.Cat();
        array[1] = new Lesson13.task2.model.Dog();
        array[2] = new Lesson13.task2.model.Dog();
        array[3] = new Lesson13.task2.model.Cow();
        array[4] = new Lesson13.task2.model.Cat();
        array[5] = new Lesson13.task2.model.Cat();
    }

    private static void soundAnimals(Lesson13.task2.model.Animal[] animals) {

        for (Animal animal : animals) {
            animal.sound();
        }
    }
}
