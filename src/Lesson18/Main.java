package Lesson18;

import Lesson18.model.Animal;
import Lesson18.model.Cat;
import Lesson18.model.Cow;
import Lesson18.model.Dog;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[6];
        initArray(animals);
        soundAnimalsInstanceof(animals);
        System.out.println();
        soundAnimalsGetClass(animals);
    }

    private static void initArray(Animal[] array) {
        array[0] = new Cat();
        array[1] = new Dog();
        array[2] = new Dog();
        array[3] = new Cow();
        array[4] = new Cat();
        array[5] = new Cat();
    }

    private static void soundAnimalsInstanceof(Animal[] animals) {

        for (Animal animal : animals) {
            if (animal instanceof Cat cat) {
                cat.meow();
            } else if (animal instanceof Dog dog) {
                dog.woof();
            } else if (animal instanceof Cow cow) {
                cow.mooo();
            } else {
                System.out.println("Unknown animal");
            }

        }
    }

    private static void soundAnimalsGetClass(Animal[] animals) {
        for (Animal animal : animals) {
            Class clazz = animal.getClass();
            if (clazz.equals(Cat.class)) {
                ((Cat) animal).meow();
            } else if (clazz.equals(Dog.class)) {
                ((Dog) animal).woof();
            } else if (clazz.equals(Cow.class)) {
                ((Cow) animal).mooo();
            } else {
                System.out.println("Unknown animal");
            }
        }
    }
}
