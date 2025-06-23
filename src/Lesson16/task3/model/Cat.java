package Lesson16.task3.model;

public class Cat extends Animal {
    private static final String CAT_IDENTIFIER = "cat";

    public Cat() {
        super(CAT_IDENTIFIER, "meow");
    }

    @Override
    public void sound() {
        System.out.println(sound);
    }
}
