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
    @Test
    public void nLess(){
        func = new FunctionM(5);
        boolean check = func.mathfunc() < 2147483647;
        assertEquals(true, check);
    }

    @Test
    public void xLess(){
        func = new FunctionM(5);
        boolean check = func.squarex() < 2147483647;
        assertEquals(true, check);
    }
    @Test
    public void nMore(){
        func = new FunctionM(5);
        boolean check = func.secondx() > -2147483647;
        assertEquals(true, check);
    }

    @Test
    public void xMore(){
        func = new FunctionM(5);
        boolean check = func.mathfunc() > -2147483647;
        assertEquals(true, check);
    }

    @Test
    public void functionCheckWrongResult(){
        assertNotEquals(30, func.mathfunc(),0.5);
    }

    @Test
    public void xNotNull(){
        func = new FunctionM(5);
        boolean check = func.secondx() != 0;
        assertEquals(true, check);
    }
}