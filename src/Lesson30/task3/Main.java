package Lesson30.task3;

import Lesson30.task3.exception.InputStringValidationException;

import java.util.Scanner;

public class Main {
    public static final String SEPARATOR_REGEX = "[\\t ]+";
    public static final String SYMBOLS_REGEX = "[a-zA-Z-\\t ]+";
    public static final String WORD_REGEX = "^[A-Za-z][A-Za-z-]+[A-Za-z]$";
    public static final String SIMPLE_WORD_REGEX = "^[A-Za-z]+$";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку");

        String string = scanner.nextLine();
        scanner.close();

        if (!string.matches(SYMBOLS_REGEX)) {
            throw new InputStringValidationException();
        }

        int uniqueWordsQuantity = calculateUniqueWordsQuantity(string);
        System.out.printf("Unique words quantity %d", uniqueWordsQuantity);
    }

    private static int calculateUniqueWordsQuantity(String line) {
        if (line.isEmpty()) {
            return 0;
        }
        String[] words = line.trim().toLowerCase().split(SEPARATOR_REGEX);

        String[] uniqueWords = new String[words.length];

        validateWords(words);

        for (String word : words) {
            if (isUniqueWord(word, uniqueWords)) {
                addWordToArray(uniqueWords, word);
            }
        }
        return calculateUniqueWords(uniqueWords);
    }

    private static void validateWords(String[] words) {
        for (String word : words) {
            if (word.contains("-")) {
                for (String s : word.split("-")) {
                    validateSimpleWord(s);
                }
            } else {
                validateSimpleWord(word);
            }
        }
    }

    private static void validateSimpleWord(String word) {
        if (!word.matches(SIMPLE_WORD_REGEX)) {
            throw new InputStringValidationException();
        }
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
