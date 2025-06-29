package Lesson29.task2;

import Lesson29.task2.model.Pow;

public class Main {
    public static void main(String[] args) {
        System.out.println(testMethod(10).pow(2));
    }

    private static Pow<? extends Number> testMethod(Number number) {
        return new Pow<>(number);
    }
}
