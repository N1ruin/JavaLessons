package Lesson14.task1.model;

public class EquilateralShape {
    protected int sideLength;
    public static final char HORIZONTAL_ELEMENT = '-';
    public static final char EMPTY_ELEMENT = ' ';


    protected EquilateralShape(int sideLength) {
        this.sideLength = sideLength;
    }

    public void draw() {
        System.out.println("Неизвестная фигура");
    }

    protected String drawHorizontalLine() {
        String horizontalLine = "";

        for (int i = 0; i < sideLength; i++) {
            horizontalLine += HORIZONTAL_ELEMENT
            ;
        }

        return horizontalLine;
    }
}
