package is.hi.hbv202g.ass5;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class IntStackTest {

    private IntStack stack;
    private int pushpoptest;

    @Before
    public void constructNewStackTestObjects() {
        stack = new IntStack();

        pushpoptest = 7;
    }
    
    @Test
    public void testNewStackIsNotFull() {
        assertFalse(stack.isFull());
    }

    @Test
    public void testNewStackIsFull() {
        int cap = stack.getCapacity();

        for (int i = 0; i < cap; i++) {
            stack.push(i);
        }

        assertTrue(stack.isFull());
    }

    @Test
    public void testNewStackIsNotFullOneOff() {
        int cap = stack.getCapacity();

        for (int i = 0; i < cap-1; i++) {
            stack.push(i);
        }

        assertFalse(stack.isFull());
    }

    @Test
    public void testPopReturnsPushedValue() {
        stack.push(pushpoptest);
        assertEquals(pushpoptest, stack.pop());
    }


}
