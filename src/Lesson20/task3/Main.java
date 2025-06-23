package Lesson20.task3;

import Lesson20.task3.exception.ArrayValidationException;
import Lesson20.task3.exception.UnknownAnimalException;
import Lesson20.task3.model.Animal;
import Lesson20.task3.model.Cat;
import Lesson20.task3.model.Cow;
import Lesson20.task3.model.Dog;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[6];
        initArray(animals);
        soundAnimalsInstanceof(animals);
    }

    private static void initArray(Animal[] array) {
        array[0] = new Cat();
        array[1] = new Dog();
        array[2] = new Dog();
        array[3] = new Cow();
        array[4] = new Animal("crya crya");
        array[5] = null;
    }

    private static void soundAnimalsInstanceof(Animal[] animals) {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] == null) {
                throw new ArrayValidationException("Array index " + i + " is null");
            }
            if (animals[i] instanceof Cat cat) {
                cat.meow();
            } else if (animals[i] instanceof Dog dog) {
                dog.woof();
            } else if (animals[i] instanceof Cow cow) {
                cow.mooo();
            } else {
                throw new UnknownAnimalException("Unknown animal");
            }
        }

    }
}

