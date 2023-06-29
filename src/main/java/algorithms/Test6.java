package algorithms;

public class Test6 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 4, 5, 4, 76, 7, 8, 9, 90, 9999, 10};
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for (int i : arr) {
            if (max1 < i) {
                max2 = max1;
                max1 = i;
            } else if (max2 < i) {
                max2 = i;
            }
        }
        System.out.println(max1 + " " + max2);
    }
}
