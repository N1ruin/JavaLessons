package Lesson25.task2.anonClass;

import Lesson25.task2.anonClass.model.Animal;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[5];
        initArray(animals);
        soundAnimals(animals);
    }

    private static void initArray(Animal[] array) {
        array[0] = createCat();
        array[1] = createDog();
        array[2] = createDog();
        array[3] = createCow();
        array[4] = createCat();
    }

    private static Animal createCat() {
        return new Animal() {
            @Override
            public void sound() {
                System.out.println("meow");
            }
        };
    }

    private static Animal createCow() {
        return new Animal() {
            @Override
            public void sound() {
                System.out.println("moo");
            }
        };
    }

    private static Animal createDog() {
        return new Animal() {
            @Override
            public void sound() {
                System.out.println("woof");
            }
        };
    }

    private static void soundAnimals(Animal[] animals) {

        for (Animal animal : animals) {
            animal.sound();
        }
    }
}
