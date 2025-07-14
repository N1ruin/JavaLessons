package Lesson39.structures;

public class SinglyLinkedList<E> {
    private Node<E> top;
    private int depth;

    public void add(E element) {
        if (top == null) {
            top = new Node<>(element, null);
        } else {
            top = new Node<>(element, top);
        }
        depth++;
    }

    public void remove(E element) {
        if (depth == 0) {
            throw new RuntimeException("Linked list is empty");
        }
        if (top.value.equals(element)) {
            top = top.next;
            depth--;
            return;
        }

        Node<E> current = top.next;
        Node<E> previous = top;
        while (current.next != null) {
            if (current.value.equals(element)) {
                previous.next = current.next.next;
                return;
            }
            previous = current;
            current = current.next;
        }
    }

    public void removeElementWhenHashCodeIsEven() {
        if (depth == 0) {
            throw new RuntimeException("list is empty");
        }

        if (depth == 1 && isHashCodeEven(top.value)) {
            top = null;
            return;
        }

        Node<E> current = top;
        Node<E> second;

        while (current.next != null) {
            second = current;
            current = current.next;

            if (isHashCodeEven(current.value)) {
                System.out.println(current.value);
                second.next = current.next;
                depth--;
            }
        }
    }

    private boolean isHashCodeEven(E element) {
        return element.hashCode() % 2 == 0;
    }

    public void reverse() {
        Node<E> previous = null;
        while (top != null) {
            Node<E> next = top.next;
            top.next = previous;
            previous = top;
            top = next;
        }
        top = previous;
    }

    public int getDepth() {
        return depth;
    }

    public void print() {
        if (depth == 0) {
            throw new RuntimeException("List is empty");
        }
        Node<E> current = top;
        while (current.next != null) {
            System.out.print(current.value);
            current = current.next;
        }
        System.out.println(current.value);
    }


    public E find(E element) {
        if (top.value.equals(element)) {
            return top.value;
        }
        Node<E> current = top;
        while (current.next != null) {
            current = current.next;
            if (current.value.equals(element)) {
                return current.value;
            }
        }
        throw new RuntimeException("Element not found in stack");
    }

    public E getTop() {
        if (top == null) {
            throw new RuntimeException("List is empty");
        }
        return top.value;
    }

    private static class Node<E> {

        public Node(E value, Node<E> nextElement) {
            this.value = value;
            this.next = nextElement;
        }

        private final E value;
        private Node<E> next;
    }
}
