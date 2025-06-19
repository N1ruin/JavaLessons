package Lesson4.javaCore;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int num = scanner.nextInt();
        int result = 0;
scanner.close();
        while (num > 0) {
            result += num % 10;
            num = num / 10;
        }
        System.out.println(result);
    }
}
