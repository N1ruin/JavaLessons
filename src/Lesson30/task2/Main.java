package Lesson30.task2;

import Lesson30.task2.exception.FullNameInvalidException;

public class Main {
    public static void main(String[] args) {
        System.out.println(isFullnameValid("Лагун Евгений Сергеевич"));
    }

    private static boolean isFullnameValid(String fullName) {
        if (fullName.matches("^[А-Яа-я]+-?[а-яА-Я]+ [А-Яа-я]+ [А-Яа-я]+$") && isDoubleNameValid(fullName)) {
            return true;
        }
        throw new FullNameInvalidException();
    }

    private static boolean isDoubleNameValid(String name) {
        if (name.contains("-")) {
            return name.matches("^[А-Яа-я]+-[А-Яа-я]+ [А-Яа-я]+ [А-Яа-я]+$");
        }

        return true;
    }
}
