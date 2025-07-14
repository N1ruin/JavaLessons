package Lesson39.task1;

import Lesson39.structures.SinglyLinkedList;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList<Integer> stack = new SinglyLinkedList<>();
        for (int i = 0; i < 10; i++) {
            stack.add(i);
        }
        stack.print();
        stack.reverse();
        stack.print();

    }
}
