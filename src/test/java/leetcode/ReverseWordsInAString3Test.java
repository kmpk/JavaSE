package leetcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseWordsInAString3Test {

    @Test
    public void reverseWords() {
        ReverseWordsInAString3 inst = new ReverseWordsInAString3();
        String s;
        s="Let's take LeetCode contest";
        Assert.assertEquals("s'teL ekat edoCteeL tsetnoc",inst.reverseWords(s));
        s="God Ding";
        Assert.assertEquals("doG gniD",inst.reverseWords(s));
    }
}