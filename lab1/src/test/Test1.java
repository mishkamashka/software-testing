package test;

import main.task1.ArcsinCalculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Test1 {
    private static final double delta = 1e-2;
    private static final double eps = 1e-2;

    @Test
    public void testOne() {
        assertEquals(Math.asin(1), ArcsinCalculator.arcsin(1), delta);
    }

    @Test
    public void testMinusOne() {
        assertEquals(Math.asin(-1), ArcsinCalculator.arcsin(-1), delta);
    }

    @Test
    public void testMinusOnePlusEps() {
        assertEquals(Math.asin(-1 + eps), ArcsinCalculator.arcsin(-1 + eps), delta);
    }

    @Test
    public void testOneMinusEps() {
        assertEquals(Math.asin(1 - eps), ArcsinCalculator.arcsin(1 - eps), delta);
    }

    @Test
    public void testZero() {
        assertEquals(Math.asin(0), ArcsinCalculator.arcsin(0), delta);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGreaterThanOne() {
        ArcsinCalculator.arcsin(1 + eps);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testLessThanMinusOne(){
        ArcsinCalculator.arcsin(-1 - eps);
    }

}
