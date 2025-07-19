package Lesson41.task2;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку");

        String string = scanner.nextLine();
        scanner.close();
        Set<String> wordsSet = new HashSet<>(List.of(string.toLowerCase().split(" ")));
        int uniqueWordsQuantity = wordsSet.size();
        System.out.printf("Unique words quantity %d", uniqueWordsQuantity);
    }
}
