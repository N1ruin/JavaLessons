package Lesson21.model;

import java.util.Objects;

public final class CarIdentifier implements Comparable<CarIdentifier> {
    private final String vinNumber;
    private final int year;

    public CarIdentifier(String vinNumber, int year) {
        this.vinNumber = vinNumber;
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public String getVinNumber() {
        return vinNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        CarIdentifier that = (CarIdentifier) o;
        return year == that.year && Objects.equals(vinNumber, that.vinNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vinNumber, year);
    }

    @Override
    public int compareTo(CarIdentifier o) {
        if (vinNumber.compareTo(o.vinNumber) > 0) {
            return 1;
        } else if (vinNumber.compareTo(o.vinNumber) < 0) {
            return -1;
        } else {
            return year - o.getYear();
        }
    }
}
