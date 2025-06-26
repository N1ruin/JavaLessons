package Lesson28.task4;

public class StackElementNotFoundException extends RuntimeException {
    public StackElementNotFoundException() {
        super("Element not found");
    }
}
