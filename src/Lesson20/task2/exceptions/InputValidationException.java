package Lesson20.task2.exceptions;

public class InputValidationException extends RuntimeException {
    public InputValidationException(String message) {
        super(message);
    }
}
