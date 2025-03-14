package edu.kis.vh.nursery;

public class HanoiRhymerZmieniona extends defaultCountingOutRhymer {

    int totalRejected = 0;

    public int reportRejectedPoprawiona() {
        return totalRejected;
    }

    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}
