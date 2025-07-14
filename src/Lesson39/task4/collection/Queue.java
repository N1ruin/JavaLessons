package Lesson39.task4.collection;

import Lesson39.structures.DoubleLinkedList;

public class Queue<E> {
    DoubleLinkedList<E> list = new DoubleLinkedList<>();

    public void add(E element) {
        list.addFirst(element);
    }

    public E peek() {
        E value = list.getFirst();
        list.remove(value);
        return value;
    }

    public void print() {
        list.print();
    }
}
