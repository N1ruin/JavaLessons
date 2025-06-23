package Lesson13.task2.model;

public class Cat extends Animal {
    private static final String CAT_IDENTIFIER = "cat";

    public Cat() {
        super(CAT_IDENTIFIER, "meow");
    }

    public void meow() {
        sound();
    }
}
