package Lesson3.metanitPractis;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер операции:" + '\n' + "1. Сложение" + '\n' + "2. Вычитание" + '\n' + "3. Умножение");
        int operationNumber = scanner.nextInt();
        scanner.close();

        switch (operationNumber) {
            case 1: {
                System.out.println("Сложение");
                break;
            }
            case 2: {
                System.out.println("Вычитание");
                break;
            }
            case 3: {
                System.out.println("Умножение");
                break;
            }
            default: {
                System.out.println("Неверная операция");
            }
        }
    }
}
