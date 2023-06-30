package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LRUCacheTest {

    @Test
    void test() {
        LRUCache cache = new LRUCache(2);
        assertEquals(-1, cache.get(2));
        cache.put(2, 6);
        assertEquals(-1, cache.get(1));
        cache.put(1, 5);
        cache.put(1, 2);
        assertEquals(2, cache.get(1));
        assertEquals(6, cache.get(2));
    }
}