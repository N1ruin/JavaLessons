package Lesson4.javaCore;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int num = scanner.nextInt();
        scanner.close();

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(num + i);
            } else if (i == num) {
                System.out.println("Числа равны");
            } else {
                System.out.println(i - num);
            }
        }
    }
}
