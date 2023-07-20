package leetcode;

import org.junit.jupiter.api.Test;

import java.rmi.UnmarshalException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TextJustificationTest {
    private static TextJustification instance = new TextJustification();

    @Test
    void fullJustify() {
        assertEquals(List.of("This    is    an",
                "example  of text",
                "justification.  "),instance.fullJustify(new String[]{"This", "is", "an", "example", "of", "text", "justification."},16));
        assertEquals(List.of("What   must   be",
                "acknowledgment  ",
                "shall be        "),instance.fullJustify(new String[]{"What","must","be","acknowledgment","shall","be"},16));
         assertEquals(List.of("Science  is  what we",
                 "understand      well",
                 "enough to explain to",
                 "a  computer.  Art is",
                 "everything  else  we",
                 "do                  "),instance.fullJustify(new String[]{"Science","is","what","we","understand","well","enough","to","explain","to","a","computer.","Art","is","everything","else","we","do"},20));


    }
}