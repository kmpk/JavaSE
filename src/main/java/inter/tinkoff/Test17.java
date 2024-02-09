package inter.tinkoff;

import java.util.HashMap;
import java.util.Map;

public class Test17 {
    public static void main(String[] args) {
        Map<Integer,Integer> relations = new HashMap<>();
        relations.put(1,2);
        relations.put(3,4);
        relations.forEach((k,v)->relations.put(v,k));
    }
}
