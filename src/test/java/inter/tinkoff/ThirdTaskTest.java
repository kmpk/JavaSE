package inter.tinkoff;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ThirdTaskTest {

    @Test
    void equalizeBySorting() {
        assertFalse(ThirdTask.equalizeBySorting(new int[]{1, 4, 2, 2, 4}, new int[]{1, 4, 4, 2, 2}));
        assertTrue(ThirdTask.equalizeBySorting(new int[]{5, 1, 2, 5, 3, 5}, new int[]{5, 1, 2, 3, 5, 5}));
        assertFalse(ThirdTask.equalizeBySorting(new int[]{4, 1, 2}, new int[]{1, 4, 7}));
        assertTrue(ThirdTask.equalizeBySorting(new int[]{7}, new int[]{7}));
        assertTrue(ThirdTask.equalizeBySorting(new int[]{4, 4, 1, 7, 5, 3, 8}, new int[]{4, 1, 4, 5, 7, 3, 8}));
    }

    private static int[] hand = new int[200000];
    private static int[] win = new int[200000];

    static {
        for (int i = 0; i < 200000; i++) {
            hand[i] = 200000 - 1 - i;
            win[i] = i;
        }
    }

    @Test
    void equalizeBig() {
        assertTrue(ThirdTask.equalizeBySorting(hand, win));
    }
}
