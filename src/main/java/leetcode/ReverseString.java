package leetcode;

public class ReverseString {
    public void reverseString(char[] s) {
        for (int i = 0; i < s.length / 2; i++) {
            swap(s, i, s.length - 1 - i);
        }
    }

    private void swap(char[] array, int i, int j) {
        char temp = array[j];
        array[j] = array[i];
        array[i] = temp;
    }
}
