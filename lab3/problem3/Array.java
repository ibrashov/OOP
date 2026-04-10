package problem3;

import java.util.Arrays;

public class Array<E> implements MyCollection<E> {
    private Object[] data;
    private int size;
    public Array() {
        data = new Object[10];
        size = 0;
    }
    public boolean add(E element) {
        if (size == data.length) {
            data = Arrays.copyOf(data, data.length * 2);
        }
        data[size++] = element;
        return true;
    }
    public boolean remove(E element) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(element)) {
                for (int j = i; j < size - 1; j++) {
                    data[j] = data[j + 1];
                }
                data[size - 1] = null;
                size--;
                return true;
            }
        }
        return false;
    }
    public boolean contains(E element) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(element)) {
                return true;
            }
        }
        return false;
    }
    public int size() {
        return size;
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public void clear() {
        for (int i = 0; i < size; i++) {
            data[i] = null;
        }
        size = 0;
    }
    public Object[] toArray() {
        return Arrays.copyOf(data, size);
    }
}