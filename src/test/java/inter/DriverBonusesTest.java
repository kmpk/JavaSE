package inter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DriverBonusesTest {

    @Test
    void test1() {
        DriverBonuses inst = new DriverBonuses(500);
        inst.addRank(1);
        inst.addRank(1);
        inst.addRank(2);
        inst.addRank(3);
        assertEquals(3500, inst.result());
    }

    @Test
    void test2() {
        DriverBonuses inst = new DriverBonuses(500);
        inst.addRank(1);
        inst.addRank(2);
        inst.addRank(3);
        inst.addRank(2);
        inst.addRank(1);
        assertEquals(4500, inst.result());
    }

    @Test
    void test3() {
        DriverBonuses inst = new DriverBonuses(500);
        inst.addRank(1);
        inst.addRank(1);
        inst.addRank(2);
        inst.addRank(3);
        inst.addRank(2);
        inst.addRank(1);
        inst.addRank(1);
        assertEquals(5500, inst.result());
    }

    @Test
    void test4() {
        DriverBonuses inst = new DriverBonuses(500);
        inst.addRank(1);
        inst.addRank(2);
        inst.addRank(3);
        inst.addRank(3);
        assertEquals(3500, inst.result());
    }

    @Test
    void test5() {
        DriverBonuses inst = new DriverBonuses(500);
        inst.addRank(1);
        inst.addRank(1);
        inst.addRank(1);
        inst.addRank(1);
        inst.addRank(1);
        assertEquals(2500, inst.result());
    }
    @Test
    void test6() {
        DriverBonuses inst = new DriverBonuses(500);
        inst.addRank(1);
        inst.addRank(2);
        inst.addRank(1);
        inst.addRank(2);
        inst.addRank(1);
        inst.addRank(2);
        assertEquals(4500, inst.result());
    }
    @Test
    void test7() {
        DriverBonuses inst = new DriverBonuses(500);
        inst.addRank(1);
        assertEquals(500, inst.result());
    }
    @Test
    void test8() {
        DriverBonuses inst = new DriverBonuses(500);
        inst.addRank(1);
        assertEquals(500, inst.result());
    }
    @Test
    void test9() {
        DriverBonuses inst = new DriverBonuses(500);
        inst.addRank(3);
        inst.addRank(2);
        inst.addRank(1);
        inst.addRank(2);
        inst.addRank(3);
        assertEquals(5500, inst.result());
    }
    @Test
    void test10() {
        DriverBonuses inst = new DriverBonuses(500);
        inst.addRank(3);
        inst.addRank(2);
        inst.addRank(2);
        inst.addRank(3);
        assertEquals(3000, inst.result());
    }
    @Test
    void test11() {
        DriverBonuses inst = new DriverBonuses(500);
        inst.addRank(5);
        inst.addRank(4);
        inst.addRank(3);
        inst.addRank(2);
        inst.addRank(1);
        inst.addRank(1);
        assertEquals(8000, inst.result());
    }
    @Test
    void test12() {
        DriverBonuses inst = new DriverBonuses(500);
        inst.addRank(2);
        inst.addRank(1);
        inst.addRank(2);
        inst.addRank(1);
        inst.addRank(2);
        inst.addRank(1);
        assertEquals(4500, inst.result());
    }
    @Test
    void test13() {
        DriverBonuses inst = new DriverBonuses(500);
        inst.addRank(5);
        inst.addRank(4);
        inst.addRank(3);
        inst.addRank(2);
        inst.addRank(1);
        inst.addRank(0);
        assertEquals(10500, inst.result());
    }
    @Test
    void test14() {
        DriverBonuses inst = new DriverBonuses(500);
        inst.addRank(5);
        inst.addRank(4);
        inst.addRank(3);
        inst.addRank(2);
        inst.addRank(0);
        inst.addRank(1);
        inst.addRank(2);
        inst.addRank(3);
        inst.addRank(3);
        inst.addRank(3);
        assertEquals(13000, inst.result());
    }
    @Test
    void test15() {
        DriverBonuses inst = new DriverBonuses(500);
        inst.addRank(2);
        inst.addRank(1);
        inst.addRank(0);
        inst.addRank(2);
        inst.addRank(1);
        inst.addRank(0);
        inst.addRank(2);
        inst.addRank(1);
        inst.addRank(0);
        assertEquals(9000, inst.result());
    }
    @Test
    void test16() {
        DriverBonuses inst = new DriverBonuses(500);
        inst.addRank(0);
        inst.addRank(0);
        assertEquals(1000, inst.result());
    }
    @Test
    void test17() {
        DriverBonuses inst = new DriverBonuses(500);
        inst.addRank(1);
        inst.addRank(2);
        inst.addRank(3);
        inst.addRank(1);
        inst.addRank(2);
        inst.addRank(3);
        inst.addRank(1);
        inst.addRank(2);
        inst.addRank(3);
        assertEquals(9000, inst.result());
    }
    @Test
    void test18() {
        DriverBonuses inst = new DriverBonuses(500);
        inst.addRank(1);
        inst.addRank(2);
        inst.addRank(3);
        inst.addRank(1);
        inst.addRank(2);
        inst.addRank(3);
        inst.addRank(1);
        inst.addRank(2);
        inst.addRank(3);
        assertEquals(9000, inst.result());
    }
    @Test
    void test19() {
        DriverBonuses inst = new DriverBonuses(500);
        inst.addRank(1);
        inst.addRank(0);
        inst.addRank(2);
        inst.addRank(0);
        inst.addRank(3);
        inst.addRank(0);
        inst.addRank(4);
        inst.addRank(0);
        assertEquals(6000, inst.result());
    }
}