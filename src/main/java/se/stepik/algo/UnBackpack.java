package se.stepik.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UnBackpack {
    public static void main(String... args){
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            List<Item> list = new ArrayList<>();
            String[] array = br.readLine().split(" ");
            int j = Integer.parseInt(array[0]);
            int capacity = Integer.parseInt(array[1]);
            for (int i = 0; i < j; i++) {
                list.add(Item.fromString(br.readLine()));
            }
            long startTime = System.currentTimeMillis();
            String s = String.format("%.3f", getResult(capacity, list));
            System.out.println(s);
            //System.out.println(System.currentTimeMillis() - startTime + " ms");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static double getResult(int capacity, List<Item> list) {
        list.sort((o1, o2) -> Double.compare(o2.getValue(), o1.getValue()));
        double result = 0;
        Iterator<Item> it = list.iterator();
        while (it.hasNext()) {
            Item i = it.next();
            if (capacity >= i.getBulk()) {
                result += i.getBulk() * i.getValue();
                capacity -= i.getBulk();
            } else {
                result += capacity * i.getValue();
                return result;
            }
        }
        return result;
    }
}

class Item {
    private final int bulk, cost;
    private final double value;

    public static Item fromString(String s) {
        String[] array = s.split(" ");
        int cost = Integer.parseInt(array[0]);
        int bulk = Integer.parseInt(array[1]);
        return new Item(bulk, cost);
    }

    private Item(int bulk, int cost) {
        this.bulk = bulk;
        this.cost = cost;
        this.value = (double) cost / bulk;
    }

    public int getCost() {
        return cost;
    }

    public int getBulk() {
        return bulk;
    }

    public double getValue() {
        return value;
    }
}
