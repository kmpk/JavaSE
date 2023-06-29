package se.stepik.javase;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TypeViolator {
    public static void main(String[] args) {
        System.out.println(NaiveQualityControl.check(Violator.defraud()));
        Lock lock = new ReentrantLock();
        lock.lock();
        try {

        } finally {

        }
    }
}

class Bakery {
}

class Cake extends Bakery {
}

// But this should not
class Paper {
}

// These boxes are used to pack stuff
class Box<T> {
    void put(T item) {
        /* implementation omitted */

    }

    T get() {
        return null;
        /* implementation omitted */
    }
}

// This quality checker ensures that boxes for sale contain Bakery and anything else
class NaiveQualityControl {

    public static boolean check(List<Box<? extends Bakery>> boxes) {
        // Method signature guarantees that all illegal calls will produce compile-time error... or not?
        return true;
    }
}

class Violator {

    public static List<Box<? extends Bakery>> defraud() {
        // Add implementation here
        List list = new ArrayList();
        Box box = new Box();
        box.put(new Paper());
        list.add(box);
        return list;
    }

}