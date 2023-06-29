package algorithms;

import java.lang.reflect.Array;
import java.math.BigDecimal;

//checked array
public class GenericOrderedArray<E extends Number> {

    private final E[] array;
    private int numOfElements;

    public GenericOrderedArray(Class<E> clazz, int maxSize) {
        @SuppressWarnings("unchecked")
        E[] array = (E[]) Array.newInstance(clazz, maxSize);
        this.array = array;
        numOfElements = 0;
    }

    public int size() {
        return numOfElements;
    }

    private int compareNumbers(Number n1, Number n2) {
        BigDecimal n2c = new BigDecimal(n2.toString());
        BigDecimal n1c = new BigDecimal(n1.toString());

        return n1c.compareTo(n2c);
    }

    public int find(E searchKey) {
        int lowerBound = 0;
        int upperBound = numOfElements - 1;
        int currentIndex;

        while (true) {
            currentIndex = (lowerBound + upperBound) / 2;
            if (array[currentIndex].equals(searchKey)) {
                return currentIndex;
            } else if (lowerBound > upperBound) {
                return -1;
            } else {
                if (compareNumbers(array[currentIndex], searchKey) > 0)
                    lowerBound = currentIndex + 1;
                else upperBound = currentIndex - 1;
            }
        }
    }

    public void insert(E value) {
        int j;
        for (j = 0; j < numOfElements; j++) {
            if (compareNumbers(array[j], value) > 0) {
                break;
            }
            for (int k = numOfElements; k > j; k--) {
                array[k] = array[k - 1];
            }
            array[j] = value;
            numOfElements++;
        }
    }

    public boolean delete(E value) {
        int j = find(value);
        if (j == -1) {
            return false;
        } else {
            for (int k = j; k < numOfElements; k++) {
                array[k] = array[k + 1];
            }
            numOfElements--;
            return true;
        }
    }

    public void display() {
        for (E e : array) {
            System.out.print(e + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int maxSize = 100; // Размер массива
        GenericOrderedArray<Integer> arr = new GenericOrderedArray<Integer>(Integer.class,maxSize); // Создание массива
        arr.insert(77); // Вставка 10 элементов
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(0);
        arr.insert(66);
        arr.insert(33);
        int searchKey = 55; // Поиск элемента
        if( arr.find(searchKey) != arr.size() )
            System.out.println("Found " + searchKey);
        else
            System.out.println("Can't find " + searchKey);
        arr.display(); // Вывод содержимого
        arr.delete(0); // Удаление трех элементов
        arr.delete(55);
        arr.delete(99);
        arr.display(); // Повторный вывод
    }
}
