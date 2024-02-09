package codewars.kyu4;

import codewars.kyu4.Finder;
import org.junit.Test;

import static org.junit.Assert.*;

public class FinderTest {
    @Test
    public void sampleTests() {

        String a = ".W.\n" +
                ".W.\n" +
                "...",

                b = ".W.\n" +
                        ".W.\n" +
                        "W..",

                c = "......\n" +
                        "......\n" +
                        "......\n" +
                        "......\n" +
                        "......\n" +
                        "......",

                d = "......\n" +
                        "......\n" +
                        "......\n" +
                        "......\n" +
                        ".....W\n" +
                        "....W.";

        assertEquals(true, Finder.pathFinder(a));
        assertEquals(false, Finder.pathFinder(b));
        assertEquals(true, Finder.pathFinder(c));
        assertEquals(false, Finder.pathFinder(d));
    }
}