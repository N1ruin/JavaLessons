package Lesson10.task3;

import java.util.Scanner;

public class Main {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Сумму скольки первых простых чисел нужно найти?");
        int[] array = new int[SCANNER.nextInt()];
        SCANNER.close();

        PrimeNumberFinder primeNumberFinder = new PrimeNumberFinder();
        int[] fillArray = primeNumberFinder.fillPrimeNumbersArray(array);

        System.out.println(sum(fillArray));
    }

    static int sum(int[] numbers) {
        return sum(numbers, 0);
    }

    static int sum(int[] numbers, int i) {
        if (i == numbers.length - 1) {
            return numbers[i];
        }

        return numbers[i] + sum(numbers, i + 1);
    }

    public static class Counter {
        private final String name;
        private String units;
        private final int count;


        public Counter(String name, String units, int count) {
            this.name = name;
            this.units = units;
            this.count = count;
        }

        public Counter(String name, String units) {
            this(name, units, 0);
        }

        public String getName() {
            return name;
        }

        public String getUnits() {
            return units;
        }

        public int getCount() {
            return count;
        }
    }
}

