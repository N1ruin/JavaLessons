package Lesson37.task2.dataStructure;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class CustomCollection<E> implements Collection<E> {
    private Object[] objects;
    private int size;

    public CustomCollection() {
        this.objects = new Object[10];
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        for (Object object : objects) {
            if (object != null && object.equals(o)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        throw new UnsupportedOperationException("Method is not supported");
    }

    @Override
    public Object[] toArray() {
        return objects;
    }

    @Override
    public <T> T[] toArray(T[] a) {
        throw new UnsupportedOperationException("Method is not supported");
    }

    @Override
    public boolean add(E e) {
        if (size == 0) {
            objects[size] = e;
            size++;
        } else {
            if (size >= objects.length) {
                increaseArrayLength();
            }
            objects[size] = e;
            size++;
        }
        return true;
    }

    private void increaseArrayLength() {
        int newLength = (int) (objects.length * 1.5);
        objects = Arrays.copyOf(objects, newLength);
    }

    @Override
    public boolean remove(Object o) {
        for (int i = 0; i < size; i++) {
            if (objects[i].equals(o)) {
                for (int j = i; j < size; j++) {
                    objects[j] = objects[j + 1];
                }
                size--;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        for (Object o : c) {
            if (!contains(o)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        for (E e : c) {
            add(e);
        }
        return true;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        for (Object e : c) {
            remove(e);
        }
        return true;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        for (int i = 0; i < size; i++) {
            if (objects[i] != null && !c.contains(objects[i])) {
                remove(objects[i]);
                i--;
            }
        }
        return size > 0;
    }

    @Override
    public void clear() {
        objects = new Object[objects.length];
        size = 0;
    }

    public void printElements() {
        System.out.println(Arrays.toString(objects));
    }
}
