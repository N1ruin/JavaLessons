package Lesson43.task2;

import Lesson43.task2.model.Car;
import Lesson43.task2.service.CarService;

public class Main {
    public static void main(String[] args) {
        CarService carService = new CarService();
        Car car1 = new Car("123FSF324GDSfEW1", 1999, "black", "228BSS-F");
        Car car2 = new Car("1213123FASdSfEW1", 2001, "white", "221VA2-V");
        Car car3 = new Car("123FSG324GDSfEW1", 1988, "orange", "292932-A");
        Car car4 = new Car("123FSF344GDSfEW1", 2023, "blue", "929439-K");
        Car car5 = new Car("123FSF314GDSfEW1", 2025, "yellow", "9394GS-C");
        carService.addCar(car1);
        carService.addCar(car2);
        carService.addCar(car3);
        carService.addCar(car4);
        carService.addCar(car5);

        Car car = carService.searchCar("123FSF324GDSfEW1");
        carService.printCarInfo(car);
    }
}
