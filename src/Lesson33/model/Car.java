package Lesson33.model;

import java.util.Objects;

public class Car {
    private String number;
    private final String vinNumber;
    private final int year;
    private String color;
    private int hash;

    public Car(String number, String vinNumber, int year, String color) {
        this.number = number;
        this.vinNumber = vinNumber;
        this.year = year;
        this.color = color;
        this.hash = hashCode();
    }

    public String getNumber() {
        return number;
    }

    public String getVinNumber() {
        return vinNumber;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return year == car.year && Objects.equals(vinNumber, car.vinNumber);
    }

    @Override
    public int hashCode() {
        if (hash == 0) {
            hash = vinNumber.hashCode();
            hash += 31 * year;
        }
        return hash;
    }

    @Override
    public String toString() {
        return "Car{" +
                "number='" + number + '\'' +
                ", vinNumber='" + vinNumber + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                '}';
    }
}
