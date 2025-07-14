package Lesson39.task2.structures;

import Lesson39.structures.SinglyLinkedList;

public class Stack<E> {
    SinglyLinkedList<E> linkedList = new SinglyLinkedList<>();

    public void push(E element) {
        linkedList.add(element);
    }

    public void pop() {
        linkedList.remove(linkedList.getTop());
    }

    public void print() {
        linkedList.print();
    }
}
