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
        for (int i = 0; i < stack.getCapacity(); i++) {
            stack.push(i);
        }

        assertTrue(stack.isFull());
    }

    @Test
    public void testNewStackIsNotFullOneOff() {
        for (int i = 0; i < stack.getCapacity()-1; i++) {
            stack.push(i);
        }

        assertFalse(stack.isFull());
    }

    @Test
    public void testPopReturnsPushedValue() {
        stack.push(pushpoptest);
        assertEquals(pushpoptest, stack.pop());
    }

    @Test (expected=ArrayIndexOutOfBoundsException.class)
    public void testEmptyStackPop() {
            stack.pop();
    }

    @Test (expected=ArrayIndexOutOfBoundsException.class)
    public void testFullStackPush() {
        for (int i = 0; i < stack.getCapacity(); i++) {
            stack.push(i);
        }
        
        stack.push(11);
    }

    @Test
    public void testNewStackIsEmpty() {
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testNewStackIsNotEmpty() {
        for (int i = 0; i < stack.getCapacity(); i++) {
            stack.push(i);
        }

        assertFalse(stack.isEmpty());
    }
}
