package Lesson19.model;

import java.util.Objects;

public class Car {
    private String color;
    private final String VinNumber;
    private String number;
    private final int year;

    public Car(String vinNumber, int year, String color, String number) {
        this.VinNumber = vinNumber;
        this.year = year;
        this.color = color;
        this.number = number;
    }

    public String  getNumber() {
        return number;
    }

    public String getColor() {
        return color;
    }

    public String getVinNumber() {
        return VinNumber;
    }

    public int getYear() {
        return year;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(VinNumber, car.VinNumber) && Objects.equals(number, car.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(VinNumber, number);
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", VinNumber='" + VinNumber + '\'' +
                ", number='" + number + '\'' +
                ", year=" + year +
                '}';
    }
}
