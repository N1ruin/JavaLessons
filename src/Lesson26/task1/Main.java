package Lesson26.task1;

import java.util.Scanner;

public class Main {
    public static final char EMPTY_ELEMENT = ' ';
    public static final char HORISONTAL_ELEMENT = '-';
    public static final char VERTICAL_ELEMENT = '|';
    public static final char NEW_LINE_ELEMENT = '\n';

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
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= width; i++) {
            for (int j = 1; j <= length; j++) {
                if (isDegree(i, j, length, width)) {
                    result.append(EMPTY_ELEMENT);
                } else if (isInsideSide(i, j, length, width)) {
                    result.append(EMPTY_ELEMENT);
                } else if (isHorisontalSide(i, width)) {
                    result.append(HORISONTAL_ELEMENT);
                } else {
                    result.append(VERTICAL_ELEMENT);
                }
            }
            result.append(NEW_LINE_ELEMENT);
        }
        System.out.println(result);
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


}
