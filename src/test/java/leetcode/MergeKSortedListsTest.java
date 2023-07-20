package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MergeKSortedListsTest {
    private static MergeKSortedLists instance = new MergeKSortedLists();

    @Test
    void mergeKLists() {
        assertEquals(new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(4, new ListNode(5, new ListNode(6)))))))),
                instance.mergeKLists(new ListNode[]{new ListNode(1, new ListNode(4, new ListNode(5))), new ListNode(1, new ListNode(3, new ListNode(4))), new ListNode(2, new ListNode(6))}));
    }
}