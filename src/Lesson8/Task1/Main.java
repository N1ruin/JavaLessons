package Lesson8.Task1;

public class Main {
    public static void main(String[] args) {
        Counter evenNumbers = new Counter("Четные числа");
        Counter oddNumbers = new Counter("Нечетные числа");

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                evenNumbers.increment();
            } else {
                oddNumbers.increment();
            }
        }
        printResult(evenNumbers);
        printResult(oddNumbers);
    }

    public static void printResult(Counter counter) {
        System.out.printf("%s: %d \n", counter.name, counter.count);
    }
}
