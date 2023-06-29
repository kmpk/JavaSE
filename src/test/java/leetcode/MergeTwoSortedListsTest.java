package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeTwoSortedListsTest {
    private final MergeTwoSortedLists instance = new MergeTwoSortedLists();

    @Test
    void mergeEmpty() {
        assertNull(instance.mergeTwoLists(null, null));
    }

    @Test
    void mergeOneEmpty() {
        ListNode listNode = new ListNode(3);
        ListNode result = listNode;
        assertEquals(result, instance.mergeTwoLists(listNode, null));
        assertEquals(result, instance.mergeTwoLists(null, listNode));
    }

    @Test
    void mergeTwoLists() {
        ListNode first = new ListNode(1, new ListNode(3, new ListNode(5)));
        ListNode second = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode result = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))));
        assertEquals(result, instance.mergeTwoLists(first, second));
    }
}