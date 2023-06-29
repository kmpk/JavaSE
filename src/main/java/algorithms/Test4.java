package algorithms;

import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test4 {
    public static void main(String[] args) {
        String s = "Никогда, никогда, никогда не нанимайте людей, не проверив их умение писать код! Я видел миллион примеров, когда человек очень круто всё говорит, но на деле не может решить даже простейшую задачу. Если вы нанимаете человека программировать и не проверяете, как он программирует — может, что-то не так?\n" +
                "Тут может быть дискуссия на тему сложности задач, но они должны быть обязательны, пусть даже тривиальные. Например, вывести наиболее часто встречающийся символ в строке. Даже по этому, казалось бы, простому заданию можно многое узнать о кандидате.";
        String s1 = s.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e->!Character.isWhitespace(e.getKey()))
                .max(Comparator.comparingLong(Map.Entry::getValue))
                .map(e -> e.getKey() + " " + e.getValue())
                .orElseThrow();
        System.out.println(s1);
    }
}
