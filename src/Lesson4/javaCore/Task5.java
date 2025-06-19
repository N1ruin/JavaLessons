package Lesson4.javaCore;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
//        do {
//            System.out.println("Введите число");
//            num = scanner.nextInt();
//            System.out.println("Не угадал!");
//        } while (num != 1);

        while (num != 1) {
            System.out.println("Введите число");
            num = scanner.nextInt();
            if(num != 1) {
                System.out.println("Не угадал");
            }
        }
    }
}
