package Lesson39.task2;

import Lesson39.task2.structures.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }
        stack.print();
        stack.pop();
        stack.pop();
        stack.print();
        stack.pop();
        stack.pop();
        stack.print();

        stack.pop();
        stack.pop();
        stack.print();

        stack.pop();
        stack.print();
        stack.pop();
        stack.pop();
        stack.print();
        stack.pop();
        stack.pop();
    }
}
