package algorithms;

import org.w3c.dom.Node;

public class MyLinkedList<T> {
    private Node<T> firstNode;

    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println();
        list.reverseList();
        System.out.println();
    }

    void add(T val) {
        if (firstNode == null) {
            firstNode = new Node<>(val);
        } else {
            Node<T> node = firstNode;
            while (node.next != null) {
                node = node.next;
            }
            node.next = new Node<>(val);
        }
    }


    public Node<T> getFirstNode() {
        return firstNode;
    }

    class Node<T> {
        private T field;
        private Node<T> next;

        public Node(T field) {
            this.field = field;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "field=" + field +
                    ", next=" + next +
                    '}';
        }
    }

    public MyLinkedList<T> reverseList() {
        Node<T> current = this.firstNode;
        Node<T> next = null;
        Node<T> prev = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        this.firstNode = prev;
        return this;
    }
}
