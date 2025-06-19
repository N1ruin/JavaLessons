package Lesson3.metanitPractis;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму вклада");
        int sum = scanner.nextInt();
        scanner.close();
        if (sum < 100) {
            sum += Math.round(sum * 0.05f);
        } else if (sum >= 100 && sum < 200) {
            sum += Math.round(sum * 0.07f);
        } else {
            sum += Math.round(sum * 0.1f);
        }
        System.out.println(sum);
    }
}
