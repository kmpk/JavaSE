package inter;

import java.io.*;
import java.util.Deque;
import java.util.LinkedList;

public class DriverBonuses {
    private final int bonusAmount;
    private final Deque<Integer> window = new LinkedList<>();

    private int count = 0;
    private int previousBonusPeak = 0;
    private boolean decreasingRowEnded = false;

    private int currentRow = 0;
    private boolean rowIncreasing = false;

    public DriverBonuses(int bonusAmount) {
        this.bonusAmount = bonusAmount;
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int operations = Integer.parseInt(reader.readLine());
            DriverBonuses bonuses = new DriverBonuses(500);
            for (int i = 0; i < operations; i++) {
                String s = reader.readLine();
                bonuses.addRank(Integer.parseInt(s));
            }
            System.out.println(bonuses.result());
        }
    }

    public void addRank(Integer rank) {
        if (window.size() == 2) {
            window.removeFirst();
        }
        window.addLast(rank);
        processCurrent();
    }

    private void processCurrent() {
        if (window.size() != 2) {
            return;
        }
        int first = window.peekFirst();
        if (currentRow != 0) {
            if (rowIncreasing) {
                if (window.peekLast() == null || window.peekLast() <= first) {
                    calculateCurrentRow();
                } else {
                    currentRow++;
                }
            } else {
                if (window.peekLast() == null || window.peekLast() >= first) {
                    calculateCurrentRow();
                    if (window.peekLast() != null && first == window.peekLast()) {
                        decreasingRowEnded = false;
                    }
                } else {
                    currentRow++;
                }
            }
        } else {
            if (window.peekLast() == null || window.peekLast() == first) {
                processSameRank();
            } else if (window.peekLast() > first) {
                processIncreasingRow();
            } else {
                processDecreasingRow();
            }
        }
    }

    private void processIncreasingRow() {
        rowIncreasing = true;
        currentRow = 2;
    }

    private void processDecreasingRow() {
        rowIncreasing = false;
        currentRow = 2;
    }

    private void processSameRank() {
        count++;
        previousBonusPeak = 1;
        decreasingRowEnded = false;
    }

    private void calculateCurrentRow() {
        if (rowIncreasing) {
            previousBonusPeak = currentRow;
            if (decreasingRowEnded) {
                count += sumUpTo(currentRow + 1) - 1;
                decreasingRowEnded = false;
            } else {
                count += sumUpTo(currentRow);
            }
        } else {
            if (previousBonusPeak != 0 && !decreasingRowEnded) {
                count += Math.max(0, currentRow - previousBonusPeak + 1);
            }
            previousBonusPeak = 1;
            decreasingRowEnded = true;
            count += sumUpTo(currentRow);
        }
        currentRow = 0;
        window.removeFirst();
    }

    private int sumUpTo(int n) {
        return n * (n + 1) / 2;
    }

    public long result() {
        addRank(null);
        return (long) count * bonusAmount;
    }
}
