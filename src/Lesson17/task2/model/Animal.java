package Lesson17.task2.model;

public enum Animal {
    CAT("meow"),
    DOG("woof"),
    COW("moo");

    private final String sound;

    Animal(String sound) {
        this.sound = sound;
    }

    public void playsSound() {
        System.out.println(sound);
    }
}
