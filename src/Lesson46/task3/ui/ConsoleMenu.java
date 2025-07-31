package Lesson46.task3.ui;

import Lesson46.task3.service.*;


public class ConsoleMenu {
    private boolean running = true;
    private final PrintMessageService printMessageService;
    private final InputValidationService inputValidationService;
    private final InputService inputService;
    private final MenuService menuService;

    public ConsoleMenu(PrintMessageService printMessageService, InputValidationService inputValidationService,
                       InputService inputService, MenuService menuService) {
        this.printMessageService = printMessageService;
        this.inputValidationService = inputValidationService;
        this.inputService = inputService;
        this.menuService = menuService;
    }

    public void start() {
        printMessageService.printWelcomeMessage();

        while (running) {
            printMessageService.printHelpMessage();

            int menuItem = Integer.parseInt(inputMenuItem());

            if (menuItem == 0) {
                running = false;
                printMessageService.printExitMessage();
            }

            menuService.findCars(menuItem);
        }
        inputService.close();
    }

    private String inputMenuItem() {
        String menuItem = inputService.inputString();

        while (!inputValidationService.validationMenuItem(menuItem)) {

            printMessageService.printIncorrectMenuItem();
            printMessageService.printHelpMessage();

            menuItem = inputService.inputString();
        }

        return menuItem;
    }
}
