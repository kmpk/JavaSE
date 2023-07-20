package leetcode;

import java.util.ArrayList;
import java.util.List;

public class TextJustification {
    private List<String> result;
    private List<String> currentWords = new ArrayList<>();
    private int currentWidth = 0;

    private int maxWidth;

    public List<String> fullJustify(String[] words, int maxWidth) {
        result = new ArrayList<>();
        this.maxWidth = maxWidth;
        for (String s : words) {
            processNextWord(s);
        }
        if (!currentWords.isEmpty()) {
            result.add(justifyLeft(currentWords));
        }
        clear();
        return result;
    }

    private void processNextWord(String s) {
        if (currentWords.isEmpty()) {
            currentWords.add(s);
            currentWidth += s.length();
            if (currentWidth == maxWidth) {
                result.add(s);
                clear();
            }
        } else {
            if (currentWidth + 1 + s.length() > maxWidth) {
                result.add(justify(currentWords));
                clear();
                processNextWord(s);
                return;
            }
            if (currentWidth + 1 + s.length() == maxWidth) {
                currentWords.add(s);
                result.add(justify(currentWords));
                clear();
            } else {
                currentWidth += 1 + s.length();
                currentWords.add(s);
            }
        }
    }

    private void clear() {
        currentWords.clear();
        currentWidth = 0;
    }

    private String justify(List<String> words) {
        if (words.size() == 1) {
            return justifyLeft(words);
        }
        List<String> spaces = new ArrayList<>();
        int currentLength = words.stream().mapToInt(String::length).sum() + words.size() - 1;
        for (int i = 0; i < words.size() - 1; i++) {
            spaces.add(" ");
        }
        int i = 0;
        while (currentLength != maxWidth) {
            if (i== spaces.size()){
                i=0;
            }
            spaces.set(i, spaces.get(i) + " ");
            currentLength++;
            i++;
        }

        StringBuilder builder = new StringBuilder();
        for (int j = 0; j < words.size(); j++) {
            builder.append(words.get(j));
            if (j < spaces.size()) {
                builder.append(spaces.get(j));
            }
        }
        return builder.toString();
    }

    private String justifyLeft(List<String> words) {
        StringBuilder builder = new StringBuilder();
        for (String word : words) {
            builder.append(word).append(" ");
        }
        while (builder.length() > maxWidth) {
            builder.deleteCharAt(builder.lastIndexOf(" "));
        }
        while (builder.length() < maxWidth) {
            builder.append(" ");
        }
        return builder.toString();
    }
}
