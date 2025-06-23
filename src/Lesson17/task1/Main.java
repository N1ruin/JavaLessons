package Lesson17.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сообщение");
        Message message = Message.findResponse(scanner.nextLine());

        scanner.close();

        System.out.println(message.getResponse());
    }
}
