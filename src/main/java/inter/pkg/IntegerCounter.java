package inter.pkg;

import java.util.BitSet;

public class IntegerCounter {
    private final BitSet positive = new BitSet();
    private final BitSet negative = new BitSet();

    public IntegerCounter() {
    }

    public long size() {
        synchronized (this) {
            return (long) positive.cardinality() + negative.cardinality();
        }
    }

    public void add(int[] ints, int rightBoundExclusive) {
        synchronized (this) {
            for (int i = 0; i < rightBoundExclusive; i++) {
                add(ints[i]);
            }
        }
    }

    public void add(int i) {
        synchronized (this) {
            if (i < 0) {
                negative.set(-i);
            } else {
                positive.set(i);
            }
        }
    }
}
