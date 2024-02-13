package is.hi.hbv202g.ass5;

public class IntStackMain {
    public static void main(String[] args) {
        System.out.println("Creating a new stack");
        IntStack myStack = new IntStack();
        System.out.println("isFull=" + myStack.isFull());
        System.out.println("Push: 11");
        myStack.push(11);
        System.out.println("Push: 23");
        myStack.push(23);
        System.out.println("isFull=" + myStack.isFull());
        System.out.println("Pop: "+myStack.pop());
        System.out.println("Pop: "+myStack.pop());
    }
}
