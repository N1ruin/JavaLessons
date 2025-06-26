package Lesson28.task4.dataStructure;


import Lesson28.task4.StackElementNotFoundException;

public class Stack<T> {
    private StackElement<T> topElement;
    private int size;

    public Stack(T topElement) {
        this.topElement = new StackElement<>(topElement, null);
        size++;
    }

    public void add(T element) {
        if (element == null) {
            return;
        }
        topElement = new StackElement<>(element, topElement);
        size++;
    }

    public void remove(T element) {
        if (element == null) {
            return;
        }

        if (topElement.value.equals(element)) {
            topElement = topElement.nextElement;
            size--;
            return;
        }
        StackElement<T> prevElement;
        StackElement<T> currentElement = topElement;

        while (currentElement.nextElement != null) {
            prevElement = currentElement;
            currentElement = currentElement.nextElement;

            if (currentElement.value.equals(element)) {
                prevElement.nextElement = currentElement.nextElement;
                size--;
                return;
            }
        }
        throw new StackElementNotFoundException();
    }

    public T find(T element) {
        if (element == null) {
            throw new StackElementNotFoundException();
        }

        if (topElement.value.equals(element)) {
            return topElement.value;
        }

        StackElement<T> currentElement = topElement;

        while (currentElement.nextElement != null) {
            currentElement = currentElement.nextElement;

            if (currentElement.value.equals(element)) {
                return currentElement.value;
            }
        }

        throw new StackElementNotFoundException();
    }

    public void printElements() {
        if (topElement == null) {
            return;
        }


        StringBuilder elements = new StringBuilder();
        StackElement<T> currentElement = topElement;
        elements.append(currentElement);

        while (currentElement.nextElement != null) {
            currentElement = currentElement.nextElement;
            elements.append(currentElement);
        }
        System.out.println(elements);
    }

    public int getSize() {
        return size;
    }

    public T getTopElement() {
        return topElement.value;
    }

    private static class StackElement<T> {
        private final T value;
        private StackElement<T> nextElement;

        public StackElement(T value, StackElement<T> nextElement) {
            this.value = value;
            this.nextElement = nextElement;
        }

        @Override
        public String toString() {
            return "Value = " + value.toString() + " ";
        }
    }
}
