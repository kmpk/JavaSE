package algorithms;

import java.util.Arrays;
import java.util.EmptyStackException;

public class CustomStack<E> {
    public static final int INITIAL_CAPACITY = 10;
    private E[] array;
    private int pointer;

    public CustomStack() {
        array = (E[]) new Object[INITIAL_CAPACITY];
        pointer = -1;
    }

    public CustomStack(int initialCap) {
        array = (E[]) new Object[initialCap];
        pointer = -1;
    }

    public int size() {
        return pointer + 1;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public E push(E item) {
        pointer++;
        extendIfFull();
        array[pointer] = item;
        return item;
    }

    public E pop() {
        throwExceptionIfEmpty();
        E item = array[pointer];
        array[pointer] = null;
        pointer--;
        return item;
    }

    public E peek() {
        throwExceptionIfEmpty();
        return array[pointer];
    }

    private void throwExceptionIfEmpty() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
    }

    private void extendIfFull() {
        if (size() == array.length) {
            extendArray();
        }
    }

    private void extendArray() {
        array = Arrays.copyOf(array, array.length * 2);
    }
}
