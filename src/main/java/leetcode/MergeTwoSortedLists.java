package leetcode;

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode listNode1 = list1;
        ListNode listNode2 = list2;
        ListNode resultLastNode = null;
        ListNode resultFirstNode = null;
        while (listNode1 != null || listNode2 != null) {
            ListNode next;
            if (listNode1 == null) {
                next = listNode2;
                listNode2 = listNode2.next;
            } else if (listNode2 == null) {
                next = listNode1;
                listNode1 = listNode1.next;
            } else {
                if (Integer.compare(listNode1.val, listNode2.val) == 1) {
                    next = listNode2;
                    listNode2 = listNode2.next;
                } else {
                    next = listNode1;
                    listNode1 = listNode1.next;
                }
            }
            if (resultFirstNode == null) {
                resultFirstNode = next;
                resultLastNode = next;
            } else {
                resultLastNode.next = next;
                resultLastNode = next;
            }
        }
        return resultFirstNode;
    }
}
