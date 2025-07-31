package Lesson43.task2.service;

import Lesson43.task2.model.Car;

import java.util.HashMap;

public class CarService {
    private final HashMap<String, Car> cars = new HashMap<>();

    public Car searchCar(String vinNumber) {
        Car result = cars.get(vinNumber);
        if (result == null) {
            throw new RuntimeException("Car with vin number %s not found!".formatted(vinNumber));
        }
        return result;
    }

    public void addCar(Car car) {
        cars.put(car.getVinNumber(), car);
    }

    public void printCarInfo(Car car) {
        System.out.println(car.toString());
    }
}
