package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {

    public static final int MAX_SIZE = 12;
    public static final int ERROR_VALUE = -1;
    public static final int MAX_INDEX = 11;
    private final int[] NUMBERS = new int[MAX_SIZE];

    public int total = ERROR_VALUE;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean callCheck() {
        return total == ERROR_VALUE;
    }

    public boolean isFull() {
        return total == MAX_INDEX;
    }

    protected int peekaboo() {
        if (callCheck())
            return ERROR_VALUE;
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck())
            return ERROR_VALUE;
        return NUMBERS[total--];
    }

}
