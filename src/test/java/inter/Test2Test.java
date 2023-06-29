package inter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Test2Test {

    @Test
    void wordsCount() {
        Assertions.assertEquals(Test2.wordsCount(""),0);
        Assertions.assertEquals(Test2.wordsCount(null),0);
        Assertions.assertEquals(Test2.wordsCount("test"),1);
        Assertions.assertEquals(Test2.wordsCount("testTest"),2);
        Assertions.assertEquals(Test2.wordsCount("testTestTest"),3);
        Assertions.assertEquals(Test2.wordsCount("veryThinDog"),3);
    }
}