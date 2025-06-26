package Lesson28.task3.service;

import Lesson28.task3.exception.ArrayElementNotFoundException;

public class ArraySearchService<T> {
    private T[] array;

    public ArraySearchService(T[] array) {
        this.array = array;
    }

    public T[] getArray() {
        return array;
    }

    public T search(T object) {
        for (T obj : array) {
            if (obj.equals(object)) {
                return obj;
            }
        }
        throw new ArrayElementNotFoundException(object);
    }
}
