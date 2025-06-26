package Lesson28.task4.exceptions;

public class StackElementNotFoundException extends RuntimeException {
    public StackElementNotFoundException() {
        super("Element not found");
    }
}
