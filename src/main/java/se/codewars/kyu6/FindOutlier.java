package se.codewars.kyu6;

public class FindOutlier {
    static int find(int[] integers) {
        boolean searchingForEvenNumber;
        int lastOdd=0;
        int lastEven=0;
        int evenCount = 0;
        int oddCount = 0;
        for (int i = 0; i < 3; i++) {
            int j = integers[i];
            if (isEven(j)) {
                lastEven = j;
                evenCount++;
            } else {
                lastOdd = j;
                oddCount++;
            }
        }
        if (evenCount==2) return lastOdd;
        if (oddCount==2) return lastEven;
        searchingForEvenNumber = evenCount != 3;
        for (int i = 3; i<integers.length; i++){
            int j = integers[i];
            if (searchingForEvenNumber&&isEven(j)) return j;
            if (!searchingForEvenNumber&&!isEven(j)) return j;
        }
        return 0;
    }

    private static boolean isEven(int i) {
        return i % 2 == 0;
    }
}
