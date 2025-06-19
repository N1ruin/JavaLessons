package Lesson8.task1;

public class Counter {
    public String name;
    public int count;

    public Counter(String name, int count) {
        this.name = name;
        this.count = count;
    }

    public Counter(String name) {
        this(name, 0);

    }

    public int increment() {
        return ++count;
    }

    public int decrement() {
        return --count;
    }

    public int increase(int value) {
        return count += value;
    }

    public int decrease(int value) {
        return count -= value;
    }
}
