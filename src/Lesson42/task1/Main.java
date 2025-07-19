package Lesson42.task1;

import Lesson42.task1.structure.BinaryTree;

public class Main {
    public static void main(String[] args) {
        BinaryTree<Integer> binaryTree = new BinaryTree<>();

        binaryTree.add(1);
        binaryTree.add(2);
        binaryTree.add(3);
        binaryTree.add(4);
        binaryTree.add(5);
        binaryTree.add(6);
        binaryTree.add(7);
        binaryTree.printElementsHeigth();
        System.out.println();
        binaryTree.printElementsHeigth();
        System.out.println();
        binaryTree.printIntegerlementsWidth();

    }
}
