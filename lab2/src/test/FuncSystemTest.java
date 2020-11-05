package test;

import main.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class FuncSystemTest {
    private static final double delta = 1e-2;
    static BasicLogarithm mockBasicLogarithm;
    static Logarithms mockLogarithms;
    static BasicTrigonometry mockBasicTrigonometry;
    static Trigonometry mockTrigonometry;
    static FuncSystem system;

    @BeforeAll
    static void setup() {
        mockBasicLogarithm = mock(BasicLogarithm.class);
        mockBasicTrigonometry = mock(BasicTrigonometry.class);
        mockLogarithms = mock(Logarithms.class);
        mockTrigonometry = mock(Trigonometry.class);

        //Ox crosses
        when(mockTrigonometry.cos(-4.0221)).thenReturn();
        when(mockTrigonometry.cot(-4.0221)).thenReturn();
        when(mockTrigonometry.csc(-4.0221)).thenReturn();
        when(mockTrigonometry.sec(-4.0221)).thenReturn();
        when(mockTrigonometry.tan(-4.0221)).thenReturn();
        when(mockBasicTrigonometry.sin(-4.0221)).thenReturn();

        when(mockTrigonometry.cos(-1.1330)).thenReturn();
        when(mockTrigonometry.cot(-1.1330)).thenReturn();
        when(mockTrigonometry.csc(-1.1330)).thenReturn();
        when(mockTrigonometry.sec(-1.1330)).thenReturn();
        when(mockTrigonometry.tan(-1.1330)).thenReturn();
        when(mockBasicTrigonometry.sin(-1.1330)).thenReturn();

        when(mockTrigonometry.cos(-5.2585)).thenReturn();
        when(mockTrigonometry.cot(-5.2585)).thenReturn();
        when(mockTrigonometry.csc(-5.2585)).thenReturn();
        when(mockTrigonometry.sec(-5.2585)).thenReturn();
        when(mockTrigonometry.tan(-5.2585)).thenReturn();
        when(mockBasicTrigonometry.sin(-5.2585)).thenReturn();

        when(mockTrigonometry.cos(-5.85442)).thenReturn();
        when(mockTrigonometry.cot(-5.85442)).thenReturn();
        when(mockTrigonometry.csc(-5.85442)).thenReturn();
        when(mockTrigonometry.sec(-5.85442)).thenReturn();
        when(mockTrigonometry.tan(-5.85442)).thenReturn();
        when(mockBasicTrigonometry.sin(-5.85442)).thenReturn();

        //intervals
        when(mockTrigonometry.cos(-5.9350)).thenReturn();
        when(mockTrigonometry.cot(-5.9350)).thenReturn();
        when(mockTrigonometry.csc(-5.9350)).thenReturn();
        when(mockTrigonometry.sec(-5.9350)).thenReturn();
        when(mockTrigonometry.tan(-5.9350)).thenReturn();
        when(mockBasicTrigonometry.sin(-5.9350)).thenReturn();

        when(mockTrigonometry.cos(-5.385)).thenReturn();
        when(mockTrigonometry.cot(-5.385)).thenReturn();
        when(mockTrigonometry.csc(-5.385)).thenReturn();
        when(mockTrigonometry.sec(-5.385)).thenReturn();
        when(mockTrigonometry.tan(-5.385)).thenReturn();
        when(mockBasicTrigonometry.sin(-5.385)).thenReturn();

        when(mockTrigonometry.cos(-4.30)).thenReturn();
        when(mockTrigonometry.cot(-4.30)).thenReturn();
        when(mockTrigonometry.csc(-4.30)).thenReturn();
        when(mockTrigonometry.sec(-4.30)).thenReturn();
        when(mockTrigonometry.tan(-4.30)).thenReturn();
        when(mockBasicTrigonometry.sin(-4.30)).thenReturn();

        when(mockTrigonometry.cos(-4.110)).thenReturn();
        when(mockTrigonometry.cot(-4.110)).thenReturn();
        when(mockTrigonometry.csc(-4.110)).thenReturn();
        when(mockTrigonometry.sec(-4.110)).thenReturn();
        when(mockTrigonometry.tan(-4.110)).thenReturn();
        when(mockBasicTrigonometry.sin(-4.110)).thenReturn();

        when(mockTrigonometry.cos(-4.0350)).thenReturn();
        when(mockTrigonometry.cot(-4.0350)).thenReturn();
        when(mockTrigonometry.csc(-4.0350)).thenReturn();
        when(mockTrigonometry.sec(-4.0350)).thenReturn();
        when(mockTrigonometry.tan(-4.0350)).thenReturn();
        when(mockBasicTrigonometry.sin(-4.0350)).thenReturn();

        when(mockTrigonometry.cos(-3.8850)).thenReturn();
        when(mockTrigonometry.cot(-3.8850)).thenReturn();
        when(mockTrigonometry.csc(-3.8850)).thenReturn();
        when(mockTrigonometry.sec(-3.8850)).thenReturn();
        when(mockTrigonometry.tan(-3.8850)).thenReturn();
        when(mockBasicTrigonometry.sin(-3.8850)).thenReturn();

        when(mockTrigonometry.cos(-2.6810)).thenReturn();
        when(mockTrigonometry.cot(-2.6810)).thenReturn();
        when(mockTrigonometry.csc(-2.6810)).thenReturn();
        when(mockTrigonometry.sec(-2.6810)).thenReturn();
        when(mockTrigonometry.tan(-2.6810)).thenReturn();
        when(mockBasicTrigonometry.sin(-2.6810)).thenReturn();

        when(mockTrigonometry.cos(-1.30)).thenReturn();
        when(mockTrigonometry.cot(-1.30)).thenReturn();
        when(mockTrigonometry.csc(-1.30)).thenReturn();
        when(mockTrigonometry.sec(-1.30)).thenReturn();
        when(mockTrigonometry.tan(-1.30)).thenReturn();
        when(mockBasicTrigonometry.sin(-1.30)).thenReturn();

        //Ox crossings
        when(mockLogarithms.log3(0.370)).thenReturn();
        when(mockLogarithms.log10(0.370)).thenReturn();
        when(mockBasicLogarithm.ln(0.370)).thenReturn();

        when(mockLogarithms.log3(0.880)).thenReturn();
        when(mockLogarithms.log10(0.880)).thenReturn();
        when(mockBasicLogarithm.ln(0.880)).thenReturn();

        when(mockLogarithms.log3(0.930)).thenReturn();
        when(mockLogarithms.log10(0.930)).thenReturn();
        when(mockBasicLogarithm.ln(0.930)).thenReturn();

        when(mockLogarithms.log3(2.700)).thenReturn();
        when(mockLogarithms.log10(2.700)).thenReturn();
        when(mockBasicLogarithm.ln(2.700)).thenReturn();

        //intervals
        when(mockLogarithms.log3(0.2830)).thenReturn();
        when(mockLogarithms.log10(0.2830)).thenReturn();
        when(mockBasicLogarithm.ln(0.2830)).thenReturn();

        when(mockLogarithms.log3(0.4850)).thenReturn();
        when(mockLogarithms.log10(0.4850)).thenReturn();
        when(mockBasicLogarithm.ln(0.4850)).thenReturn();

        when(mockLogarithms.log3(1.95)).thenReturn();
        when(mockLogarithms.log10(1.95)).thenReturn();
        when(mockBasicLogarithm.ln(1.95)).thenReturn();

        when(mockLogarithms.log3(2.20)).thenReturn();
        when(mockLogarithms.log10(2.20)).thenReturn();
        when(mockBasicLogarithm.ln(2.20)).thenReturn();

        when(mockLogarithms.log3(16)).thenReturn();
        when(mockLogarithms.log10(16)).thenReturn();
        when(mockBasicLogarithm.ln(16)).thenReturn();

        system = new FuncSystem(mockBasicLogarithm, mockBasicTrigonometry, mockLogarithms, mockTrigonometry);

    }

    @Test
    void leftOxCrossingTest() {
        assertEquals(0, system.system(-4.0221), delta);
        assertEquals(0, system.system(-1.1330), delta);
        assertEquals(0, system.system(-5.2585), delta);
        assertEquals(0, system.system(-5.85442), delta);
    }

    @Test
    void leftUnreachableValueTest() {
        assertThrows(IllegalArgumentException.class, () -> system.system(0));
    }

    @Test
    void leftIntervalsTest() {
        assertEquals(-42.08, system.system(-5.9350), delta);
        assertEquals(-3.38, system.system(-5.385), delta);
        assertEquals(2.85, system.system(-4.30), delta);
        assertEquals(1.94, system.system(-4.110), delta);
        assertEquals(-0.0480, system.system(-4.0350), delta);
        assertEquals(0.0251, system.system(-3.8850), delta);
        assertEquals(1.0010, system.system(-2.6810), delta);
        assertEquals(7.79, system.system(-1.30), delta);
    }

    @Test
    void rightOxCrossingTest() {
        assertEquals(0, system.system(0.370), delta);
        assertEquals(0, system.system(0.880), delta);
        assertEquals(0, system.system(0.930), delta);
        assertEquals(0, system.system(2.700), delta);
    }

    @Test
    void rightIntervalsTest() {
        assertEquals(0.0384, system.system(0.2830), delta);
        assertEquals(0.0027, system.system(0.4850), delta);
        assertEquals(0.0026, system.system(1.95), delta);
        assertEquals(0.0024, system.system(2.20), delta);
        assertEquals(113.465, system.system(16), delta);
    }

}
