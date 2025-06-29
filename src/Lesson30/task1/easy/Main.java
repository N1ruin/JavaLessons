package Lesson30.task1.easy;

public class Main {
    public static void main(String[] args) {
        System.out.println(isNumberValid("+375 (29) 361-35-63"));
        System.out.println(isNumberValid("+375 (29) 3s1-35-63"));
        System.out.println(isNumberValid("+375 (29361-35-63"));

    }

    private static boolean isNumberValid(String phoneNumber) {
        return phoneNumber.matches("^\\+375 \\(\\d{2}\\) \\d{3}-\\d{2}-\\d{2}$");
    }
}
