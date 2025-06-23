package Lesson20.task2;


import Lesson20.task2.exceptions.InputValidationException;
import Lesson20.task2.model.EquilateralShape;
import Lesson20.task2.model.Square;
import Lesson20.task2.model.Triangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int typeShape = inputTypeFigure(scanner);
        int sideLength = inputSideLength(scanner);

        scanner.close();

        EquilateralShape shape = createShape(typeShape, sideLength);
        shape.draw();
    }

    private static int inputTypeFigure(Scanner scanner) {
        System.out.println("Введите тип фигуры, 1 - квадрат, 2 - треугольник");

        int typeFigure = scanner.nextInt();

        if (typeFigure <= 0 || typeFigure > 2) {
            throw new InputValidationException("Incorrect figure type");
        }

        return typeFigure;
    }

    private static int inputSideLength(Scanner scanner) {
        System.out.println("Введите длину стороны");

        int sideLength = scanner.nextInt();

        if (sideLength <= 1) {
            throw new InputValidationException("Incorrect side length");
        }

        return sideLength;
    }

    private static EquilateralShape createShape(int type, int sideLength) {

        switch (type) {
            case 1: {
                return new Square(sideLength);
            }
            case 2: {
                return new Triangle(sideLength);
            }
            default:
                throw new InputValidationException("Incorrect input");
        }
    }

}
