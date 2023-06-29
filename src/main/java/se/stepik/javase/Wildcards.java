package se.stepik.javase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;


public class Wildcards {

    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>(Arrays.asList("Mr.Green", "Mr.Yellow", "Mr.Red"));
        String[] strArray=new String[3];
        nameList.toArray(strArray);
        for (int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i]);
        }
    }


    class Food {
    }

    class Bakery extends Food {
    }

    class Cake extends Bakery {
    }

    class Pie extends Bakery {
    }

    class Tart extends Bakery {
    }

    interface Box<T> {
        public void put(T item);

        public T get();
    }

    class CustmoBox<T> implements Box<T> {
        private Object item;

        @Override
        public void put(T item) {
            this.item = item;
        }

        @Override
        public T get() {
            return (T) item;
        }
    }

    class Packer {
        public void repackage(Box<? super Food> to, Box<? extends Bakery> from) {
            to.put(from.get());
        }
    }

    private static TriFunction<String, String> triFunction =
            (x, y, z, k) -> (x.toLowerCase() + z.toUpperCase() + y.toLowerCase() + k.toUpperCase());
}


@FunctionalInterface
interface TriFunction<R, T> {
    R apply(T t1, T t2, T t3, T t4);
}

