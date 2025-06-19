package Lesson7;

public class Task5 {
    public static void main(String[] args) {
        int[] primeNumbers = new int[10];

        fillArray(primeNumbers);
        printPrimeNumbersSum(primeNumbers);
    }

    static void fillArray(int[] primeNumbers) {
        fillArray(primeNumbers, 0, 2);
    }

    static void fillArray(int[] primeNumbers, int currentIndex, int currentNumber) {
        if (isArrayFilled(currentIndex, primeNumbers)) {
            return;
        }

        if (isPrime(currentNumber, 2)) {
            primeNumbers[currentIndex] = currentNumber;
            currentIndex++;
        }

        fillArray(primeNumbers, currentIndex, currentNumber + 1);
    }

    static boolean isArrayFilled(int currentIndex, int[] primeNumbers) {
        return currentIndex == primeNumbers.length;
    }

    static boolean isPrime(int checkedNumber, int divider) {
        if (divider == checkedNumber) {
            return true;
        }

        if (checkedNumber % divider == 0) {
            return false;
        }

        return isPrime(checkedNumber, divider + 1);
    }

    static void printPrimeNumbersSum(int[] primeNumbers) {
        System.out.println(sum(primeNumbers, 0));
    }

    static int sum(int[] primeNumbers, int currentIndex) {
        if (currentIndex == primeNumbers.length - 1) {
            return primeNumbers[primeNumbers.length - 1];
        }

        return primeNumbers[currentIndex] + sum(primeNumbers, currentIndex + 1);
    }
}
