package Lesson3.javaCorePractics;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число 1");
        int num1 = scanner.nextInt();
        System.out.println("Введите число 2");
        int num2 = scanner.nextInt();
        scanner.close();

        if (num1 % 2 == 0 || num2 % 3 == 0) {
            if (num1 > num2) {
                System.out.println("num1 больше num2");
            } else if (num1 < num2) {
                System.out.println("num1 меньше num2");
            } else {
                System.out.println("Числа равны");
            }
        }
        if (num1 % 2 == 0 && num1 % 3 == 0) {
            long pow = (long) Math.pow(num1, num2);
            if (pow > Integer.MAX_VALUE) {
                System.out.println("Результат выражения слишком большой");
            } else {
                System.out.println(Math.pow(num1, num2));
            }
        }
    }
}
