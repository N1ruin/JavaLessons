package Lesson4.metanit;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        float bankBonus = 0.07f;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму вклада:");
        float sum = scanner.nextFloat();
        System.out.println("Введите срок вклада в месяцах:");
        int months = scanner.nextInt();
        scanner.close();
        int i = months;

        float result = sum;
        while (i > 0) {
            result += result * bankBonus;
            i--;
        }

        System.out.printf("После %d месяцев сумма вклада составит %f", months, result);
    }
}
