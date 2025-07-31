package Lesson46.task2;

import Lesson46.task2.model.Animal;
import Lesson46.task2.model.Cat;
import Lesson46.task2.model.Cow;
import Lesson46.task2.model.Dog;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        initArray(animals);
        soundAnimals(animals);

    }

    private static void initArray(List<Animal> animals) {
        animals.add(new Cat());
        animals.add(new Dog());
        animals.add(new Cow());
        animals.add(new Cat());
        animals.add(new Dog());
        animals.add(new Dog());
    }

    private static void soundAnimals(List<Animal> animals) {
        animals.forEach(Animal::sound);
    }
}
