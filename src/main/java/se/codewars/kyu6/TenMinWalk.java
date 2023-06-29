package se.codewars.kyu6;

public class TenMinWalk {
    public static boolean isValid(char[] walk) {
        if (walk.length != 10) return false;
        int northOffset = 0, westOffset = 0;
        for (char c : walk) {
            switch (c) {
                case 'n':
                    northOffset++;
                    break;
                case 's':
                    northOffset--;
                    break;
                case 'w':
                    westOffset++;
                    break;
                case 'e':
                    westOffset--;
                    break;
                default:
                    throw new IllegalArgumentException("Array must contain only letters 'n,s,w,e'");
            }
        }
        return (northOffset == 0 && westOffset == 0);
    }
}
