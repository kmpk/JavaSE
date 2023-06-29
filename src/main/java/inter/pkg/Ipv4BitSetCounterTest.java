package inter.pkg;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.*;
import java.util.stream.IntStream;

class Ipv4BitSetCounterTest {
    private IntegerCounter counter;

    @BeforeEach
    void createNewCounter() {
        counter = new IntegerCounter();
    }

    @Test
    void testZeroCountIfNotAdded() {
        Assertions.assertEquals(0, counter.size());
    }

    @Test
    void testAddedCountNoDuplicates() {
//        counter.add(List.of(1, 2, 3, 4, 5));
//        Assertions.assertEquals(5, counter.size());
//        counter.add(List.of(10, 20, 30, 40, 50));
//        Assertions.assertEquals(10, counter.size());
//        List<Integer> ips = IntStream.range(100, 1000).boxed().toList();
//        counter.add(ips);
//        Assertions.assertEquals(910, counter.size());
    }

    @Test
    void testAddedCountWithDuplicates() {
//        counter.add(List.of(1, 1, 1, 1, 1));
//        Assertions.assertEquals(1, counter.size());
//        counter.add(List.of(10, 20, 10, 10, 20));
//        Assertions.assertEquals(3, counter.size());
    }

    @Test
    void testThreadSafety() throws InterruptedException {
//        Set<Integer> controlSet = ConcurrentHashMap.newKeySet();
//        IntegerCounter counter = this.counter;
//        int threads = 10;
//        ExecutorService service = Executors.newFixedThreadPool(threads);
//        int load = 100;
//        int batchSize = 1000;
//        for (int i = 0; i < 20; i++) {
//            service.submit(() -> {
//                List<Integer> batch = new ArrayList<>();
//                for (int j = 0; j < load; j++) {
//                    for (int k = 0; k < batchSize; k++) {
//                        batch.add(ThreadLocalRandom.current().nextInt());
//                    }
//                    counter.add(batch);
//                    controlSet.addAll(batch);
//                }
//            });
//        }
//        service.shutdown();
//        service.awaitTermination(100, TimeUnit.SECONDS);
//        Assertions.assertEquals(controlSet.size(), counter.size());
    }
}