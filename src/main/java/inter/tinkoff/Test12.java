package inter.tinkoff;

import java.util.ArrayList;
import java.util.List;

public class Test12 {
    public static void main(String[] args) {
        final List<Integer> count = new ArrayList<>();
        count.add(1);
        count.add(5);
        count.add(8);
        count.add(2);
        count.remove(1);
        count.remove(2);
        System.out.println(count);
    }
}
