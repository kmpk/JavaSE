package inter.tinkoff;

import org.junit.jupiter.api.Test;

import java.util.concurrent.ThreadLocalRandom;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FifthTaskTest {

    @Test
    void solve1() {
        FifthTask.LandMap map = new FifthTask.LandMap(2);
        map.addRoad(1, 2, 6);
        map.addRoad(2, 1, 9);
        assertEquals(8, FifthTask.solve(map, 6, 9));
    }

    @Test
    void solve2() {
        FifthTask.LandMap map = new FifthTask.LandMap(5);
        map.addRoad(1,2,8);
        map.addRoad(2,3,6);
        map.addRoad(2,3,2);
        map.addRoad(3,1,4);
        map.addRoad(5,4,1);
        map.addRoad(4,5,8);
        assertEquals(5, FifthTask.solve(map, 1,8));
    }

    private static FifthTask.LandMap map = new FifthTask.LandMap(100000);

    static {
        ThreadLocalRandom random = ThreadLocalRandom.current();
        for (int i = 0; i < 100000; i++) {
            map.addRoad(random.nextInt(1,100000),random.nextInt(1,100000), random.nextInt(1,1000000000));
        }
    }

    @Test
    void solve3() {
        FifthTask.solve(map,1,1000000000);
    }
}