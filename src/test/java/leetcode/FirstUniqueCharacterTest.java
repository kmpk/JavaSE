package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class FirstUniqueCharacterTest {
    private FirstUniqueCharacter instance = new FirstUniqueCharacter();

    @Test
    void name() {
        Assertions.assertEquals(0,instance.firstUniqChar("leetcode"));
        Assertions.assertEquals(2,instance.firstUniqChar("loveleetcode"));
        Assertions.assertEquals(-1,instance.firstUniqChar("aabb"));
    }
}