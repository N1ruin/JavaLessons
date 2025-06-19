package Lesson3.metanitPractis;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int num = scanner.nextInt();
        scanner.close();
        if (num > 2 && num < 9) {
            System.out.println("Число больше 5 и меньше 9");
        } else {
            System.out.println("Неизвестное число");
        }
    }
}
