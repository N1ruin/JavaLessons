package Lesson34.task1;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static final String PATTERN = "dd.MM.yyyy HH:mm:ss";
    public static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern(PATTERN);

    public static void main(String[] args) {
        System.out.println(getLocalDateTimeOf("20.12.2022 20:16:00"));
        System.out.println(FORMATTER.format(getLocalDateTimeOf("20.12.2022 20:16:00")));
    }

    private static LocalDateTime getLocalDateTimeOf(String date) {
        return LocalDateTime.parse(date, FORMATTER);
    }
}
