package Lesson42.task2.structure;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;

public class AvlTree<E> {
    private Node<E> root;
    private Comparator<E> comparator;

    public AvlTree() {
    }

    public AvlTree(Comparator<E> comparator) {
        this.comparator = comparator;
    }

    public void insert(E element) {
        root = insert(root, element);
    }

    private Node<E> insert(Node<E> node, E element) {
        if (node == null) {
            node = new Node<>(element);
            updateHeights(node);
            System.out.println("Вставлен элемент " + element);
            return node;
        } else if (compare(element, node.value) < 0) {
            System.out.println("Элемент будет вставлен в левое поддерево");
            node.left = insert(node.left, element);
        } else if (compare(element, node.value) > 0) {
            System.out.println("Элемент будет вставлен в правое поддерево");
            node.right = insert(node.right, element);
        } else {
            return node;
        }

        updateHeights(node);

        return checkBalance(node);
    }

    public void remove(E element) {
        root = remove(root, element);
    }

    private Node<E> remove(Node<E> node, E element) {
        if (node == null) {
            System.out.println("Дерево пустое");
            return null;
        } else if (compare(element, node.value) < 0) {
            System.out.println("Поиск элемента для удаления будет в левом поддереве");
            node.left = remove(node.left, element);
        } else if (compare(element, node.value) > 0) {
            System.out.println("Поиск элемента для удаления будет в правом поддереве");
            node.right = remove(node.right, element);
        } else {
            System.out.println("Элемент найден, производится удаление");
            if (node.left == null && node.right == null) {
                System.out.println("У элемента нет потомков");
                return null;
            } else if (node.left == null || node.right == null) {
                System.out.println("У элемента один потомок");
                return node.left == null ? node.right : node.left;
            } else {
                System.out.println("У элемента два потомка");
                Node<E> maxInLeft = findMaxValue(node.left);
                node.value = maxInLeft.value;
                System.out.println("Пошло удаление максимального значения");
                node.left = remove(maxInLeft, maxInLeft.value);
            }

        }

        updateHeights(node);
        return checkBalance(node);
    }

    private void updateHeights(Node<E> node) {
        if (node != null) {
            node.height = Math.max(getHeight(node.left), getHeight(node.right)) + 1;
        }
    }

    private int getHeight(Node<E> node) {
        return node == null ? 0 : node.height;
    }

    private Node<E> checkBalance(Node<E> node) {
        int balance = getBalance(node);
        int balanceRight = getBalance(node.right);
        int balanceLeft = getBalance(node.left);

        if (balance == -2 && balanceLeft == -1) {
            System.out.println("Дисбаланс в узле " + node.value);
            System.out.println("Балансировка правым поворотом вокруг узла " + node.value);
            return rightRotate(node);
        } else if (balance == 2 && balanceRight == 1) {
            System.out.println("Дисбаланс в узле " + node.value);
            System.out.println("Балансировка левым поворотом вокруг узла " + node.value);
            return leftRotate(node);
        } else if (balance == -2 && balanceLeft == 1) {
            System.out.println("Дисбаланс в узле " + node.value);
            System.out.println("Применяется большое правое вращение");
            System.out.println("Балансировка левым поворотом вокруг узла " + node.left.value);
            node.left = leftRotate(node.left);
            updateHeights(node.left);
            System.out.println("Балансировка правым поворотом вокруг узла " + node.value);
            return rightRotate(node);
        } else if (balance == 2 && getBalance(node.right) == -1) {
            System.out.println("Дисбаланс в узле " + node.value);
            System.out.println("Применяется большое правое вращение");
            System.out.println("Балансировка правым поворотом вокруг узла " + node.right.value);
            node.right = rightRotate(node.right);
            updateHeights(node.right);
            System.out.println("Балансировка левым поворотом вокруг узла " + node.value);
            return leftRotate(node);
        }
        return node;
    }

    private Node<E> rightRotate(Node<E> node) {
        Node<E> current = node;
        Node<E> leftRight = current.left.right;
        node = node.left;
        node.right = current;
        node.right.left = leftRight;

        updateHeights(node.left);
        updateHeights(node.right);

        return node;
    }

    private Node<E> leftRotate(Node<E> node) {
        Node<E> current = node;
        Node<E> rightLeft = current.right.left;
        node = node.right;
        node.left = current;
        node.left.right = rightLeft;

        updateHeights(node.left);
        updateHeights(node.right);

        return node;
    }

    private int getBalance(Node<E> node) {
        return node == null ? 0 : getHeight(node.right) - getHeight(node.left);
    }

    public E find(E value) {
        return find(root, value).value;
    }

    public Node<E> find(Node<E> node, E element) {
        if (node == null) {
            return null;
        }

        if (compare(element, root.value) < 0) {
            return find(node.left, element);
        } else if (compare(element, root.value) > 0) {
            return find(node.right, element);
        } else {
            return node;
        }
    }

    private Node<E> findMaxValue(Node<E> node) {
        while (node.right != null) {
            node = node.right;
        }
        return node;
    }

    public void printElementsWidth() {
        if (root == null) {
            System.out.println("Tree is empty");
            return;
        }

        Queue<Node<E>> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node<E> current = queue.poll();
            System.out.println(current.value + " height - " + getHeight(current));
            if (current.left != null) {
                queue.add(current.left);
            }
            if (current.right != null) {
                queue.add(current.right);
            }
        }
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

    private static class Node <E> {
        private E value;
        private Node<E> left;
        private Node<E> right;
        private int height;

        public Node(E value) {
            this.value = value;
        }
    }
}
