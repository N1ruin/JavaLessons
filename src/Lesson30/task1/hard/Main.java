package Lesson30.task1.hard;

public class Main {
    public static void main(String[] args) {
        System.out.println(isNumberValid("+375 (29) 361-35-63"));
        System.out.println(isNumberValid("+375 (29) 3s1-35-63"));
        System.out.println(isNumberValid("+375 (29361-35-63"));

    }

    private static boolean isNumberValid(String phoneNumber) {
        return phoneNumber.matches("^\\+\\d{3}\\s?\\(?\\d{2}\\)?\\s?\\d{3}-?\\d{2}\\s?-?\\d{2}$") && isValidBracket(phoneNumber)
                &&isValidHyphen(phoneNumber) &&isValidSpace(phoneNumber);
    }

    private static boolean isValidBracket(String phoneNumber) {
        if (phoneNumber.matches("^[^()]+\\(\\d{2}\\)[^()]+$")) {
            return phoneNumber.matches("^[^()]+\\(\\d{2}\\)[^()]+");
        }

        return true;
    }

    private static boolean isValidSpace(String phoneNumber) {
        if (phoneNumber.contains(" ")) {
            return phoneNumber.matches("^[^ ]+ [^ ]+ [^ ]+$");
        }
        return true;
    }

    private static boolean isValidHyphen(String phoneNumber) {
        if (phoneNumber.contains("-")) {
            return phoneNumber.matches("^[^-]+-[^-]+-[^-]+");
        }

        return true;
    }
}
