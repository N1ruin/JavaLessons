package Lesson13.task2.model;

public class Dog extends Animal {
    public static final String DOG_IDENTIFIER = "dog";
    public Dog() {
        super(DOG_IDENTIFIER, "woof");
    }

    public void woof() {
        sound();
    }
}
