package leetcode;

import java.util.Deque;
import java.util.LinkedList;

public class BasicCalculator {
    private Deque<CalcEntry> deque = new LinkedList<>();
    private StringBuilder currentEntry = new StringBuilder();

    public int calculate(String s) {
        return 0;
    }

    private void addEntry(char c){
        switch (c){
            case '('->{

            }
        }
        currentEntry.append(c);

    }

    private static class CalcEntry {
        final CalcEntryType type;
        final int num;

        public CalcEntry(CalcEntryType type, int num) {
            this.type = type;
            this.num = num;
        }
    }

    private enum CalcEntryType {
        NUMBER,
        SUM,
        SUBTRACTION,
        BRACKET_OPEN,
        BRACKET_CLOSE
    }
}
