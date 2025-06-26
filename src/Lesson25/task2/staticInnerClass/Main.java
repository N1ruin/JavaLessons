package Lesson25.task2.staticInnerClass;

import Lesson25.task2.staticInnerClass.model.Animal;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[5];
        initArray(animals);
        soundAnimals(animals);
    }

    private static void initArray(Animal[] array) {
        array[0] = new Cat();
        array[1] = new Dog();
        array[2] = new Cow();
        array[3] = new Cat();
        array[4] = new Cat();
    }

    private static void soundAnimals(Animal[] animals) {
        for (Animal animal : animals) {
            animal.sound();
        }
    }

    private static class Cat extends Animal {
        @Override
        public void sound() {
            System.out.println("meow");
        }
    }

    private static class Cow extends Animal {
        @Override
        public void sound() {
            System.out.println("moo");
        }
    }

    private static class Dog extends Animal {
        @Override
        public void sound() {
            System.out.println("woof");
        }
    }
}
