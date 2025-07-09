package Lesson34.task2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {
    public static final String PATTERN = "dd.MM.yyyy HH:mm:ss";
    public static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern(PATTERN);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дату и время в формате dd.MM.yyyy HH:mm:ss");
        String dateTime = scanner.nextLine();
        scanner.close();

        LocalDateTime localDateTime = LocalDateTime.now().truncatedTo(ChronoUnit.SECONDS);
        LocalDateTime inputDateTime = LocalDateTime.parse(dateTime, FORMATTER);

        if (localDateTime.isAfter(inputDateTime)) {
            System.out.println("Текущая дата и время позже введенной");
        } else if (localDateTime.isBefore(inputDateTime)) {
            System.out.println("Текущая дата и время раньше введенной");
        } else {
            System.out.println("Текущая дата и время равны");
        }

    }
}
