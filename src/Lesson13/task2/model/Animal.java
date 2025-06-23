package Lesson13.task2.model;

public class Animal {
    private final String identifier;
    private final String sound;

    public Animal(String identifier, String sound) {
        this.identifier = identifier;
        this.sound = sound;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void sound() {
        System.out.println(sound);
    }
}

