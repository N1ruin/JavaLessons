package Lesson16.task1.interfaces.model;

public class Square implements EquilateralShape {
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
