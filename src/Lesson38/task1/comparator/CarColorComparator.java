package Lesson38.task1.comparator;

import Lesson38.model.Car;

import java.util.Comparator;

public class CarColorComparator implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return o1.getColor().compareTo(o2.getColor());
    }
}
