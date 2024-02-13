package is.hi.hbv202g.ass5;

/**
 * A very simple stack for storing the basic type int.
 * The stack has a fixed capacity.
 */
public class IntStack {
    /**
     * The maximum capacity of the stack.
     * This value is fixed.
     */
    private final int theCapacity = 10;

    /**
     * The data structure used to store the stack.
     * Private, i.e. do not make any assumptions on how the stack is stored.
     */
    private int[] theStack;

    /**
     * The location in theStack array where next push will insert.
     * 0 means: stack is empty
     */
    private int nextPushLocation; // .

    /**
     * Constructs an empty stack.
     */
    public IntStack() {
        theStack = new int[theCapacity];
        nextPushLocation = 0;
    }

    /**
     * Returns the capacity of the stack.
     * @return the capacity of the stack
     */
    public int getCapacity() {
        return theCapacity;
    }

    /**
     * Returns whether the stack is full.
     * A further push would throw an exception.
     * @return true if the stack is full, false if the stack is not full
     */
    public boolean isFull() {
        if (nextPushLocation == theCapacity) {
            return true;
        } else {
            return false;
        }
    }

    // TODO: Add isEmpty() method

    /**
     * Pushes an int on the stack.
     * @param element the int to be pushed on the stack
     * @throws ArrayIndexOutOfBoundsException if the stack was already full. (Note that this is an unchecked exception, i.e. you do not need to catch it.) 
     */
    public void push(int element) throws ArrayIndexOutOfBoundsException {
        theStack[nextPushLocation++] = element;
    }

    /**
     * Pops an int from the stack
     * @return the popped int
     * @throws ArrayIndexOutOfBoundsException if the stack was already empty. (Note that this is an unchecked exception, i.e. you do not need to catch it.) 
     */
    public int pop() throws ArrayIndexOutOfBoundsException {
        return theStack[--nextPushLocation];
    }

}
