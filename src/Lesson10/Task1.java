package Lesson10;

import java.util.Scanner;

public class Task1 {
    public static final char NEW_LINE_UNIT = '\n';
    public static final String HORIZONTAL_UNIT = "";
    public static final String VERTICAL_UNIT = "|";
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int length = requireInt("Enter rectangle's length: ");
        int width = requireInt("Enter rectangle's length: ");

        SCANNER.close();

        String horizontalLine = createHorizontalLine(length);
        String verticalLines = createVerticalLines(length, width);

        printRectangle(horizontalLine, verticalLines);
    }

    static int requireInt(String require) {
        System.out.println(require);
        return SCANNER.nextInt();
    }

    static void printRectangle(String horizontalLine, String verticalLines) {
        System.out.println(horizontalLine + verticalLines + horizontalLine);
    }

    static String createHorizontalLine(int length) {
        String horizontalLine = " ";

        for (int i = 0; i < length; i++) {
            horizontalLine += HORIZONTAL_UNIT;
        }

        horizontalLine += " " + NEW_LINE_UNIT;

        return horizontalLine;
    }

    static String createVerticalLines(int length, int width) {
        String verticalLinesUnit = getVerticalLinesUnit(length);

        String verticalLines = "";

        for (int i = 0; i < width; i++) {
            verticalLines += verticalLinesUnit;
        }

        return verticalLines;
    }

    static String getVerticalLinesUnit(int length) {
        String verticalLinesUnit = VERTICAL_UNIT;

        for (int i = 0; i < length; i++) {
            verticalLinesUnit += " ";
        }

        verticalLinesUnit += VERTICAL_UNIT + NEW_LINE_UNIT;
        return verticalLinesUnit;
    }
}
