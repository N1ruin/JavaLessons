package Lesson39.task4;

import Lesson39.task4.collection.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();
        for (int i = 0; i < 10; i++) {
            queue.add(i);
        }
        queue.print();
        System.out.println(queue.peek());
        queue.print();
        for (int i = 0; i < 10; i++) {
            System.out.println(queue.peek());
        }
        queue.print();
    }
}
