package Lesson4.metanit;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        while (running) {
            System.out.println("Введите число 1:");
            int num1 = scanner.nextInt();
            System.out.println("Введите число 2");
            int num2 = scanner.nextInt();
            System.out.printf("Результат умножения чисел: %d \n", num1 * num2);

            System.out.println("Введите 1 чтобы выйти из приложения или другое число чтобы продолжить");
            if (scanner.nextInt() == 1) {
                running = false;
                System.out.println("Выход из приложения...");
                scanner.close();
            }
        }
    }
}
