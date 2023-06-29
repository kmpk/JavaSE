package algorithms;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.EmptyStackException;

public class CustomStackTest {
    @Test
    public void returnsRightSizeTest() {
        CustomStack<String> stack = new CustomStack<>();
        assertEquals(0, stack.size());
        populateStack(stack, 10);
        assertEquals(10, stack.size());
        populateStack(stack, 100);
        assertEquals(110, stack.size());
        populateStack(stack, 10000000);
        assertEquals(10000110, stack.size());
    }

    @Test
    public void returnsRightSizeWithInitialCapTest() {
        CustomStack<String> stack = new CustomStack<>(20000000);
        assertEquals(0, stack.size());
        populateStack(stack, 10);
        assertEquals(10, stack.size());
        populateStack(stack, 100);
        assertEquals(110, stack.size());
        populateStack(stack, 10000000);
        assertEquals(10000110, stack.size());
    }

    @Test
    public void pushPopTest() {
        CustomStack<String> stack = new CustomStack<>();
        String item = "";
        stack.push(item);
        assertEquals(item, stack.pop());
    }

    @Test
    public void canPeekTest() {
        CustomStack<String> stack = new CustomStack<>();
        String item = "";
        stack.push(item);
        assertEquals(item, stack.peek());
        assertEquals(1, stack.size());
    }

    @Test
    public void rightOrderTest() {
        CustomStack<String> stack = new CustomStack<>();
        stack.push("1");
        stack.push("2");
        stack.push("3");
        stack.push("4");
        stack.push("5");
        assertEquals("5", stack.pop());
        assertEquals("4", stack.pop());
        assertEquals("3", stack.pop());
        stack.push("6");
        assertEquals("6",stack.pop());
        assertEquals("2",stack.pop());
        assertEquals("1",stack.pop());
    }

    @Test
    public void isEmptyTest() {
        CustomStack<String> stack = new CustomStack<>();
        assertTrue(stack.isEmpty());
        stack.push("");
        assertFalse(stack.isEmpty());
    }

    @Test(expected = EmptyStackException.class)
    public void exceptionIfEmptyTest() {
        CustomStack<String> stack = new CustomStack<>();
        stack.pop();
    }

    @Test(expected = EmptyStackException.class)
    public void exceptionOnPopOverSize() {
        CustomStack<String> stack = new CustomStack<>();
        populateStack(stack,10);
        for (int i=0; i<11;i++){
            stack.pop();
        }
    }

    private static void populateStack(CustomStack<String> stack, int count) {
        for (int i = 0; i < count; i++) {
            stack.push("" + i);
        }
    }
}