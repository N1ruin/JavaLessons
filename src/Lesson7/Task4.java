package Lesson7;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи число, дятел:)");
        int number = scanner.nextInt();
        if (number < 1) {
            System.out.println("incorrect number");
            scanner.close();
            return;
        }
        scanner.close();
        int startIteration = 1;
        System.out.println(calculateExpression(number, startIteration));
    }

    static double calculateExpression(int number, int currentIteration) {
        if (currentIteration == number) {
            return Math.sqrt(number);
        }
        return Math.sqrt(currentIteration + calculateExpression(number, currentIteration+1));
    }


}
