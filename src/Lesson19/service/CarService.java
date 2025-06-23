package Lesson19.service;

import Lesson19.model.Car;

public class CarService {
    public Car searchCar(Car[] cars, String VinNumber, String number) {
        for (Car car : cars) {
            if (car.equals(new Car(VinNumber, 0, null, number))) {
                System.out.println("Машина найдена!");
                return car;
            }
        }
        System.out.println("Совпадений не обнаружено");
        return null;
    }

    public void printCarInfo(Car car) {
        System.out.println(car.toString());
    }
}
