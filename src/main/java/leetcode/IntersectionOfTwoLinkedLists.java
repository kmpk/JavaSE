package leetcode;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<String> set = new HashSet<>();
        ListNode nodeA = headA;
        ListNode nodeB = headB;
        while (nodeA != null) {
            set.add(System.identityHashCode(nodeA) + nodeA.toString());
            nodeA = nodeA.next;
        }
        while (nodeB != null) {
            if (set.contains(System.identityHashCode(nodeB) + nodeB.toString())) {
                return nodeB;
            }
            nodeB = nodeB.next;
        }
        return null;
    }
}
