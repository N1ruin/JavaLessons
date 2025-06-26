package Lesson28.task2.model;

public class ObjectWrapper<T> {
    private final T object;

    public ObjectWrapper(T object) {
        this.object = object;
    }

    public boolean isNull() {
        return object == null;
    }

    public T getObject() {
        return object;
    }
}
