package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public class RandomizedSet {

    private final List<Long> list;
    private final Map<Integer, Integer> listIndexMap;

    public RandomizedSet() {
        list = new ArrayList<>();
        listIndexMap = new HashMap<>();
    }

    public boolean insert(int val) {
        Integer currentIndex = listIndexMap.get(val);
        if (currentIndex == null || currentIndex < 0) {
            list.add((long) val);
            listIndexMap.put(val, list.size() - 1);
            return true;
        }
        return false;
    }

    public boolean remove(int val) {
        Integer currentIndex = listIndexMap.get(val);
        if (currentIndex == null || currentIndex < 0) {
            return false;
        }
        list.set(currentIndex, Long.MIN_VALUE);
        listIndexMap.put(val, -1);
        return true;
    }

    public int getRandom() {
        long result = Long.MIN_VALUE;
        while (result == Long.MIN_VALUE) {
            result = list.get(ThreadLocalRandom.current().nextInt(list.size()));
        }
        return (int) result;
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
