package Lesson46.task2.model;

public class Cow extends Animal {
    public static final String COW_IDENTIFIER = "cow";

    public Cow() {
        super(COW_IDENTIFIER, "moo");
    }

    @Override
    public void sound() {
        System.out.println(sound);
    }
}
