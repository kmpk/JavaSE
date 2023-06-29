package leetcode.pc;

public class AddTwoNumbers {
    public static void main(String[] args) {
        ListNode first = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode second = new ListNode(5, new ListNode(6, new ListNode(4)));
        ListNode listNode = new AddTwoNumbers().addTwoNumbers(first, second);
        System.out.println();
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        ListNode first = l1;
        ListNode second = l2;

        int t = 0;
        ListNode current = result;
        ListNode previous = result;
        while (first != null || second != null) {
            int currentSum = 0;
            if (t > 0) {
                currentSum += t;
            }
            if (first != null) {
                currentSum += first.val;
                first = first.next;
            }
            if (second != null) {
                currentSum += second.val;
                second = second.next;
            }
            current.val = currentSum % 10;
            t = currentSum / 10;
            ListNode newNode = new ListNode();
            current.next = newNode;
            previous = current;
            current = newNode;
        }
        if (t > 0) {
            current.val = t;
        } else {
            previous.next = null;
        }
        return result;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
