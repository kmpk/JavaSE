package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RandomizedCollectionTest {

    @Test
    void insert() {
        RandomizedCollection instance = new RandomizedCollection();
        assertTrue(instance.insert(1));
        assertTrue(instance.remove(1));
        assertTrue(instance.insert(1));
    }
}