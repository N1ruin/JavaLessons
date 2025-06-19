package Lesson4.javaCore;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        char horizontalElement = '-';
        char verticalElement = '|';
        char degree = ' ';

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину");
        int length = scanner.nextInt();
        System.out.println("Введите ширину");
        int width = scanner.nextInt();
        scanner.close();

        for (int i = 1; i <= width; i++) {
            for (int j = 1; j <= length; j++) {
                if ((j == 1 || j == length) && (i == 1 || i == width)) {
                    System.out.print(degree);
                } else if (i != 1 && i != width && j != 1 && j != length) {
                    System.out.print(" ");
                } else if (i == 1 || i == width) {
                    System.out.print(horizontalElement);
                } else {
                    System.out.print(verticalElement);
                }
            }
            System.out.println();

        }

    }
}
