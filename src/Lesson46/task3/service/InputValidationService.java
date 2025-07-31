package Lesson46.task3.service;

import Lesson46.task3.util.constant.ValidationRegex;

public class InputValidationService {

    public boolean validationMenuItem(String input) {
        return input.matches(ValidationRegex.MENU_ITEM_PATTERN);
    }

    public boolean validationCarNumber(String carNumber) {
        return carNumber.matches(ValidationRegex.BELARUS_CAR_NUMBER_PATTERN);
    }

    public boolean validationCarColor(String color) {
        return color.matches(ValidationRegex.COLOR_INPUT_PATTERN);
    }

    public boolean validationCarNumberFragment(String numberFragment) {
        return numberFragment.matches(ValidationRegex.CAR_NUMBER_FRAGMENT_PATTERN);
    }

    public boolean validationCarYear(String year) {
        return String.valueOf(year).matches(ValidationRegex.CAR_YEAR_PATTERN);
    }
}
