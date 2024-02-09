package hackerrank.interview.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.ListIterator;

public class AltCharacters {
    public static void main(String... args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int i = Integer.parseInt(br.readLine());
            for (int j=0; j<i; j++) {
                String a = br.readLine();
                System.out.println(altChars(a));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static int altChars(String a){
        int result = 0;
        LinkedList<Character> list = new LinkedList<Character>();
        for (Character c : a.toCharArray()){
            list.add(c);
        }
        ListIterator<Character> iterator = list.listIterator();
        Character current,previous;
        previous=null;
        while (iterator.hasNext()){
            current=iterator.next();
            if (iterator.hasPrevious()&&current.equals(previous)){
                iterator.remove();
                result++;
            } else {
                previous=current;
            }
        }
        return result;
    }
}
