package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShuffleAnArrayTest {

    @Test
    void test() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        final ShuffleAnArray shuffleAnArray = new ShuffleAnArray(array);
        int[] shuffle = shuffleAnArray.shuffle();
        Assertions.assertArrayEquals(array, shuffleAnArray.reset());
        System.out.println();
    }
}