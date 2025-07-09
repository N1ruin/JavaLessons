package Lesson34.task3;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static final String PATTERN = "dd.MM.yyyy HH:mm:ss";
    public static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern(PATTERN);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите дату и время в формате dd.MM.yyyy HH:mm:ss");
        LocalDateTime localDateTimeOne = LocalDateTime.parse(scanner.nextLine(), FORMATTER);

        System.out.println("Введите дату и время в формате dd.MM.yyyy HH:mm:ss");
        LocalDateTime localDateTimeTwo = LocalDateTime.parse(scanner.nextLine(), FORMATTER);

        scanner.close();

        System.out.println(getTimeDifference(localDateTimeOne, localDateTimeTwo));
        System.out.println(getTimeDifferenceSummary(localDateTimeOne, localDateTimeTwo));
    }

    private static String getTimeDifference(LocalDateTime one, LocalDateTime two) {
        long epochSecondOne = one.toEpochSecond(ZoneOffset.UTC);
        long epochSecondTwo = two.toEpochSecond(ZoneOffset.UTC);

        int yearsDifference = Math.abs(one.getYear() - two.getYear());
        long secondsDifference = Math.abs(epochSecondOne - epochSecondTwo);
        long minutesDifference = secondsDifference / 60;
        long hoursDifference = minutesDifference / 60;
        long daysDifference = hoursDifference / 24;
        int monthsDifference = yearsDifference * 12 + Math.abs(one.getMonthValue() - two.getMonthValue());

        return "years: %d\nmonths: %d\ndays: %d\nhours: %d\nminutes: %d\nseconds: %d".
                formatted(yearsDifference, monthsDifference, daysDifference, hoursDifference, minutesDifference, secondsDifference);
    }

    private static String getTimeDifferenceSummary(LocalDateTime one, LocalDateTime two) {
        int years = Math.abs(one.getYear() - two.getYear());
        int months = Math.abs(one.getMonthValue() - two.getMonthValue());
        int days = Math.abs(one.getDayOfMonth() - two.getDayOfMonth());
        int hours = Math.abs(one.getHour() - two.getHour());
        int minutes = Math.abs(one.getMinute() - two.getMinute());
        int seconds = Math.abs(one.getSecond() - two.getSecond());

        return "Summary: years: %d months: %d days: %d hours: %d minutes: %d seconds: %d"
                .formatted(years, months, days, hours, minutes, seconds);
    }
}
