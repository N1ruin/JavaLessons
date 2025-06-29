package Lesson29.task1;

public class TestClass<T> {
    private T field;

    public TestClass(T field) {
        this.field = field;
    }

    public T getField() {
        return field;
    }
}
