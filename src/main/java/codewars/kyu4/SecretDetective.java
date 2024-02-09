package codewars.kyu4;

import java.util.*;

public class SecretDetective {
    public String recoverSecret(char[][] triplets) {
        if (triplets.length == 0) {
            return "";
        }
        Map<Character, SecretCharacter> secretCharactersMap = new HashMap<>();
        for (char[] triplet : triplets) {
            SecretCharacter left = secretCharactersMap.computeIfAbsent(triplet[0], SecretCharacter::new);
            left.addRight(triplet[1]);
            left.addRight(triplet[2]);
            SecretCharacter middle = secretCharactersMap.computeIfAbsent(triplet[1], SecretCharacter::new);
            middle.addLeft(triplet[0]);
            middle.addRight(triplet[2]);
            SecretCharacter right = secretCharactersMap.computeIfAbsent(triplet[2], SecretCharacter::new);
            right.addLeft(triplet[0]);
            right.addLeft(triplet[1]);
        }
        Set<SecretCharacter> set = new HashSet<>(secretCharactersMap.values());
        StringBuilder leftResult = new StringBuilder();
        StringBuilder rightResult = new StringBuilder();
        while (!set.isEmpty()) {
            for (int i = 0; i < leftResult.length()+1; i++) {
                char[] toFind = leftResult.substring(i).toCharArray();
                Optional<SecretCharacter> opChar = set.stream()
                        .filter(c -> c.isLeftOnly(toFind))
                        .findAny();
                if (opChar.isPresent()) {
                    leftResult.append(opChar.get().getCharacter());
                    set.remove(opChar.get());
                    break;
                }
            }
            for (int i = 0; i < rightResult.length()+1; i++) {
                char[] toFind = rightResult.substring(0, rightResult.length() - i).toCharArray();
                Optional<SecretCharacter> opChar = set.stream()
                        .filter(c -> c.isRightOnly(toFind))
                        .findAny();
                if (opChar.isPresent()) {
                    rightResult.insert(0, opChar.get().getCharacter());
                    set.remove(opChar.get());
                    break;
                }
            }
        }
        return leftResult.append(rightResult).toString();
    }
}

class SecretCharacter {
    private final char character;
    private final Set<Character> left;
    private final Set<Character> right;

    public SecretCharacter(char character) {
        this.character = character;
        left = new HashSet<>();
        right = new HashSet<>();
    }

    public char getCharacter() {
        return character;
    }

    public void addLeft(char c) {
        left.add(c);
    }

    public void addRight(char c) {
        right.add(c);
    }

    public boolean isLeftOnly(char... chars) {
        if (left.size() != chars.length) {
            return false;
        }
        for (char c : chars) {
            if (!left.contains(c)) {
                return false;
            }
        }
        return true;
    }

    public boolean isRightOnly(char... chars) {
        if (right.size() != chars.length) {
            return false;
        }
        for (char c : chars) {
            if (!right.contains(c)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SecretCharacter)) return false;
        SecretCharacter that = (SecretCharacter) o;
        return character == that.character;
    }

    @Override
    public int hashCode() {
        return Objects.hash(character);
    }
}
