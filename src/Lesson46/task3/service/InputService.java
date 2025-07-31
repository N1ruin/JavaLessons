package Lesson46.task3.service;

import java.util.Scanner;

public class InputService {
    private final Scanner scanner;

    public InputService() {
        scanner = new Scanner(System.in);
    }

    public String inputString() {
        return scanner.nextLine();
    }

    public void close() {
        scanner.close();
    }
}
