package Lesson25.task1.innerClasses;

import Lesson25.task1.innerClasses.model.EquilateralShape;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите тип фигуры, 1 - квадрат, 2 - треуголник");

        int typeFigure = scanner.nextInt();

        System.out.println("Введите длину стороны");
        int sideLength = scanner.nextInt();

        scanner.close();
        Main main = new Main();
        EquilateralShape equilateralShape;

        switch (typeFigure) {
            case 1: {
                equilateralShape = main.new Square(sideLength);
                break;
            }
            case 2: {
                equilateralShape = main.new Triangle(sideLength);
                break;
            }
            default: {
                System.out.println("Неизвестная фигура");
                return;
            }
        }
        equilateralShape.draw();
    }

    private class Triangle implements EquilateralShape {
        public static final char INCLINED_RIGHT_ELEMENT = '/';
        public static final char INCLINED_LEFT_ELEMENT = '\\';
        public static final char NEW_LINE_ELEMENT = '\n';
        private int sideLength;

        public Triangle(int sideLength) {
            this.sideLength = sideLength;
        }

        @Override
        public void draw() {

            String result = "";
            sideLength++;
            String emptyString = isEmpty();
            for (
                    int i = 0;
                    i < sideLength - 1; i++) {
                String currentLine = "";
                boolean leftFlag = false;
                boolean rightFlag = false;

                for (int j = 0; j < sideLength + 1; j++) {
                    if (i == 0) {
                        currentLine += EMPTY_ELEMENT;
                    } else if (j == (sideLength / 2 - i + 1)) {
                        currentLine += INCLINED_RIGHT_ELEMENT;
                        rightFlag = true;
                    } else if (j == (sideLength / 2) + i) {
                        currentLine += INCLINED_LEFT_ELEMENT;
                        leftFlag = true;
                    } else {
                        currentLine += EMPTY_ELEMENT;
                    }
                }

                if (!currentLine.equals(emptyString)) {
                    if (rightFlag && !leftFlag) {
                        currentLine += INCLINED_LEFT_ELEMENT;
                    }
                    currentLine += NEW_LINE_ELEMENT;
                    result += currentLine;
                }
            }

            sideLength--;

            result += HORIZONTAL_ELEMENT + drawHorizontalLine() + HORIZONTAL_ELEMENT;
            if (sideLength % 2 != 0) {
                result += HORIZONTAL_ELEMENT;
            }
            System.out.println(result);
        }

        private String isEmpty() {
            String result = "";
            for (int i = 0; i < sideLength + 1; i++) {
                result += EMPTY_ELEMENT;
            }
            return result;
        }

        private String drawHorizontalLine() {
            String horizontalLine = "";

            for (int i = 0; i < sideLength; i++) {
                horizontalLine += HORIZONTAL_ELEMENT
                ;
            }

            return horizontalLine;
        }
    }

    private class Square implements EquilateralShape {
        private int sideLength;
        public static final char VERTICAL_ELEMENT = '|';

        public Square(int sideLength) {
            this.sideLength = sideLength;
        }

        @Override
        public void draw() {
            System.out.println(drawHorizontalLine());

            for (int i = 0; i < sideLength - 1; i++) {
                System.out.println(drawVerticalLine());
            }
            System.out.println(drawHorizontalLine());
        }


        private String drawVerticalLine() {
            String verticalLine = "";

            for (int i = 0; i < sideLength; i++) {
                if (i == 0 || i == sideLength - 1) {
                    verticalLine += VERTICAL_ELEMENT;
                } else {
                    verticalLine += EMPTY_ELEMENT;
                }
            }

            return verticalLine;
        }

        private String drawHorizontalLine() {
            String horizontalLine = "";

            for (int i = 0; i < sideLength; i++) {
                horizontalLine += HORIZONTAL_ELEMENT
                ;
            }

            return horizontalLine;
        }
    }
}
