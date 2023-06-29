package se.stepik.javase;

import java.util.Map;
import java.util.TreeMap;

public class MapsBypassing {
    public static void main(String[] args) {


        Map<String, Integer> map = new TreeMap<>();
        map.put("Gamma",  3);
        map.put("Omega", 24);
        map.put("Alpha",  1);

        map.entrySet().stream().forEach(e-> System.out.printf("%s=%d\n",e.getKey(),e.getValue()));
        //write your code here



    }
}
