package leetcode;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MergeKSortedLists {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) {
            return null;
        }
        ListNode result = null;
        ListNode current = null;
        PriorityQueue<ListNode> priorityQueue = new PriorityQueue<>(Comparator.comparingInt(node -> node.val));
        for (ListNode node : lists) {
            if (node != null) {
                priorityQueue.add(node);
            }
        }
        while (!priorityQueue.isEmpty()) {
            ListNode poll = priorityQueue.poll();
            if (result == null) {
                result = poll;
                current = result;
            } else {
                current.next = poll;
                current = poll;
            }
            if (poll.next != null) {
                priorityQueue.add(current.next);
            }
            poll.next = null;
        }
        return result;
    }
}
