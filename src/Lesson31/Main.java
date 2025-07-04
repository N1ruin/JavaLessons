package Lesson31;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println(parseBoolean());
        System.out.println(parseDouble());
        System.out.println(parseByte());
        System.out.println(parseChar());
        System.out.println(parseInt());
        System.out.println(parseFloat());
        System.out.println(parseLong());
        System.out.println(parseShort());
        System.out.println(parseString());
    }

    private static boolean parseBoolean() throws IOException {
        String input = readString();
        if (input.equalsIgnoreCase("true")) {
            return true;
        } else if (input.equalsIgnoreCase("false")) {
            return false;
        }
        throw new RuntimeException("Boolean cast error");
    }

    private static int parseInt() throws IOException {
        return Integer.parseInt(readString());
    }

    private static byte parseByte() throws IOException {
        return Byte.parseByte(readString());
    }

    private static short parseShort() throws IOException {
        return Short.parseShort(readString());
    }

    private static long parseLong() throws IOException {
        return Long.parseLong(readString());
    }

    private static float parseFloat() throws IOException {
        return Float.parseFloat(readString());
    }

    private static double parseDouble() throws IOException {
        return Double.parseDouble(readString());
    }

    private static char parseChar() throws IOException {
        String in = readString();
        if (in.length() == 1) {
            return in.charAt(0);
        }
        if (in.length() == 2 && in.charAt(1) == '\n') {
            return in.charAt(0);
        }
        throw new RuntimeException("Invalid char");
    }

    private static String parseString() throws IOException {
        return new String(System.in.readAllBytes());
    }

    private static String readString() throws IOException {
        StringBuilder result = new StringBuilder();

        char c;
        boolean isReadFinish = false;

        while (!isReadFinish) {
            c = (char) System.in.read();

            if (c == '\n') {
                isReadFinish = true;
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

}
