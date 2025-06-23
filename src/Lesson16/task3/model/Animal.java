package Lesson16.task3.model;

public abstract class Animal {
    protected final String identifier;
    protected final String sound;

    public Animal(String identifier, String sound) {
        this.identifier = identifier;
        this.sound = sound;
    }

    public String getIdentifier() {
        return identifier;
    }

    public String getSound() {
        return sound;
    }

    public abstract void sound();
}

