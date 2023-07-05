package inter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CanonicalQuery {

    private CanonicalQuery(){}

    public static void main(String[] args) throws IOException {
        StringBuilder builder = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            builder.append(reader.readLine().stripLeading());
            while (builder.lastIndexOf(";")!=builder.length()-1) {
                builder.append("\n");
                builder.append(reader.readLine().stripLeading());
            }
            builder.append("\n");
            System.out.println(canonize(builder.toString()));
        }
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
