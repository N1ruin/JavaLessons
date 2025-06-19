package Lesson2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите а");
        int a = scanner.nextInt();
        System.out.println("Введите b");
        int b = scanner.nextInt();
        scanner.close();
        System.out.println((a * a * a) > (b * b));
    }
}
