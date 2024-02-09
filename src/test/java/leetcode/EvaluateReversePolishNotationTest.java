package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EvaluateReversePolishNotationTest {
    private final EvaluateReversePolishNotation instance = new EvaluateReversePolishNotation();

    @Test
    void evalRPN() {
        assertEquals(9, instance.evalRPN(new String[]{"2", "1", "+", "3", "*"}));
        assertEquals(6, instance.evalRPN(new String[]{"4", "13", "5", "/", "+"}));
        assertEquals(22, instance.evalRPN(new String[]{"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"}));
    }
}