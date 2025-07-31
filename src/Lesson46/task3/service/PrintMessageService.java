package Lesson46.task3.service;

import Lesson46.task3.util.constant.MenuMessages;

public class PrintMessageService {
    public void printWelcomeMessage() {
        System.out.println(MenuMessages.WELCOME_MESSAGE);
    }

    public void printHelpMessage() {
        System.out.println(MenuMessages.HELP_MESSAGE);
    }

    public void printRequestInputNumberMessage() {
        System.out.println(MenuMessages.REQUEST_NUMBER_INPUT_MESSAGE);
    }

    public void printRequestNumberFragmentInput() {
        System.out.println(MenuMessages.REQUEST_NUMBER_FRAGMENT_INPUT);
    }

    public void printRequestCarColorInput() {
        System.out.println(MenuMessages.REQUEST_CAR_COLOR_INPUT);
    }

    public void printRequestCarMinYearInput() {
        System.out.println(MenuMessages.REQUEST_CAR_MIN_YEAR_INPUT);
    }

    public void printRequestCarMaxYearInput() {
        System.out.println(MenuMessages.REQUEST_CAR_MAX_YEAR_INPUT);
    }

    public void printExitMessage() {
        System.out.println(MenuMessages.EXIT_MESSAGE);
    }

    public void printCarNotFoundMessage() {
        System.out.println(MenuMessages.CARS_NOT_FOUND_MESSAGE);
    }

    public void printIncorrectMenuItem() {
        System.out.println(MenuMessages.INCORRECT_MENU_ITEM_MESSAGE);
    }
}
