package Lesson13.task2.model;

public class Cow extends Animal {
    public static final String COW_IDENTIFIER = "cow";

    public Cow() {
        super(COW_IDENTIFIER, "moo");
    }

    public void mooo() {
        sound();
    }
}
