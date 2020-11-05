package test;

import main.BasicTrigonometry;
import  org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SinTest {
    private static final double delta = 1e-2;
    private static final double eps = 1e-2;
    private final BasicTrigonometry basicTrigonometry = new BasicTrigonometry();

    @Test
    public void testOne() {
        Assertions.assertEquals(Math.sin(1), basicTrigonometry.sin(1) , delta);
    }

    @Test
    public void testMinusOne() {
        Assertions.assertEquals(Math.sin(-1), basicTrigonometry.sin(-1), delta);
    }

    @Test
    public void testMinusOnePlusEps() {
        Assertions.assertEquals(Math.sin(-1 + eps), basicTrigonometry.sin(-1 + eps), delta);
    }

    @Test
    public void testOneMinusEps() {
        Assertions.assertEquals(Math.sin(1 - eps), basicTrigonometry.sin(1 - eps), delta);
    }

    @Test
    public void testZero() {
        Assertions.assertEquals(Math.sin(0), basicTrigonometry.sin(0), delta);
    }

    @Test
    public void testGreaterThanOne() {
        Assertions.assertEquals(Math.sin(1 + eps), basicTrigonometry.sin(1 + eps));
    }

    @Test
    public void testLessThanMinusOne(){
        Assertions.assertEquals(Math.sin(- 1 - eps), basicTrigonometry.sin(- 1 - eps));
    }
}
