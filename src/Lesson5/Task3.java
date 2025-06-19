package Lesson5;

public class Task3 {
    public static void main(String[] args) {
        int[] primeNumbers = new int[10];
        int currentIndex = 0;
        int currentNumber = 2;

        while (currentIndex != primeNumbers.length) {
            boolean prime = true;
            int divider = 2;
            while (divider < currentNumber) {
                if (currentNumber % divider == 0) {
                    prime = false;
                    break;
                }
                divider++;
            }
            if (prime) {
                primeNumbers[currentIndex] = currentNumber;
                currentIndex++;
            }
            currentNumber++;
        }
        int primeNumbersSum = 0;
        for (int primeNumber : primeNumbers) {
            primeNumbersSum += primeNumber;
        }

        System.out.println(primeNumbersSum);
    }
}
