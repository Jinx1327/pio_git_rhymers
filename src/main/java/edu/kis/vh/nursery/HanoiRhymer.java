package edu.kis.vh.nursery;

public class HanoiRhymer extends defaultCountingOutRhymer {

    int totalRejected = 0;

<<<<<<< HEAD
public int reportRejected() {
    return totalRejected;
}

public void countIn(int in) {
if (!callCheck() && in > peekaboo())
        totalRejected++;
        else
            super.countIn(in);
}
=======
    public int reportRejected() {
        return totalRejected;
    }

    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
>>>>>>> origin/format
}
