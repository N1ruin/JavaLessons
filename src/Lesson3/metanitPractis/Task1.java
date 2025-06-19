package Lesson3.metanitPractis;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число 1");
        int a = scanner.nextInt();
        System.out.println("Введите число 2");
        int b = scanner.nextInt();
        scanner.close();
        if (a == b) {
            System.out.println("Числа равны");
        } else if (a < b) {
            System.out.println("a меньше b");
        } else {
            System.out.println("a больше b");
        }
    }
}
