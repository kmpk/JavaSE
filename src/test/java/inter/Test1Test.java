package inter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Test1Test {

    @Test
    void trucksAndCargo() {
        Assertions.assertEquals(Test1.trucksAndCargo(10,20,22),"2");
        Assertions.assertEquals(Test1.trucksAndCargo(Integer.MIN_VALUE,20,Integer.MIN_VALUE+1),"1");
        Assertions.assertEquals(Test1.trucksAndCargo(20,10,22),"1");
    }
}