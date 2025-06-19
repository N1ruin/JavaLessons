package Lesson6;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = scanner.nextInt();

        System.out.print("Enter b: ");
        int b = scanner.nextInt();

        scanner.close();

        if (a % 2 == 0 && b % 3 == 0) {
            System.out.println(a == b);
        }

        if (isNumberMultipleTwoAndThree(a, b)) {
            powNumbers(a, b);
        }
    }

    static boolean isNumberMultipleTwoAndThree(int a, int b) {
        return a % 2 == 0 && a % 3 == 0;
    }

    static void powNumbers(int a, int b) {
        double result = Math.pow(a, b);

        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
            System.out.println("Результат выражения слишком большой!");
        } else {
            System.out.println((int) result);
        }
    }
}
