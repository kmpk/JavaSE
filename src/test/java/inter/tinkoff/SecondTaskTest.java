package inter.tinkoff;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SecondTaskTest {

    @Test
    void countPossibleSheriffs() {
        assertEquals(2,SecondTask.countSheriffs("fheriherffazfszkisrrs"));
        assertEquals(1,SecondTask.countSheriffs("rifftratatashe"));
        assertEquals(0,SecondTask.countSheriffs("sherifasdasdasd"));
        assertEquals(6,SecondTask.countSheriffs("sheriffsheriffsheriffsheriffsheriffsheriffsherif"));
    }
}