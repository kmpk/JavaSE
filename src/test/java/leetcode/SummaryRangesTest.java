package leetcode;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

class SummaryRangesTest {
    private static SummaryRanges instance = new SummaryRanges();

    @Test
    void summaryRanges() {
        assertEquals(List.of("0","2->4","6","8->9"),instance.summaryRanges(new int[]{0,2,3,4,6,8,9}));
        assertEquals(List.of("0->2","4->5","7"),instance.summaryRanges(new int[]{0,1,2,4,5,7}));
    }
}