package Lesson38.model;

public class Car implements Comparable<Car> {
    private String color;
    private String number;
    private final CarIdentifier carIdentifier;

    public Car(String vinNumber, int year, String color, String number) {
        this.carIdentifier = new CarIdentifier(vinNumber, year);
        this.color = color;
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public CarIdentifier getCarIdentifier() {
        return carIdentifier;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", number='" + number + '\'' +
                ", carIdentifier=" + carIdentifier +
                '}';
    }

    @Override
    public int compareTo(Car o) {
        return carIdentifier.compareTo(o.carIdentifier);
    }
}
