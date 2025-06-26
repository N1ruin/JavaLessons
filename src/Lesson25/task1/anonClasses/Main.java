package Lesson25.task1.anonClasses;

import Lesson25.task1.anonClasses.model.EquilateralShape;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите тип фигуры, 1 - квадрат, 2 - треуголник");

        int typeFigure = scanner.nextInt();

        System.out.println("Введите длину стороны");
        final int sideLength = scanner.nextInt();

        scanner.close();

        EquilateralShape equilateralShape;

        switch (typeFigure) {
            case 1: {
                equilateralShape = new EquilateralShape() {

                    public static final char VERTICAL_ELEMENT = '|';

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
                };
                break;
            }
            case 2: {
                equilateralShape = new EquilateralShape() {
                    public static final char INCLINED_RIGHT_ELEMENT = '/';
                    public static final char INCLINED_LEFT_ELEMENT = '\\';
                    public static final char NEW_LINE_ELEMENT = '\n';
                    private int sideLengthLocal = sideLength;

                    @Override
                    public void draw() {

                        String result = "";
                        sideLengthLocal++;
                        String emptyString = isEmpty();
                        for (int i = 0; i < sideLengthLocal - 1; i++) {
                            String currentLine = "";
                            boolean leftFlag = false;
                            boolean rightFlag = false;

                            for (int j = 0; j < sideLengthLocal + 1; j++) {
                                if (i == 0) {
                                    currentLine += EMPTY_ELEMENT;
                                } else if (j == (sideLengthLocal / 2 - i + 1)) {
                                    currentLine += INCLINED_RIGHT_ELEMENT;
                                    rightFlag = true;
                                } else if (j == (sideLengthLocal / 2) + i) {
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

                        sideLengthLocal--;

                        result += HORIZONTAL_ELEMENT + drawHorizontalLine() + HORIZONTAL_ELEMENT;
                        if (sideLength % 2 != 0) {
                            result += HORIZONTAL_ELEMENT;
                        }
                        System.out.println(result);
                    }

                    private String isEmpty() {
                        String result = "";
                        for (int i = 0; i < sideLengthLocal + 1; i++) {
                            result += EMPTY_ELEMENT;
                        }
                        return result;
                    }

                    private String drawHorizontalLine() {
                        String horizontalLine = "";

                        for (int i = 0; i < sideLengthLocal; i++) {
                            horizontalLine += HORIZONTAL_ELEMENT
                            ;
                        }

                        return horizontalLine;
                    }
                };
                break;
            }
            default: {
                System.out.println("Неизвестная фигура");
                return;
            }
        }
        equilateralShape.draw();
    }

}
