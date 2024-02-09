package inter.tinkoff;

import org.junit.jupiter.api.Test;

import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FirstTaskTest {

    @Test
    void chooseRevolverCost() {
        assertEquals(10, FirstTask.chooseRevolverCost(13, IntStream.of(3, 10, 300, 15, 3)));
        assertEquals(0, FirstTask.chooseRevolverCost(4, IntStream.of(5, 12, 10)));
    }

    private static IntStream values;

    static {
        IntStream ints = IntStream.rangeClosed(1,100000);
        values = IntStream.concat(ints, IntStream.of(Integer.MAX_VALUE));
    }

    @Test
    void chooseRevolverCostLong1() {
        assertEquals(Integer.MAX_VALUE, FirstTask.chooseRevolverCost(Integer.MAX_VALUE, values));
    }
}