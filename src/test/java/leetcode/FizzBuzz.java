package leetcode;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        return IntStream.rangeClosed(1, n)
                .mapToObj(this::getFizzBuzzString)
                .collect(Collectors.toList());
    }

    private String getFizzBuzzString(int i) {
        StringBuilder builder = new StringBuilder();
        if (i % 3 == 0) {
            builder.append("Fizz");
        }
        if (i % 5 == 0) {
            builder.append("Buzz");
        }
        if (builder.length()==0) {
            builder.append(i);
        }
        return builder.toString();
    }
}
