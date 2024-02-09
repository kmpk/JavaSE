package inter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CanonicalQuery {

    private CanonicalQuery(){}

    public static void main(String[] args) throws IOException {
//        StringBuilder builder = new StringBuilder();
//        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
//
//            builder.append(reader.readLine().stripLeading());
//            while (builder.lastIndexOf(";")!=builder.length()-1) {
//                builder.append("\n");
//                builder.append(reader.readLine().stripLeading());
//            }
//            builder.append("\n");
//            System.out.println(canonize(builder.toString()));
//        }

        var val1 = new AtomicLong(0);
        IntStream.iterate(1, i->1).limit(100).parallel().forEach(i->val1.incrementAndGet());
        System.out.println(val1);
        long[] val2 = {0};
        IntStream.iterate(1, i->1).limit(100).parallel().forEach(i->++val2[0]);
        System.out.println(val2[0]);

        Predicate<String> predicate = s-> s.startsWith("g");
//        System.out.println(Stream.generate(()->"growl!").allMatch(predicate));
//        System.out.println(Stream.generate(()->"growl!").allMatch(predicate));
        System.out.println(Stream.iterate("",s->s+"1").limit(2).map(s->s+"2"));

        String[] vals = {"123","Abb","aab"};
        Arrays.sort(vals,(a,b)->b.toLowerCase().compareTo(a.toLowerCase()));
        System.out.println(Arrays.toString(vals));

    }

    public static String canonize(String query) {
        return query.toLowerCase()
                .replace("\n", " ")
                .replaceAll("\".+?\"", "?")
                .replaceAll("\\s+in\\s+\\(.+?\\)", " in (...)")
                .replaceAll("\\(\\s+", "(")
                .replaceAll("\\s+\\)", ")")
                .replaceAll("\\s+", " ")
                .stripTrailing();
    }
}
