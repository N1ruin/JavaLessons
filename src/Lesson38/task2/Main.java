package Lesson38.task2;

import Lesson38.model.Car;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("123E", 1999, "black", "777"));
        cars.add(new Car("123E", 1999, "blue", "123"));
        cars.add(new Car("123E", 1999, "white", "234"));
        cars.add(new Car("123V", 1999, "red", "236"));

        System.out.println(cars.get(0).compareTo(cars.get(2)));
    }
}
