package Lesson17.task3.model;

public enum EquilateralShape {
    SQUARE {
        public static final char VERTICAL_ELEMENT = '|';

        public void draw(int sideLength) {
            System.out.println(drawHorizontalLine(sideLength));

            for (int i = 0; i < sideLength - 1; i++) {
                System.out.println(drawVerticalLine(sideLength));
            }
            System.out.println(drawHorizontalLine(sideLength));
        }

        private String drawVerticalLine(int sideLength) {
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
    },
    TRIANGLE {
        public static final char INCLINED_RIGHT_ELEMENT = '/';
        public static final char INCLINED_LEFT_ELEMENT = '\\';
        public static final char NEW_LINE_ELEMENT = '\n';

        public void draw(int sideLength) {
            String result = "";
            sideLength++;
            String emptyString = isEmpty(sideLength);
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

            result += HORIZONTAL_ELEMENT + drawHorizontalLine(sideLength) + HORIZONTAL_ELEMENT;
            if (sideLength % 2 != 0) {
                result += HORIZONTAL_ELEMENT;
            }
            System.out.println(result);
        }

        private String isEmpty(int sideLength) {
            String result = "";
            for (int i = 0; i < sideLength + 1; i++) {
                result += EMPTY_ELEMENT;
            }
            return result;
        }
    };

    public static final char HORIZONTAL_ELEMENT = '-';
    public static final char EMPTY_ELEMENT = ' ';

    public abstract void draw(int sideLength);

    private static String drawHorizontalLine(int sideLength) {
        String horizontalLine = "";

        for (int i = 0; i < sideLength; i++) {
            horizontalLine += HORIZONTAL_ELEMENT;
        }

        return horizontalLine;
    }
}
