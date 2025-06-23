package Lesson16.task3.model;

public class Dog extends Animal {
    public static final String DOG_IDENTIFIER = "dog";

    public Dog() {
        super(DOG_IDENTIFIER, "woof");
    }

    @Override
    public void sound() {
        System.out.println(sound);
    }
}
