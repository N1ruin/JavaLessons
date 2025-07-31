package Lesson46.task3;


import Lesson46.task3.core.model.Car;
import Lesson46.task3.service.*;
import Lesson46.task3.ui.ConsoleMenu;

public class Main {
    public static void main(String[] args) {
        InputValidationService inputValidationService = new InputValidationService();
        InputService inputService = new InputService(inputValidationService);
        PrintMessageService printMessageService = new PrintMessageService();
        CarService carService = new CarService();
        MenuService menuService = new MenuService(printMessageService, inputValidationService, carService, inputService);

        ConsoleMenu menu = new ConsoleMenu(printMessageService, inputValidationService, inputService, menuService);
        initCarDataBase(carService);

        menu.start();
    }

    private static void initCarDataBase(CarService carService) {
        carService.addCar(new Car("2C3CDXBG7EH284562", 1999, "white", "9109 IA-1"));
        carService.addCar(new Car("SALAG25475A335712", 2005, "red", "2221 OK-2"));
        carService.addCar(new Car("1GTHC23607F550764", 1988, "black", "9213 EA-3"));
        carService.addCar(new Car("2G1WF5EK7B1252246", 2020, "yellow", "5435 CC-4"));
        carService.addCar(new Car("JM3TB3CV1E0493038", 2025, "white", "2954 BJ-5"));
        carService.addCar(new Car("JTEGF21A630144068", 2002, "black", "9523 UJ-6"));
        carService.addCar(new Car("2HSFHAMR7WC016853", 2000, "black", "1923 JF-5"));
        carService.addCar(new Car("JM1BL1V78C1631850", 2010, "silver", "2492 IW-7"));
        carService.addCar(new Car("1GAHG39R111128074", 2011, "gray", "3387 WA-7"));
        carService.addCar(new Car("2C3CDYAG8DH620158", 1999, "pink", "5834 VC-7"));

    }
}
