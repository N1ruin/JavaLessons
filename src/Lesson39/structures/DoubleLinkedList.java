package Lesson39.structures;

public class DoubleLinkedList<E> {
    private Node<E> first;
    private Node<E> last;
    private int size;

    public void addLast(E element) {
        if (size == 0) {
            first = new Node<>(element, null, null);
            last = first;
            size++;
            return;
        }

        Node<E> current = first;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new Node<>(element, null, current);
        last = current.next;
        size++;
    }

    public void addFirst(E element) {
        if (size == 0) {
            last = new Node<>(element, null, null);
            first = last;
            size++;

            return;
        }

        Node<E> current = last;
        while (current.previous != null) {
            current = current.previous;
        }
        current.previous = new Node<>(element, current, null);
        first = current.previous;
        size++;
    }

    public void print() {
        Node<E> current = first;
        while (current != null) {
            System.out.print(current.value);
            current = current.next;
        }
        System.out.println();
    }

    public void remove(E element) {
        Node<E> current = first;

        while (current != null) {
            if (current.value.equals(element)) {
                if (first == current) {
                    removeFirst(current);
                } else if (last == current) {
                    removeLast(current);
                } else {
                    removeMiddle(current);
                }
                size--;
                return;
            }
            current = current.next;
        }
        throw new RuntimeException("Element not found");
    }

    private void removeFirst(Node<E> current) {
        first = current.next;
        if (first != null) {
            first.previous = null;
        }
    }

    private void removeLast(Node<E> current) {
        last = current.previous;
        last.next = null;
    }

    private void removeMiddle(Node<E> current) {
        current.previous.next = current.next;
        current.next.previous = current.previous;
        size--;
    }

    public int getSize() {
        return size;
    }

    public E getFirst() {
        if (first == null) {
            throw new RuntimeException("List is empty");
        }
        return first.value;
    }

    public E getLast() {
        if (last == null) {
            throw new RuntimeException("List is empty");
        }
        return last.value;
    }

    public void removeElementWhenHashCodeIsEven() {
        if (isHashCodeEven(first.value)) {
            remove(first.value);
        }
        Node<E> current = first;
        while (current != null) {
            if (isHashCodeEven(current.value)) {
                remove(current.value);
            }
            current = current.next;
        }
    }

    public void reverse() {
        if (size <= 1) {
            return;
        }

        last = first;

        Node<E> current = first;
        Node<E> temp = null;
        while (current != null) {
            temp = current.previous;
            current.previous = current.next;
            current.next = temp;
            current = current.previous;
        }
        first = temp.previous;
    }

    public void printTest() {
        System.out.println("First" + first.value);
        System.out.println("First+1 " + first.next.value);
        System.out.println("First+2 " + first.next.next.value);
        System.out.println("First+4 " + first.next.next.next.value);
        System.out.println("First+5 " + first.next.next.next.next.value);
        System.out.println("LAST " + last.value);
        System.out.println("LAST prev " + last.previous.value);
        System.out.println("LAST prev 1 " + last.previous.previous.value);
        System.out.println("LAST prev 2 " + last.previous.previous.previous.value);
        System.out.println("LAST prev 3 " + last.previous.previous.previous.previous.value);

    }

    private boolean isHashCodeEven(E element) {
        return element.hashCode() % 2 == 0;
    }

    private static class Node<E> {
        private E value;
        private Node<E> next;
        private Node<E> previous;

        public Node(E value, Node<E> next, Node<E> previous) {
            this.value = value;
            this.next = next;
            this.previous = previous;
        }
    }
}
