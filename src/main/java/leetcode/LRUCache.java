package leetcode;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache {
    private final int capacity;
    private final LinkedHashMap<Integer, Integer> map;

    public LRUCache(int capacity) {
        this.map = new LinkedHashMap<>(capacity, 0.5F, true);
        this.capacity = capacity;
    }

    public int get(int key) {
        Integer get = map.get(key);
        return get == null ? -1 : get;
    }

    public void put(int key, int value) {
        if (map.size() == capacity && !map.containsKey(key)) {
            Iterator<Map.Entry<Integer, Integer>> iterator = map.entrySet().iterator();
            iterator.next();
            iterator.remove();
        }
        map.put(key, value);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
