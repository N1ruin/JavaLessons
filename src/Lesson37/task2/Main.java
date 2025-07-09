package Lesson37.task2;

import Lesson37.task2.dataStructure.CustomCollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CustomCollection<Integer> collection = new CustomCollection<>();
        for (int i = 0; i < 11; i++) {
            collection.add(i);
            collection.printElements();
        }
        System.out.println(collection.contains(10));
        System.out.println(collection.size());
        System.out.println(collection.remove(5));
        System.out.println(collection.size());
        collection.printElements();
        System.out.println(collection.contains(5));
        System.out.println(collection.size());
        collection.retainAll(List.of(1, 2, 4));
        collection.printElements();
        System.out.println(collection.size());
    }
}
