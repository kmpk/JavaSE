package inter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class ProgressionStructure {
    private final PriorityQueue<Progression> queue = new PriorityQueue<>(
            Comparator.comparingLong(Progression::getA)
                    .thenComparingInt(Progression::getId));
    private final Map<Integer, Progression> map = new HashMap<>();

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int operations = Integer.parseInt(reader.readLine());
            ProgressionStructure structure = new ProgressionStructure();
            for (int i = 0; i < operations; i++) {
                String[] input = reader.readLine().split(" ");
                switch (input[0]) {
                    case "1" -> structure.add(new Progression(Integer.parseInt(input[3]), Integer.parseInt(input[1]), Integer.parseInt(input[2])));
                    case "2" -> structure.remove(Integer.parseInt(input[1]));
                    case "3" -> System.out.println(structure.poll());
                    default -> throw new RuntimeException("Operation is not supported");
                }
            }
        }
    }

    public void add(Progression progression) {
        map.put(progression.getId(), progression);
        queue.add(progression);
    }

    public void remove(int id) {
        map.get(id).delete();
    }

    public long poll() {
        Progression minProgression = queue.poll();
        while (minProgression.isDeleted()) {
            minProgression = queue.poll();
        }
        map.remove(minProgression.getId());
        add(minProgression.getNext());
        return minProgression.getA();
    }

    public static class Progression {
        private final int id;
        private final long a;
        private final long d;

        private boolean deleted = false;

        public Progression(int id, long a, long d) {
            this.id = id;
            this.a = a;
            this.d = d;
        }

        public void delete() {
            this.deleted = true;
        }

        public boolean isDeleted() {
            return deleted;
        }

        public int getId() {
            return id;
        }

        public long getA() {
            return a;
        }

        public long getD() {
            return d;
        }

        public Progression getNext() {
            return new Progression(id, a + d, d);
        }
    }
}
