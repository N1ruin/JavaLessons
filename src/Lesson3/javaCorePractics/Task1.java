package Lesson3.javaCorePractics;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введиче число 1");
        int num1 = scanner.nextInt();
        System.out.println("Введите число 2");
        int num2 = scanner.nextInt();
        scanner.close();

        if (num1 % 2 == 0) {
            System.out.println((float) num1 * num2);
        } else {
            System.out.println((float) num1 / num2);
        }
    }
}
