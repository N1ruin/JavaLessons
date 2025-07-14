package Lesson38.task1;

import Lesson38.model.Car;
import Lesson38.task1.comparator.CarNumberComparator;
import Lesson38.task1.comparator.CarYearComparator;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("123E", 1999, "black", "777"));
        cars.add(new Car("123E", 1999, "blue", "123"));
        cars.add(new Car("122G", 2001, "white", "234"));
        cars.add(new Car("123V", 1999, "red", "236"));


//        cars.sort(new CarNumberComparator());
//        cars.sort(new CarYearComparator().thenComparing(new CarNumberComparator()));
        cars.sort(new CarNumberComparator().thenComparing(new CarYearComparator()));
        System.out.println(cars);
    }
}
