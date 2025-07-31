package Lesson46.task3.service;

import Lesson46.task3.core.model.Car;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

public class CarService {
    private final List<Car> cars;

    public CarService() {
        this.cars = new ArrayList<>();
    }

    public Set<Car> findCars(Predicate<Car> carPredicate) {
        Set<Car> result = new HashSet<>();
        for (Car car : cars) {
            if (carPredicate.test(car)) {
                result.add(car);
            }
        }
        return result;
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public void printCar(Set<Car> cars) {
        for (Car car : cars) {
            System.out.println(car);
        }
    }
}
