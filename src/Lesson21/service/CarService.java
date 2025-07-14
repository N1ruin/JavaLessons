package Lesson21.service;

import Lesson38.model.Car;

public class CarService {
    public Car searchCar(Car[] cars, Car car) {
        for (Car c : cars) {
            if (c.getCarIdentifier().equals(car.getCarIdentifier())) {
                System.out.println("Машина найдена!");
                return c;
            }
        }
        System.out.println("Совпадений не обнаружено");
        return null;
    }

    public void printCarInfo(Car car) {
        System.out.println(car.toString());
    }
}
