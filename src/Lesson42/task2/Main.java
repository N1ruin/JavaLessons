package Lesson42.task2;

import Lesson42.task2.structure.AvlTree;

public class Main {
    private static final AvlTree<Integer> avlTree = new AvlTree<>();

    public static void main(String[] args) {
        avlTree.insert(100);
        avlTree.printElementsWidth();
        System.out.println();

        avlTree.insert(155);
        avlTree.printElementsWidth();
        System.out.println();

        avlTree.insert(130);
        avlTree.printElementsWidth();
        System.out.println();


        avlTree.insert(156);
        avlTree.printElementsWidth();
        System.out.println();


        avlTree.insert(158);
        avlTree.printElementsWidth();
        System.out.println();


        avlTree.insert(157);
        avlTree.printElementsWidth();
        System.out.println();

        avlTree.remove(100);
        avlTree.printElementsWidth();
        System.out.println();

        avlTree.remove(155);
        avlTree.printElementsWidth();
        System.out.println();

        avlTree.remove(130);
        avlTree.printElementsWidth();
        System.out.println();
    }

}
