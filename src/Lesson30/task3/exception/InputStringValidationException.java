package Lesson30.task3.exception;

public class InputStringValidationException extends RuntimeException {
    public InputStringValidationException() {
        super("Input string not valid!");
    }
}
