package Lesson46.task1.task1;

import Lesson46.task1.model.Car;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("123E", 1999, "black", "777"));
        cars.add(new Car("123E", 1999, "blue", "123"));
        cars.add(new Car("122G", 2001, "white", "234"));
        cars.add(new Car("123V", 1999, "red", "236"));
        Comparator<Car> numberComparator = Comparator.comparing(Car::getNumber);
        Comparator<Car> colorComparator = Comparator.comparing(Car::getColor);
        Comparator<Car> yearComparator = Comparator.comparingInt(c -> c.getCarIdentifier().getYear());

        cars.sort(numberComparator);
        System.out.println(cars);

        cars.sort(colorComparator);
        System.out.println(cars);

        cars.sort(yearComparator);
        System.out.println(cars);

        cars.sort(numberComparator.thenComparing(yearComparator));
        System.out.println(cars);
    }
}
