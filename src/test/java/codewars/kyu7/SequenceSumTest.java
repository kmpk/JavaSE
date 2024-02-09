package codewars.kyu7;

import codewars.kyu7.SequenceSum;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class SequenceSumTest {
    @Test
    public void testBasic() {
        assertEquals("0+1+2+3+4+5+6 = 21", SequenceSum.showSequence(6));
    }
}
