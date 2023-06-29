package se.hackerrank.basicstatistics;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;

import static org.junit.Assert.*;

//simulating enter in input?

public class problem1Test {

    private static String testArray = "";
    private static InputStream old;

    @Before
    public void setInput(){
        old = System.in;
        //System.setIn();
    }

    @Test
    public void mainTest(){

    }

    @After
    public void resetInput(){
        System.setIn(old);
    }
}