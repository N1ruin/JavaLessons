package Lesson16.task2;

import Lesson16.task2.model.GoodByeMessage;
import Lesson16.task2.model.HelloMessage;
import Lesson16.task2.model.HowAreYourDoingMessage;
import Lesson16.task2.model.Message;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку");
        String line = scanner.nextLine();
        scanner.close();
        Message message;
        switch (line) {
            case "Hi":
                message = new HelloMessage();
                message.send();
                break;
            case "Bye":
                message = new GoodByeMessage();
                message.send();
                break;
            case "How are you":
                message = new HowAreYourDoingMessage();
                message.send();
                break;
            default:
                System.out.println("Unknown message");
        }
    }
}
