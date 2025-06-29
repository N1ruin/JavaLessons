package Lesson29.task2.model;

public class Pow<T extends Number> {
    private final T value;

    public Pow(T value) {
        this.value = value;
    }

    public double pow(int pow) {
        return Math.pow(value.doubleValue(), pow);
    }

    public T getValue() {
        return value;
    }
}
