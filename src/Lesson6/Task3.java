package Lesson6;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину");
        int length = scanner.nextInt();
        System.out.println("Введите ширину");
        int width = scanner.nextInt();
        scanner.close();

        drawRectangle(length, width);
    }

    static void drawRectangle(int length, int width) {

        for (int i = 1; i <= width; i++) {
            for (int j = 1; j <= length; j++) {
                if (isDegree(i, j, length, width)) {
                    printRectangleElement(' ');
                } else if (isInsideSide(i, j, length, width)) {
                    System.out.print(" ");
                } else if (isHorisontalSide(i, width)) {
                    printRectangleElement('-');
                } else {
                    printRectangleElement('|');
                }
            }
            System.out.println();
        }
    }

    static boolean isDegree(int i, int j, int length, int width) {
        return (j == 1 || j == length) && (i == 1 || i == width);
    }

    static boolean isInsideSide(int i, int j, int length, int width) {
        return i != 1 && i != width && j != 1 && j != length;
    }

    static boolean isHorisontalSide(int i, int width) {
        return i == 1 || i == width;
    }

    static void printRectangleElement(char element) {
        System.out.print(element);
    }
}
