package Lesson17.task3;

import Lesson17.task3.model.EquilateralShape;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите тип фигуры, 1 - квадрат, 2 - треуголник");

        int typeFigure = scanner.nextInt();

        System.out.println("Введите длину стороны");
        int sideLength = scanner.nextInt();

        scanner.close();

        EquilateralShape equilateralShape;

        switch (typeFigure) {
            case 1: {
                equilateralShape = EquilateralShape.SQUARE;
                break;
            }
            case 2: {
                equilateralShape = EquilateralShape.TRIANGLE;
                break;
            }
            default: {
                System.out.println("Неизвестная фигура");
                return;
            }
        }
        equilateralShape.draw(sideLength);
    }
}
