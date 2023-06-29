package se.codewars.kyu6;

public class PangramChecker {
    public boolean check(String sentence) {
        return sentence.chars()
                .mapToObj(c -> (char) c)
                .filter(Character::isLetter)
                .map(Character::toLowerCase)
                .distinct()
                .count() == 26;
    }
}
