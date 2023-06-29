package se.stepik.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class Main {
    public static void main(String... args) {
        System.out.println(solution2());
    }

    public static String solution1() {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String input = br.readLine();
            HuffmanTree tree = new HuffmanTree(input);
            String encoded = tree.encodeString(input);
            StringBuilder result = new StringBuilder();
            result.append(tree.getCharMapSize()).append(" ").append(encoded.length()).append("\n");
            result.append(tree.charMapToString());
            result.append(encoded);
            return result.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String solution2() {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            Map<Character, String> charMap = new HashMap<>();
            String input = br.readLine();
            while (true) {
                input = br.readLine();
                if (input.matches("\\D: [01]+")) {
                    charMap.put(input.charAt(0), input.substring(1 + input.lastIndexOf(" ")));
                } else {
                    return new HuffmanTree(charMap).decodeString(input);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}

class HuffmanTree {
    public HuffmanTree(String s) {
        buildTree(buildPriorQueue(buildFreqMap(s)));
        buildCharMap();
    }

    public HuffmanTree(Map<Character, String> charMap) {
        this.charMap = charMap;
        reverseMap();
    }

    private void reverseMap() {
        reverseMap = charMap.entrySet()
                .stream()
                .collect(Collectors.toMap(Map.Entry::getValue, Map.Entry::getKey));
    }

    public int getCharMapSize() {
        return charMap.size();
    }

    public String charMapToString() {
        StringBuilder result = new StringBuilder();
        for (Map.Entry<Character, String> e : charMap.entrySet()) {
            result.append(e.getKey()).append(": ").append(e.getValue()).append("\n");
        }
        return result.toString();
    }

    public String decodeString(String s) {
        StringBuilder result = new StringBuilder();
        StringBuilder currentInput = new StringBuilder();
        Character decodedChar;
        for (char c : s.toCharArray()) {
            currentInput.append(c);
            decodedChar = reverseMap.getOrDefault(currentInput.toString(), null);
            if (decodedChar != null) {
                result.append(decodedChar);
                currentInput.setLength(0);
                decodedChar = null;
            }
        }
        return result.toString();
    }

    public String encodeString(String s) {
        StringBuilder result = new StringBuilder();
        for (Character c : s.toCharArray()) {
            result.append(charMap.get(c));
        }
        return result.toString();
    }

    private void buildCharMap() {
        charMap = new HashMap<>();
        treeSearch("", root);
        reverseMap();
    }

    private void treeSearch(String code, Node n) {
        if (n.hasRight()) treeSearch(code + "1", n.getRightCh());
        if (n.hasLeft()) treeSearch(code + "0", n.getLeftCh());
        if (n.getCharacter() != null) {
            charMap.put(n.getCharacter(), code);
        }
    }


    private void buildTree(PriorityQueue<Node> pq) {
        if (pq.size() == 0) throw new IllegalArgumentException("String must contain at least 1 character");
        if (pq.size() == 1) {
            root = new Node();
            root.setRightCh(pq.poll());
        } else {
            while (pq.size() > 1) {
                Node n1 = pq.poll();
                Node n2 = pq.poll();
                Node n3 = new Node(n2, n1);
                pq.add(n3);
            }
            root = pq.poll();
        }
    }

    private PriorityQueue<Node> buildPriorQueue(Map<Character, Integer> freqMap) {
        PriorityQueue<Node> result = new PriorityQueue<>();
        for (Map.Entry<Character, Integer> e : freqMap.entrySet()) {
            result.add(new Node(e.getValue(), e.getKey()));
        }
        return result;
    }

    private Map<Character, Integer> buildFreqMap(String s) {
        Map<Character, Integer> result = new HashMap<>();
        for (Character c : s.toCharArray()) {
            result.merge(c, 1, Integer::sum);
        }
        return result;
    }

    private Node root;
    private Map<Character, String> charMap;
    private Map<String, Character> reverseMap;
}

class Node implements Comparable<Node> {
    private Integer frequency;
    private Character character;
    private Node leftCh;
    private Node rightCh;

    public Node() {

    }

    public Node(Integer frequency, Character character) {
        this.frequency = frequency;
        this.character = character;
    }

    public Node(Node left, Node right) {
        frequency = left.frequency + right.frequency;
        leftCh = left;
        rightCh = right;
    }

    public Character getCharacter() {
        return character;
    }

    public Integer getFrequency() {
        return frequency;
    }

    public void setLeftCh(Node leftCh) {
        this.leftCh = leftCh;
    }

    public void setRightCh(Node rightCh) {
        this.rightCh = rightCh;
    }

    public Node getLeftCh() {
        return leftCh;
    }

    public Node getRightCh() {
        return rightCh;
    }

    public boolean hasLeft() {
        return leftCh != null;
    }

    public boolean hasRight() {
        return rightCh != null;
    }

    @Override
    public int compareTo(Node o) {
        return frequency - o.getFrequency();
    }
}