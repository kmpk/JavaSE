package se.stepik.javase;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListsRemoving {
    public static void main(String[] args) {
        List<Integer> delList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            delList.add(i);
        }


        //*** change this code which raises ConcurrentModificationException
        //delList.removeIf(i->i<10);
        Iterator<Integer> it = delList.iterator();
        while (it.hasNext()) {
            int i = it.next();
            if (i < 10) it.remove();
        }
        //***


        System.out.println(delList);

    }
}
