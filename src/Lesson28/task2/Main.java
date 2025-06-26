package Lesson28.task2;

import Lesson28.task2.model.ObjectWrapper;

public class Main {
    public static void main(String[] args) {
        ObjectWrapper<Integer> integerObjectWrapper = new ObjectWrapper<>(null);
        ObjectWrapper<String> stringObjectWrapper = new ObjectWrapper<>("Hello");

        System.out.println(integerObjectWrapper.isNull());
        System.out.println(stringObjectWrapper.isNull());
    }
}
