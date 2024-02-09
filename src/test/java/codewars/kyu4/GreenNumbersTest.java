package codewars.kyu4;

import codewars.kyu4.GreenNumbers;
import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.*;

public class GreenNumbersTest {
    @Test
    public void basicTests() {
        assertEquals(new BigInteger("1"), GreenNumbers.get(1));
        assertEquals(new BigInteger("5"), GreenNumbers.get(2));
        assertEquals(new BigInteger("6"), GreenNumbers.get(3));
        assertEquals(new BigInteger("25"), GreenNumbers.get(4));
    }

    @Test
    public void biggerTests() {
        assertEquals(new BigInteger("2890625"), GreenNumbers.get(12));
        assertEquals(new BigInteger("7109376"), GreenNumbers.get(13));
    }

    @Test
    public void advancedTests() {/*
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5001; i++) {
            long start = System.currentTimeMillis();
            GreenNumbers.get(i);
            int end = (int) (System.currentTimeMillis() - start) / 100;
            list.add(end);
        }
        try (FileWriter fw = new FileWriter(new File("M:/test.txt"))) {
            for (Integer i : list) {
                fw.write(String.valueOf(i));
                fw.write("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        */

        long start = System.currentTimeMillis();
        assertNotEquals(null, GreenNumbers.get(5001));
        System.out.println((System.currentTimeMillis() - start));
        /*
        start = System.currentTimeMillis();
        assertNotEquals(null, GreenNumbers.get(1300));
        System.out.println((System.currentTimeMillis() - start));
        start = System.currentTimeMillis();
        assertNotEquals(null, GreenNumbers.get(2300));
        System.out.println((System.currentTimeMillis() - start));
        start = System.currentTimeMillis();

        assertNotEquals(null, GreenNumbers.get(3300));
        System.out.println((System.currentTimeMillis() - start));
        start = System.currentTimeMillis();

        assertNotEquals(null, GreenNumbers.get(4300));
        System.out.println((System.currentTimeMillis() - start));
        start = System.currentTimeMillis();

        assertNotEquals(null, GreenNumbers.get(4550));
        System.out.println((System.currentTimeMillis() - start));
        start = System.currentTimeMillis();

        assertNotEquals(null, GreenNumbers.get(5000));
        System.out.println((System.currentTimeMillis() - start));
*/

        //assertEquals(new BigInteger("6188999442576576769103890995893380022607743740081787109376"),       GreenNumbers.get(100));
        //assertEquals(new BigInteger("9580863811000557423423230896109004106619977392256259918212890625"), GreenNumbers.get(110));
    }
}