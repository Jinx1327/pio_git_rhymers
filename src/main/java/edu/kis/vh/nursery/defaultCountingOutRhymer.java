package edu.kis.vh.nursery;

public static final int EMPTY_STACK_VALUE = -1;
public static final int STACK_CAPACITY = 12;

public class defaultCountingOutRhymer {

    private int[] NUMBERS = new int[STACK_CAPACITY];

    public int total = EMPTY_STACK_VALUE;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean callCheck() {
        return total == -1;
    }

    public boolean isFull() {
        return total == 11;
    }

    protected int peekaboo() {
        if (callCheck())
            return -1;
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck())
            return -1;
        return NUMBERS[total--];
    }

}
