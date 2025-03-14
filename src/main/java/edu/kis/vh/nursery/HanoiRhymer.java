package edu.kis.vh.nursery;

public class HanoiRhymerZmieniona extends defaultCountingOutRhymer {

    int totalRejectedModify = 0;

    public int reportRejectedPoprawiona() {
        return totalRejected;
    }

    public void countInPoprawiona(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}
