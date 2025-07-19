package Lesson42.task1.structure;

import java.util.*;

public class BinaryTree<E> {
    private Node<E> root;
    private final Comparator<E> comparator;

    public BinaryTree() {
        this.comparator = null;
    }

    public BinaryTree(Comparator<E> comparator) {
        this.comparator = comparator;
    }

    public void add(E element) {
        root = add(root, element);
        balance();
    }

    private Node<E> add(Node<E> root, E element) {
        if (root == null) {
            return new Node<>(element);
        } else if (compare(element, root.value) < 0) {
            root.left = add(root.left, element);
        } else {
            root.right = add(root.right, element);
        }
        return root;
    }

    private int compare(E a, E b) {
        if (comparator != null) {
            return comparator.compare(a, b);
        } else {
            if (!(a instanceof Comparable<?>)) {
                throw new RuntimeException("Class " + a.getClass() + " not implements Comparable");
            }
            Comparable<E> comparable = (Comparable<E>) a;
            return comparable.compareTo(b);
        }
    }

    public void remove(E element) {
        if (root == null) {
            throw new RuntimeException("Tree is empty");
        }
        root = remove(root, element);
        balance();
    }

    private Node<E> remove(Node<E> node, E element) {
        if (node == null) {
            System.out.println("Element not found");
            return null;
        }
        if (compare(element, node.value) > 0) {
            node.right = remove(node.right, element);
        } else if (compare(element, node.value) < 0) {
            node.left = remove(node.left, element);
        } else {

            if (node.left == null && node.right == null) {
                return null;
            }

            if (node.left == null || node.right == null) {
                return (node.left == null ? node.right : node.left);
            }

            Node<E> maxNode = findMaxElement(node.left);
            node.value = maxNode.value;
            node.left = remove(node.left, node.value);
        }
        return node;
    }

    public Node<E> findMaxElement(Node<E> node) {
        while (node.right != null) {
            node = node.right;
        }
        return node;
    }

    public void printElementsHeigth() {
        printIntegerlementsHeight(root);
    }

    private void printIntegerlementsHeight(Node<E> node) {
        if (node == null) {
            return;
        }
        System.out.println(node.value);
        printIntegerlementsHeight(node.left);
        printIntegerlementsHeight(node.right);
    }

    public void printIntegerlementsWidth() {
        if (root == null) {
            System.out.println("Tree is empty");
            return;
        }
        Queue<Node<E>> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node<E> current = queue.poll();
            System.out.println(current.value);
            if (current.left != null) {
                queue.add(current.left);
            }
            if (current.right != null) {
                queue.add(current.right);
            }
        }
    }

    public void balance() {
        List<E> values = new ArrayList<>();
        copyElements(root, values);

        root = addValuesOf(values, 0, values.size()-1);
    }

    private void copyElements(Node<E> root, List<E> list) {
        if (root == null) {
            return;
        }
        copyElements(root.left, list);
        list.add(root.value);
        copyElements(root.right, list);
    }

    private Node<E> addValuesOf(List<E> values, int start, int end) {
        if (start > end) {
            return null;
        }
        int middleIndex = start + (end - start) / 2;

        Node<E> root = new Node<>(values.get(middleIndex));
        root.left = addValuesOf(values, start, middleIndex - 1);
        root.right = addValuesOf(values, middleIndex + 1, end);

        return root;
    }

    private static class Node<E> {
        private Node<E> left;
        private Node<E> right;
        private E value;

        public Node(E value) {
            this.value = value;
        }
    }
}

