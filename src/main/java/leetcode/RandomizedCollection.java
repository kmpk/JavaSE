package leetcode;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class RandomizedCollection {

    private final List<Integer> list;
    private final Map<Integer, Set<Integer>> listIndexMap;

    public RandomizedCollection() {
        list = new ArrayList<>();
        listIndexMap = new HashMap<>();
    }

    public boolean insert(int val) {
        Set<Integer> currentIndexes = listIndexMap.computeIfAbsent(val, (i) -> new HashSet<>());
        boolean firstInsert = currentIndexes.isEmpty();

        list.add(val);
        currentIndexes.add(list.size() - 1);

        return firstInsert;
    }

    public boolean remove(int val) {
        Set<Integer> currentIndexes = listIndexMap.computeIfAbsent(val, i -> new HashSet<>());
        if (currentIndexes.isEmpty()) {
            return false;
        }
        Integer toDelete = currentIndexes.iterator().next();
        list.set(toDelete, null);
        currentIndexes.remove(toDelete);
        return true;
    }

    public int getRandom() {
        Integer result = null;
        while (result == null) {
            result = list.get(ThreadLocalRandom.current().nextInt(list.size()));
        }
        return result;

    }
}
