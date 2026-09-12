package CustomArrayList;

import java.util.Arrays;

public class GenericArrayList<T> {
    private Object[] data;
    private static final int DEFAULT_SIZE = 10;
    private int size = 0;

    public GenericArrayList() {
        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(T value) {
        if (isFull()) {
            resize();
        }
        data[size++] = value;
    }

    public Object remove() {
        if (size == 0) {
            throw new RuntimeException("Cannot remove from an empty list");
        }
        return data[--size];
    }

    public Object getData(int index) {
        return data[index];
    }

    public int size() {
        return size;
    }

    public void set(int index, T value) {
        data[index] = value;
    }

    private boolean isFull() {
        return size == data.length;
    }

    private void resize() {
        data = Arrays.copyOf(data, data.length * 2);
    }

    public void printList() {
        System.out.print("[");
        for (int i = 0; i < size; i++) {
            System.out.print(data[i]);
            if (i < size - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}