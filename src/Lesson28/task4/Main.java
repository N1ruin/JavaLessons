package Lesson28.task4;

import Lesson28.task4.dataStructure.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> integerStack = new Stack<>(1);
        integerStack.printElements();

        System.out.println(integerStack.getTopElement());
        integerStack.add(2);
        integerStack.printElements();
        System.out.println(integerStack.getTopElement());

        integerStack.add(3);
        integerStack.printElements();
        System.out.println(integerStack.getTopElement());

        integerStack.add(4);
        integerStack.printElements();
        System.out.println(integerStack.getTopElement());

        integerStack.add(5);
        integerStack.printElements();
        System.out.println(integerStack.getTopElement());

        integerStack.add(6);
        integerStack.printElements();
        System.out.println(integerStack.getTopElement());

        integerStack.add(7);
        integerStack.printElements();
        System.out.println(integerStack.getTopElement());

        System.out.println("ss");
        integerStack.remove(1);
        System.out.println(integerStack.getTopElement());
        integerStack.printElements();
        System.out.println(integerStack.getTopElement());

        integerStack.remove(5);
        integerStack.printElements();
        System.out.println(integerStack.getTopElement());

        System.out.println(integerStack.getSize());
        System.out.println(integerStack.getTopElement());

        System.out.println(integerStack.find(2));
        System.out.println(integerStack.getTopElement());

        integerStack.add(null);
        integerStack.remove(7);
//        integerStack.remove(100);
    }
}
