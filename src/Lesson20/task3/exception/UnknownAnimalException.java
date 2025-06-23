package Lesson20.task3.exception;

public class UnknownAnimalException extends RuntimeException {
    public UnknownAnimalException(String message) {
        super(message);
    }
}
