package se.stepik.javase;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Optional;

public class QueueDeque {
    public static void main(String[] args) {
        Deque<String> states = new ArrayDeque<>();
        states.addLast("Germany");
        states.addLast("France");
        states.addFirst("UK");
        states.addLast("Norway");
        //UKGermanyFranceNorway
        String sFirst = states.pop();
        //GermanyFranceNorway
        String s = states.peek();
        String sLast = states.peekLast();
        states.offerLast(sFirst);
        //GermanyFranceNorwayUK
        String s1 = states.pollLast();
        //GermanyFranceNorway


        while (states.peek() != null) {
            System.out.print(states.pop());
        }
    }
}