package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ReverseWordsInAStringTest {
    private final static ReverseWordsInAString instance = new ReverseWordsInAString();

    @Test
    void reverseWords() {
        Assertions.assertEquals("the sky is blue", instance.reverseWords("blue is sky the"));
        Assertions.assertEquals("world hello", instance.reverseWords("  hello world  "));
        Assertions.assertEquals("example good a", instance.reverseWords("a good   example"));
    }
}