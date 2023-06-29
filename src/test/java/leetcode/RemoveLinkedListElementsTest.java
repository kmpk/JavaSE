package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveLinkedListElementsTest {
    private final RemoveLinkedListElements instance = new RemoveLinkedListElements();

    @Test
    void testEmpty() {
        assertEquals(null, instance.removeElements(null, 0));
    }

    @Test
    void testNoRemoves() {
        ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(3)));
        ListNode result = new ListNode(1, new ListNode(2, new ListNode(3)));
        assertEquals(result, instance.removeElements(listNode, 4));
    }

    @Test
    void testRemoves() {
        ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(6, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6)))))));
        ListNode result = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        assertEquals(result, instance.removeElements(listNode, 6));
    }
}