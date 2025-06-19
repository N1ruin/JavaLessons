package Lesson6;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = scanner.nextLine();

        scanner.close();
        displayResponse(s);

    }

    static void displayResponse(String message) {
        switch (message) {
            case "Hi":
                displayMessage("Hello");
                break;

            case "Bye":
                displayMessage("Good bye");
                break;

            case "How are you":
                displayMessage("How are your doing");
                break;

            default:
                displayMessage("Unknown message");
        }
    }

    static void displayMessage(String message) {
        System.out.println(message);
    }
}
