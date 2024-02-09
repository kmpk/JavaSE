package codewars.kyu6;
import codewars.kyu6.Dubstep;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class SongTests {
    @Test
    public void Test1() {
        assertEquals("ABC", new Dubstep().SongDecoder("WUBWUBABCWUB"));
    }
    @Test
    public void Test2()
    {
        assertEquals("R L", new Dubstep().SongDecoder("RWUBWUBWUBLWUB"));
    }
}