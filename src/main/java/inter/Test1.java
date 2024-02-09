package inter;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.IntStream;

public class Test1 {
    public static String trucksAndCargo(int x1, int x2, int xCargo) {
        long firstDistance = Math.abs((long) xCargo - (long) x1);
        long secondDistance = Math.abs((long) xCargo - (long) x2);

        if (firstDistance == secondDistance) {
            return null;
        } else if (firstDistance < secondDistance) {
            return "1";
        } else {
            return "2";
        }
    }
}
