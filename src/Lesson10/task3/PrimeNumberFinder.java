package Lesson10.task3;

public class PrimeNumberFinder {

    public int[] fillPrimeNumbersArray(int[] emptyArray) {
        for (int i = 0; i < emptyArray.length; i++) {
            if (i == 0) {
                emptyArray[i] = 2;
            } else {
                int addingValue = i == 1 ? 1 : 2;
                int number = emptyArray[i - 1] + addingValue;
                emptyArray[i] = findNextPrimeNumber(number, emptyArray, i);
            }
        }
        return emptyArray;
    }

    public int findNextPrimeNumber(int number, int[] primeNumbers, int currentIndex) {
        boolean isPrime = isPrime(number, primeNumbers, currentIndex);

        if (isPrime) {
            return number;
        }

        number += 2;

        return findNextPrimeNumber(number, primeNumbers, currentIndex);
    }

    public boolean isPrime(int number, int[] primeNumbers, int currentIndex) {
        int j = 0;
        boolean isPrime = true;

        while (isPrime && j < currentIndex && number / primeNumbers[j] > 1) {
            if (number % primeNumbers[j] == 0) {
                isPrime = false;
            } else {
                j++;
            }
        }
        return isPrime;
    }
}
