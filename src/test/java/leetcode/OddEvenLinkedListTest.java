package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OddEvenLinkedListTest {
    private static OddEvenLinkedList instance = new OddEvenLinkedList();

    @Test
    void oddEvenList() {
        instance.oddEvenList(new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4)))));
        instance.oddEvenList(new ListNode(1,new ListNode(2,new ListNode(3))));
        instance.oddEvenList(new ListNode(1));
        instance.oddEvenList(null);
    }
}