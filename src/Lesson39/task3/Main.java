package Lesson39.task3;

import Lesson39.structures.DoubleLinkedList;

public class Main {
    public static void main(String[] args) {
        DoubleLinkedList<Integer> linkedList = new DoubleLinkedList<>();
        for (int i = 0; i < 5; i++) {
            linkedList.addLast(i);
        }
        linkedList.print();
        linkedList.printTest();
        linkedList.reverse();
        System.out.print("REVERSED :");
        linkedList.print();
        linkedList.print();
        linkedList.printTest();
    }
}
