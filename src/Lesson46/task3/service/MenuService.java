package Lesson46.task3.service;

import Lesson46.task3.core.model.Car;

import java.util.Set;

public class MenuService {
    private final PrintMessageService printMessageService;
    private final InputValidationService inputValidationService;
    private final CarService carService;
    private final InputService inputService;

    public MenuService(PrintMessageService printMessageService, InputValidationService inputValidationService, CarService carService, InputService inputService) {
        this.printMessageService = printMessageService;
        this.inputValidationService = inputValidationService;
        this.carService = carService;
        this.inputService = inputService;
    }

    public void findCars(int menuItem) {
        Set<Car> result = null;

        switch (menuItem) {
            case 1 -> result = searchCarsByNumber();
            case 2 -> result = searchCarsByNumberFragment();
            case 3 -> result = searchCarsByColor();
            case 4 -> result = searchCarsByYear();
        }

        printResult(result);
    }

    private Set<Car> searchCarsByNumber() {
        printMessageService.printRequestInputNumberMessage();
        String number = inputNumber();

        return carService.findCars((car -> car.getNumber().equals(number)));
    }

    private String inputNumber() {
        String number = inputService.inputString();

        while (!inputValidationService.validationCarNumber(number)) {
            System.out.println("Некорректный номер, попробуйте еще раз!");
            number = inputService.inputString();
        }

        return number;
    }

    private Set<Car> searchCarsByNumberFragment() {
        printMessageService.printRequestNumberFragmentInput();
        String numberFragment = inputNumberFragment();

        return carService.findCars((car -> car.getNumber().contains(numberFragment)));
    }

    private String inputNumberFragment() {
        String fragment = inputService.inputString();

        while (!inputValidationService.validationCarNumberFragment(fragment)) {
            System.out.println("Некорректный фрагмент номера, попробуйте еще раз!");
            fragment = inputService.inputString();
        }

        return fragment;
    }

    private Set<Car> searchCarsByColor() {
        printMessageService.printRequestCarColorInput();
        String color = inputColor();

        return carService.findCars(car -> car.getColor().equals(color));
    }

    private String inputColor() {
        String color = inputService.inputString();

        while (!inputValidationService.validationCarColor(color)) {
            System.out.println("Некорректный цвет, попробуйте еще раз!");
            color = inputService.inputString();
        }

        return color;
    }

    private Set<Car> searchCarsByYear() {
        printMessageService.printRequestCarMinYearInput();
        int minYearInput = inputYear();

        printMessageService.printRequestCarMaxYearInput();
        int maxYearInput = inputYear();


        int minYear = Math.min(minYearInput, maxYearInput);
        int maxYear = Math.max(minYearInput, maxYearInput);

        return carService.findCars(car -> car.getCarIdentifier().getYear() <= maxYear
                && car.getCarIdentifier().getYear() >= minYear);
    }

    private int inputYear() {
        String year = inputService.inputString();

        while (!inputValidationService.validationCarYear(year)) {
            System.out.println("Некорректный год, попробуйте еще раз!");
            year = inputService.inputString();
        }
        return Integer.parseInt(year);
    }

    private void printResult(Set<Car> result) {
        if (result != null) {

            if (result.isEmpty()) {
                printMessageService.printCarNotFoundMessage();
                return;
            }

            System.out.println("Найдено %s машин:".formatted(result.size()));
            carService.printCar(result);
        }
    }
}

