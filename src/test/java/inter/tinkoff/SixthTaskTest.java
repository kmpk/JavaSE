package inter.tinkoff;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SixthTaskTest {

    @Test
    void main() {
        SixthTask.CreepyCave cave = new SixthTask.CreepyCave(7);
        assertFalse(cave.isGhostsInSameBand(3, 1));
        assertEquals(1, cave.getGhostBandCount(3));
        cave.mergeBands(2, 4);
        assertTrue(cave.isGhostsInSameBand(1, 1));
        assertEquals(2, cave.getGhostBandCount(4));
        assertFalse(cave.isGhostsInSameBand(3, 4));
        cave.mergeBands(3, 4);
        assertEquals(3, cave.getGhostBandCount(4));
        cave.mergeBands(7, 3);
        cave.mergeBands(1, 3);
        assertEquals(3, cave.getGhostBandCount(7));
        assertEquals(2, cave.getGhostBandCount(1));
        assertTrue(cave.isGhostsInSameBand(7, 4));
    }

    @Test
    void test2(){
        SixthTask.CreepyCave cave = new SixthTask.CreepyCave(1);
        assertTrue(cave.isGhostsInSameBand(1,1));
        assertEquals(1,cave.getGhostBandCount(1));
        cave.mergeBands(1,1);
        assertTrue(cave.isGhostsInSameBand(1,1));
        assertEquals(1,cave.getGhostBandCount(1));
    }
}