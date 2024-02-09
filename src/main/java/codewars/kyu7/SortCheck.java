package codewars.kyu7;

public class SortCheck {
    public static String isSortedAndHow(int[] array) {
        boolean isAlwaysUp=true, isAlwaysDown=true;
        for (int i = 1; i<array.length; i++){
            if (array[i]>array[i-1]) {
                isAlwaysDown=false;
            } else{
                isAlwaysUp=false;
            }
        }
        if (!isAlwaysDown&&!isAlwaysUp) return "no";
        return isAlwaysUp? "yes, ascending" : "yes, descending";
    }
}
