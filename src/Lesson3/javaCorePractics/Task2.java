package Lesson3.javaCorePractics;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку");
        String line = scanner.nextLine();
        scanner.close();
        switch (line) {
            case "Hi":
                System.out.println("Hello");
                break;
            case "Bye":
                System.out.println("Good bye");
                break;
            case "How are you":
                System.out.println("How are doing");
                break;
            default:
                System.out.println("Unknown message");
        }

        //if-else

        if(line.equals("Hi")) {
            System.out.println("Hello");
        } else if (line.equals("Bye")) {
            System.out.println("Good bye");
        } else if(line.equals("How are you")) {
            System.out.println("How are doing");
        } else {
            System.out.println("Unknown message");
        }
    }
}
