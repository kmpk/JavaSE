package codewars.kyu8;

import static org.junit.Assert.*;

import codewars.kyu8.RPS;
import org.junit.Test;

public class RPSTest {

    @Test
    public void test1() {
        System.out.println("Fixed Tests Player 1 won!");
        assertEquals("Player 1 won!", RPS.rps("rock", "scissors"));
        assertEquals("Player 1 won!", RPS.rps("scissors", "paper"));
        assertEquals("Player 1 won!", RPS.rps("paper", "rock"));
    }
    @Test
    public void test2() {
        System.out.println("Fixed Tests Player 2 won!");
        assertEquals("Player 2 won!", RPS.rps("scissors", "rock"));
        assertEquals("Player 2 won!", RPS.rps("paper", "scissors"));
        assertEquals("Player 2 won!", RPS.rps("rock", "paper"));
    }
    @Test
    public void test3() {
        System.out.println("Fixed Tests Draw!");
        assertEquals("Draw!", RPS.rps("scissors", "scissors"));
        assertEquals("Draw!", RPS.rps("paper", "paper"));
        assertEquals("Draw!", RPS.rps("rock", "rock"));
    }

}
