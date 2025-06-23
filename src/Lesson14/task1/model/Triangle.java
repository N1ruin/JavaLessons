package Lesson14.task1.model;

public class Triangle extends EquilateralShape {
    public static final char INCLINED_RIGHT_ELEMENT = '/';
    public static final char INCLINED_LEFT_ELEMENT = '\\';
    public static final char NEW_LINE_ELEMENT = '\n';

    public Triangle(int sideLength) {
        super(sideLength);
    }

    @Override
    public void draw() {
        String result = "";
        sideLength++;
        String emptyString = isEmpty();
        boolean flag = false;
        for (int i = 0; i < sideLength - 1; i++) {
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
}
