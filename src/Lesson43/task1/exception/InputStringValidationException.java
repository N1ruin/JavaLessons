package Lesson43.task1.exception;

public class InputStringValidationException extends RuntimeException {
    public InputStringValidationException() {
        super("Input string not valid!");
    }
}
