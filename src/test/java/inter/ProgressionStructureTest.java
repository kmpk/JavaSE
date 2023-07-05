package inter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProgressionStructureTest {

    @Test
    void test1() {
        ProgressionStructure instance = new ProgressionStructure();
        instance.add(new ProgressionStructure.Progression(1,3,-4));
        instance.add(new ProgressionStructure.Progression(3,-5,4));
        instance.add(new ProgressionStructure.Progression(2,-2,10));
        assertEquals(-5,instance.poll());
        assertEquals(-2,instance.poll());
        instance.remove(3);
        assertEquals(3,instance.poll());
        assertEquals(-1,instance.poll());
        instance.remove(2);
        instance.add(new ProgressionStructure.Progression(4,-5,4));
        assertEquals(-5,instance.poll());
        instance.remove(1);
        assertEquals(-5,instance.poll());
        assertEquals(-1,instance.poll());
        assertEquals(3,instance.poll());
    }
}