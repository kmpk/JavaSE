package codewars.kyu4;

import codewars.kyu4.StripComments;
import org.junit.Test;

import static org.junit.Assert.*;

public class StripCommentsTest {
    @Test
    public void stripComments() throws Exception {
        assertEquals(
                "apples, pears\ngrapes\nbananas",
                StripComments.stripComments( "apples, pears # and bananas\ngrapes\nbananas !apples", new String[] { "#", "!" } )
        );

        assertEquals(
                "a\nc\nd",
                StripComments.stripComments( "a #b\nc\nd $e f g", new String[] { "#", "$" } )
        );
        assertEquals(
                "a\n\nd",
                StripComments.stripComments( "a #b\n   \nd $e f g", new String[] { "#", "$" } )
        );

    }

}