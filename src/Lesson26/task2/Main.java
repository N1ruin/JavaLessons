package Lesson26.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку");

        String string = scanner.nextLine();
        scanner.close();

        int uniqueWordsQuantity = calculateUniqueWordsQuantity(string);
        System.out.printf("Unique words quantity %d", uniqueWordsQuantity);
    }

    private static int calculateUniqueWordsQuantity(String line) {
        if (line.isEmpty()) {
            return 0;
        }
        String[] words = line.trim().toLowerCase().split(" ");
        String[] uniqueWords = new String[words.length];

        for (String word : words) {
            if (isUniqueWord(word, uniqueWords)) {
                addWordToArray(uniqueWords, word);
            }
        }
        return calculateUniqueWords(uniqueWords);
    }

    private static boolean isUniqueWord(String word, String[] uniqueWords) {
        for (String uniqueWord : uniqueWords) {
            if (uniqueWord == null) {
                continue;
            }
            if (uniqueWord.equals(word)) {
                return false;
            }
        }
        return true;
    }

    private static void addWordToArray(String[] array, String word) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                array[i] = word;
                return;
            }
        }
    }

    private static int calculateUniqueWords(String[] array) {
        int result = 0;
        for (String s : array) {
            if (s != null) {
                result++;
            }
        }
        return result;
    }
}
