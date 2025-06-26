package Lesson25.task2.innerClass;

import Lesson25.task2.innerClass.model.Animal;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[5];
        initArray(animals);
        soundAnimals(animals);
    }

    private static void initArray(Animal[] array) {
        Main main = new Main();
        array[0] = main.new Cat();
        array[1] = main.new Dog();
        array[2] = main.new Cow();
        array[3] = main.new Cat();
        array[4] = main.new Cat();
    }

    private static void soundAnimals(Animal[] animals) {
        for (Animal animal : animals) {
            animal.sound();
        }
    }

    private class Cat extends Animal {
        @Override
        public void sound() {
            System.out.println("meow");
        }
    }

    private class Cow extends Animal {
        @Override
        public void sound() {
            System.out.println("moo");
        }
    }

    private class Dog extends Animal {
        @Override
        public void sound() {
            System.out.println("woof");
        }
    }
}
