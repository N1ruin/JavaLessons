package Lesson3.metanitPractis;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер операции:" + '\n' + "1. Сложение" + '\n' + "2. Вычитание" + '\n' + "3. Умножение");
        int operationNumber = scanner.nextInt();
        System.out.println("Введите число 1");
        int a = scanner.nextInt();
        System.out.println("Введите число 2");
        int b = scanner.nextInt();
        scanner.close();
        int result = 0;

        switch (operationNumber) {
            case 1:
                System.out.println("Сложение");
                result = a + b;
                break;
            case 2:
                System.out.println("Вычитание");
                result = a - b;
                break;
            case 3:
                System.out.println("Умножение");
                result = a * b;
                break;
            default:
                System.out.println("Неверная операция");
        }
        System.out.println(result);
    }
}
