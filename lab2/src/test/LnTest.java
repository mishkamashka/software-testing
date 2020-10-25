package test;

import main.BasicLogarithm;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LnTest {
    private static final double delta = 1e-2;
    private static final double eps = 1e-2;
    private final BasicLogarithm basicLogarithm = new BasicLogarithm();

    @Test
    public void testOne() {
        Assertions.assertEquals(Math.log(1), basicLogarithm.ln(1) , delta);
    }

    @Test
    public void testOneMinusEps() {
        Assertions.assertEquals(Math.log(1 - eps), basicLogarithm.ln(1 - eps), delta);
    }

    @Test
    public void testGreaterThanOne() {
        Assertions.assertEquals(Math.log(100), basicLogarithm.ln(100), delta);
    }

    @Test
    public void testZero() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> basicLogarithm.ln(0));
    }

    @Test
    public void testNegative() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> basicLogarithm.ln(-1));
    }
}
