package Lesson32.task123.service;

import Lesson32.task123.model.Car;
import Lesson32.task123.repository.CarRepository;

public final class CarService {
    private final CarRepository carRepository;
    private final Car[] cars;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
        cars = new Car[1000];
    }

    public void saveAllCars() {
        carRepository.saveAllCars(cars);
    }

    public void loadAllCars() {
        carRepository.loadAllCars(cars);
    }

    public void addCar(Car car) {
        for (int i = 0; i < cars.length; i++) {
            if (car.equals(cars[i])) {
                return;

            } else {
                if (cars[i] == null) {
                    cars[i] = car;
                    return;
                }
            }
        }
    }

    public void removeCar(Car car) {
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].equals(car)) {
                cars[i] = null;
                return;
            }
        }
        System.out.println("Машина не найдена");
    }

    public void updateCar(Car car, String number, String color) {
        for (Car value : cars) {
            if (value!= null && value.equals(car)) {
                if (number != null) {
                    value.setNumber(number);
                    System.out.println("Номер машины с vin номером " + car.getVinNumber() + " изменен успешно!");
                }
                if (color != null) {
                    value.setColor(color);
                    System.out.println("Цвет машины с vin номером " + car.getVinNumber() + " изменен успешно!");
                }
                return;
            }
        }
        System.out.println("Машина не найдена в базе!");
    }

    public Car[] getCars() {
        return cars;
    }
}
