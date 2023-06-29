package leetcode.pc;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FirstBadVersionTest {

    @Test
    public void firstBadVersion() {
        FirstBadVersion inst = new FirstBadVersion();
        inst.setBadVersion(10);
        Assert.assertEquals(10,inst.firstBadVersion(20));
        inst.setBadVersion(1);
        Assert.assertEquals(1,inst.firstBadVersion(2));
        inst.setBadVersion(1000);
        Assert.assertEquals(1000,inst.firstBadVersion(2000));
    }
}