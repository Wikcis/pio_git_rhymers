package edu.kis.vh.nursery;

/**
 * The DefaultCountingOutRhymer class represents a stack of numbers.
 */
public class DefaultCountingOutRhymer {

    private static final int NUMBERS_AMOUNT = 12;
    private static final int INITIAL_TOTAL = -1;
    private static final int ERROR = -1;
    private final int[] numbers = new int[NUMBERS_AMOUNT];

    private int total = INITIAL_TOTAL;
    /**
     * @return number of elements in stack
     */
    public int getTotal() {
        return total;
    }
    /**
     * inserts value to stack
     * @param in - value to insert
     */
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }
    /**
     * Checks if the stack is empty.
     * @return true if stack is empty and false if stack is not empty.
     */
    public boolean callCheck() {
        return total == ERROR;
    }
    /**
     * Checks if the stack is full.
     * @return true if stack is full and false if it is not.
     */
    public boolean isFull() {
        return total == NUMBERS_AMOUNT+INITIAL_TOTAL;
    }
    /**
     * Returns the value of the top element on the stack without removing it.
     * @return The value of the top element on the stack.
     */
    protected int peekaboo() {
        if (callCheck())
            return ERROR;
        return numbers[total];
    }
    /**
     * Returns the value of the top element on the stack and removes it.
     * @return The value of the top element on the stack.
     */
    public int countOut() {
        if (callCheck())
            return ERROR;
        return numbers[total--];
    }

}
