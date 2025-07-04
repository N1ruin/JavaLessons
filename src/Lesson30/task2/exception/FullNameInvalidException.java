package Lesson30.task2.exception;

public class FullNameInvalidException extends RuntimeException {
    public FullNameInvalidException() {
        super("Full name is not valid!");
    }
}
