package Lesson7;

public class Task3 {
    public static void main(String[] args) {
        int factorial = calculateFactorial(10);
        System.out.println(factorial);
    }

    static int calculateFactorial(int num) {
        if (num <= 1) {
            return 1;
        }
        return num * calculateFactorial(num - 1);
    }
}
