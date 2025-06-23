package Lesson20.task2.model;

public abstract class EquilateralShape {
    protected int sideLength;
    public static final char HORIZONTAL_ELEMENT = '-';
    public static final char EMPTY_ELEMENT = ' ';

    protected EquilateralShape(int sideLength) {
        this.sideLength = sideLength;
    }

    public abstract void draw();

    protected String drawHorizontalLine() {
        String horizontalLine = "";

        for (int i = 0; i < sideLength; i++) {
            horizontalLine += HORIZONTAL_ELEMENT
            ;
        }

        return horizontalLine;
    }
}
