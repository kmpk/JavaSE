package se.codewars.kyu8;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConvertNumberTest {
    @Test
    public void tests() {
        assertArrayEquals(new int[]{1, 3, 2, 5, 3}, ConvertNumber.digitize(35231));
    }
}