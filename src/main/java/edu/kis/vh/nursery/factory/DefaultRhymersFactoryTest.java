package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.defaultCountingOutRhymer;
import edu.kis.vh.nursery.FIFORhymer;
import edu.kis.vh.nursery.HanoiRhymer;
import org.junit.Assert;
import org.junit.Test;

//Projekt zweryfikowany nowymi testami
//Stan: poprawny

public class DefaultRhymersFactoryTest {

    private DefaultRhymersFactory factory = new DefaultRhymersFactory();

    @Test
    public void testGetStandardRhymer() {
        defaultCountingOutRhymer rhymer = factory.GetStandardRhymer();
        Assert.assertTrue("GetStandardRhymer should return a defaultCountingOutRhymer", rhymer instanceof defaultCountingOutRhymer);
    }

    @Test
    public void testGetFalseRhymer() {
        defaultCountingOutRhymer rhymer = factory.GetFalseRhymer();
        Assert.assertTrue("GetFalseRhymer should return a defaultCountingOutRhymer", rhymer instanceof defaultCountingOutRhymer);
    }

    @Test
    public void testGetFIFORhymer() {
        defaultCountingOutRhymer rhymer = factory.GetFIFORhymer();
        Assert.assertTrue("GetFIFORhymer should return a FIFORhymer", rhymer instanceof FIFORhymer);
    }

    @Test
    public void testGetHanoiRhymer() {
        defaultCountingOutRhymer rhymer = factory.GetHanoiRhymer();
        Assert.assertTrue("GetHanoiRhymer should return a HanoiRhymer", rhymer instanceof HanoiRhymer);
    }
}
