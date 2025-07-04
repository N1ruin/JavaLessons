package Lesson32.task123;

import Lesson32.task123.model.Car;
import Lesson32.task123.repository.CarRepository;
import Lesson32.task123.service.CarService;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        CarService carService = new CarService(new CarRepository());

        carService.loadAllCars();

        carService.addCar(new Car("3124", "eq123", 1999, "blue"));
        carService.addCar(new Car("1234", "oewq123", 1999, "red"));
        carService.addCar(new Car("1234", "gfd0213", 1988, "yellow"));
        carService.saveAllCars();
    }
}
