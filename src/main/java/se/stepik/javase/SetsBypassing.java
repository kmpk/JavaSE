package se.stepik.javase;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class SetsBypassing {
    public static void main(String[] args) {


        Set<String> nameSet = new TreeSet<>(Arrays.asList("Mr.Green", "Mr.Yellow", "Mr.Red"));

        //write your code here
        nameSet.forEach(System.out::println);


    }
}
