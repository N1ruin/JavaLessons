package Lesson28.task1;

import Lesson28.task1.model.Pow;

public class Main {
    public static void main(String[] args) {
        Pow<Integer > integerPow = new Pow<>(5);
        System.out.println(integerPow.pow(2));
        Pow<Long> longPow =new Pow<>(5L);
        System.out.println(longPow.pow(3));
    }
}
