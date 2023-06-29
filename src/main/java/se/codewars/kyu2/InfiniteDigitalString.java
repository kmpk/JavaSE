package se.codewars.kyu2;

public class InfiniteDigitalString {
    private static long currentNumber;
    private static int currentNumberIndex;
    private static String digits;
    private static long counter;


    public static long findPosition(final String s) {
        init();
        char[] wantedNumber = s.toCharArray();
        char currentDigit;
        boolean flag = true;
        int iterates = 0;
        while (flag) {
            currentDigit = getNextDigit();
            if (currentDigit == wantedNumber[0]) {
                for (int i = 1; i < wantedNumber.length; i++) {
                    currentDigit = getNextDigit();
                    if (currentDigit == wantedNumber[i]) {
                        flag = false;
                        iterates++;
                    } else {
                        flag = true;
                        for (int j = i; j > 1; j--) {
                            getPreviousDigit();
                        }
                        break;
                    }
                }
            }
        }
        System.out.println(counter - iterates);
        System.exit(0);
        return counter - iterates;
    }

    private static void init() {
        currentNumber = 1;
        currentNumberIndex = 0;
        digits = Long.toString(currentNumber);
        counter = -1;
    }

    private static char getPreviousDigit() {
        char result;
        if (currentNumberIndex != 0) {
            currentNumberIndex--;
            counter--;
            result = digits.charAt(currentNumberIndex+1);
        } else {
            result = digits.charAt(currentNumberIndex);
            counter--;
            previousNumber();
        }
        return result;
    }

    private static void previousNumber() {
        currentNumber--;
        digits = Long.toString(currentNumber);
        currentNumberIndex = digits.length() - 1;
    }

    private static char getNextDigit() {
        if (currentNumberIndex < digits.length()) {
            currentNumberIndex++;
            counter++;
            return digits.charAt(currentNumberIndex - 1);
        } else {
            nextNumber();
            return getNextDigit();
        }
    }

    private static void nextNumber() {
        currentNumberIndex = 0;
        currentNumber++;
        digits = Long.toString(currentNumber);
    }
}
