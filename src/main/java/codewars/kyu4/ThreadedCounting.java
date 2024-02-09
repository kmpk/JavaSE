package codewars.kyu4;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadedCounting {
    public static void countInThreads(Counter counter) {
        AtomicInteger lockCounter = new AtomicInteger(1);
        MyThread t0 = new MyThread(0, counter, lockCounter);
        MyThread t1 = new MyThread(1, counter, lockCounter);
        MyThread t2 = new MyThread(2, counter, lockCounter);
        t0.start();
        t1.start();
        t2.start();
        try {
            t2.join();
        } catch (InterruptedException e) {
        }
    }
}

class MyThread extends Thread {
    private final int n;
    private final Counter counter;
    private final AtomicInteger lockCounter;

    public MyThread(int n, Counter counter, AtomicInteger lockCounter) {
        this.n = n;
        this.counter = counter;
        this.lockCounter = lockCounter;
    }

    @Override
    public void run() {
        while (lockCounter.get() < 101) {
            if (lockCounter.get() % 3 == n) {
                synchronized (lockCounter) {
                    int current = lockCounter.get();
                    if (current % 3 == n && current < 101) {
                        counter.count(lockCounter.getAndIncrement());
                    }
                }
            }
        }
    }
}

class Counter {
    private final List<Integer> numbers = new ArrayList<>();
    private final Map<Integer, Long> threads = new HashMap<>();
    private final Map<Long, List<Integer>> threadNumbers = new HashMap<>();

    public synchronized void count(int i) {
        long threadId = Thread.currentThread().getId();
        numbers.add(i);
        threads.put(i, threadId);

        List<Integer> threadList = threadNumbers.get(threadId);
        if (threadList == null) {
            threadList = new ArrayList<>();
            threadNumbers.put(threadId, threadList);
        }
        threadList.add(i);
    }

    public List<Integer> getNumbers() {
        return new ArrayList<>(numbers);
    }

    public Set<Long> getThreadIds() {
        return new HashSet<>(threads.values());
    }

    public List<Integer> getNumbersInSameThreadAs(int i) {
        long threadId = threads.get(i);
        return new ArrayList<>(threadNumbers.get(threadId));
    }
}