package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {

    private static final int MAX_SIZE = 12;
    private static final int EMPTY = -1;
    private static final int DEFAULT_VALUE = -1;


    private final int[] NUMBERS = new int[MAX_SIZE];

    public int total = EMPTY;

    public int getTotal() {
		return total;
	}

	public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean callCheck() {
        return total == DEFAULT_VALUE;
    }

    public boolean isFull() {
        return total == (MAX_SIZE - 1);
    }

    protected int peekaboo() {
        if (callCheck())
            return EMPTY;
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck())
            return EMPTY;
        return NUMBERS[total--];
    }

}
