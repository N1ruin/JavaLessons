package Lesson3.javaCorePractics;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        String firstName;
        String lastName;
        String fatherName;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя");
        firstName = scanner.nextLine();
        System.out.println("Введите фамилию");
        lastName = scanner.nextLine();
        System.out.println("Введите отчество");
        fatherName = scanner.nextLine();
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(fatherName);
        System.out.printf("%s %s %s", firstName, lastName, fatherName);
        scanner.close();
    }
}
