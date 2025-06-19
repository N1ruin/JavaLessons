package Lesson4.metanit;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        float bankBonus = 0.07f;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму вклада:");
        float sum = scanner.nextFloat();
        System.out.println("Введите срок вклада в месяцах:");
        int months = scanner.nextInt();
        scanner.close();

        float result = sum;
        for (int i = 0; i < months; i++) {
            result += result * bankBonus;
        }

        System.out.printf("После %d месяцев сумма вклада составит %f", months, result);
    }
}
