package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CloneGraph {
    Map<Integer, Node> map = new HashMap<>();

    public Node cloneGraph(Node node) {
        if (node == null) return null;
        if (map.containsKey(node.val)) return map.get(node.val);
        Node newNode = new Node(node.val, new ArrayList<Node>());
        map.put(node.val, newNode);
        for (Node neighbor : node.neighbors) {
            newNode.neighbors.add(cloneGraph(neighbor));
        }
        return newNode;
    }

    static class Node {
        final int val;
        final List<Node> neighbors;

        public Node() {
            this.val = 0;
            this.neighbors = new ArrayList<Node>();
        }

        public Node(int val) {
            this.val = val;
            this.neighbors = new ArrayList<Node>();
        }

        public Node(int val, ArrayList<Node> neighbors) {
            this.val = val;
            this.neighbors = neighbors;
        }
    }
}
