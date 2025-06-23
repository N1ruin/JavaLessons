package Lesson18.model;

public class Animal {
    private final String sound;

    public Animal(String sound) {
        this.sound = sound;
    }
    public void sound() {
        System.out.println(sound);
    }
}

