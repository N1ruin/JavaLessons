package Lesson43.task2;

import Lesson43.task2.model.Car;
import Lesson43.task2.service.CarService;

public class Main {
    public static void main(String[] args) {
        Car[] cars = new Car[5];

        cars[0] = new Car("123FSF324GDSfEW1", 1999, "black", "228BSS-F");
        cars[1] = new Car("1213123FASdSfEW1", 2001, "white", "221VA2-V");
        cars[2] = new Car("123FSG324GDSfEW1", 1988, "orange", "292932-A");
        cars[3] = new Car("123FSF344GDSfEW1", 2023, "blue", "929439-K");
        cars[4] = new Car("123FSF314GDSfEW1", 2025, "yellow", "9394GS-C");

        CarService carService = new CarService();

        Car car = carService.searchCar(cars, "123FSF324GDSfEW1", "228BSS-F");
        carService.printCarInfo(car);
    }
}
