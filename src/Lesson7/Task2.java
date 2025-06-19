package Lesson7;

public class Task2 {
    public static void main(String[] args) {

    }

    static byte sum(byte... nums) {
        byte sum = 0;

        for (byte num : nums) {
            sum += num;
        }
        if (sum > 127 || sum < -128) {
            System.out.println("Произошла потеря данных");
        }
        return sum;
    }

    static short sum(short... nums) {
        short sum = 0;

        for (short num : nums) {
            sum += num;
        }
        if (sum > 32767 || sum < -32768) {
            System.out.println("Произошла потеря данных");
        }
        return sum;
    }

    static int sum(int... nums) {
        byte sum = 0;

        for (int num : nums) {
            sum += num;
        }
        if (sum > Integer.MAX_VALUE || sum < Integer.MIN_VALUE) {
            System.out.println("Произошла потеря данных");
        }
        return sum;
    }

    static long sum(long... nums) {
        long sum = 0L;

        for (long num : nums) {
            sum += num;
        }

        return sum;
    }

    static boolean sum(boolean... booleans) {
        boolean result = true;
        for (boolean aBoolean : booleans) {
            result &= aBoolean;
        }
        return result;
    }

    static String sum(char... chars) {
        String result = "";
        for (char aChar : chars) {
            result += aChar;
        }
        return result;
    }
}
