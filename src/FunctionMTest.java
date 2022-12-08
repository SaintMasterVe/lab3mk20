import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FunctionMTest {
    FunctionM func;

    @Test
    void testmathfunc() {
        func = new FunctionM(5);
        assertEquals(40, func.mathfunc());
    }

    @Test
    void testsquarex() {
        func = new FunctionM(2);
        assertEquals(4, func.squarex());
    }

    @Test
    void testsecondx() {
        func = new FunctionM(5);
        assertEquals(10, func.secondx());
    }
    @Test
    void testnegans() {
        func = new FunctionM(5);
        if(func.mathfunc()<0){
            Assertions.fail("false");
        }
    }
}