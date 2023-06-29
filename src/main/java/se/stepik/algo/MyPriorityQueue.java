package se.stepik.algo;

import java.util.ArrayList;

public class MyPriorityQueue<E extends Comparable<E>> {
    private final ArrayList<E> list;
    private final boolean isMaxQueue;

    public MyPriorityQueue(boolean isMaxQueue) {
        list = new ArrayList<>();
        this.isMaxQueue = isMaxQueue;
    }

    public boolean isMaxQueue() {
        return isMaxQueue;
    }

    private void switchElements(int i, int j) {
        E temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }

    private static int getParentIndex(int i) {
        return (i - 1) / 2;
    }

    private static int getLeftChildIndex(int i) {
        return 2 * i + 1;
    }

    private static int getRightChildIndex(int i) {
        return 2 * i + 2;
    }

    private void siftDown(int i) {
        int check = checkChildes(i);
        while (check != -1) {
            switchElements(i, check);
            i = check;
            check = checkChildes(i);
        }
    }

    private void siftUp(int i) {
        int check = checkParent(i);
        while (check != -1) {
            switchElements(i, check);
            i = check;
            check = checkParent(i);
        }
    }

    public void insert(E ins) {
        list.add(ins);
        siftUp(list.size() - 1);
    }

    public E extract() {
        E result = list.get(0);
        switchElements(0, list.size() - 1);
        list.remove(list.size() - 1);
        siftDown(0);
        return result;
    }

    private int checkChildes(int i) {
        int leftChildIndex = getLeftChildIndex(i);
        E leftChild = leftChildIndex >= list.size() ? null : list.get(leftChildIndex);

        if (leftChild == null) return -1;

        int rightChildIndex = getRightChildIndex(i);
        E rightChild = rightChildIndex >= list.size() ? null : list.get(rightChildIndex);
        E parent = list.get(i);

        int leftCheck = parent.compareTo(leftChild);
        int rightCheck = rightChild == null ? 0 : parent.compareTo(rightChild);

        if (isMaxQueue) {
            if (leftCheck < 0 || rightCheck < 0) {
                int compare = rightChild == null ? 1 : leftChild.compareTo(rightChild);
                return compare > 0 ? leftChildIndex : rightChildIndex;
            }
        } else {
            if (leftCheck > 0 || rightCheck > 0) {
                int compare = rightChild == null ? -1 : leftChild.compareTo(rightChild);
                return compare < 0 ? leftChildIndex : rightChildIndex;
            }
        }
        return -1;
    }

    private int checkParent(int i) {
        E child = list.get(i);
        int parentIndex = getParentIndex(i);
        E parent = parentIndex >= list.size() ? null : list.get(parentIndex);

        int parentCheck = parent == null ? 0 : parent.compareTo(child);

        if (isMaxQueue) {
            if (parentCheck < 0) return parentIndex;
        } else {
            if (parentCheck > 0) return parentIndex;
        }
        return -1;
    }

    public String printInternalList() {
        StringBuilder sb = new StringBuilder();
        for (E e : list) {
            sb.append(e).append(" ");
        }
        sb.deleteCharAt(sb.lastIndexOf(" "));
        return sb.toString();
    }
}
