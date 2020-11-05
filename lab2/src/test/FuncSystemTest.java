package test;

import main.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class FuncSystemTest {
    private static final double delta = 1e-5;
    static BasicLogarithm mockLogarithms;
    static Logarithms logarithms;
    static BasicTrigonometry mockTrigonometry;
    static Trigonometry trigonometry;
    static FuncSystem system;

    @BeforeAll
    static void setup() {
//        trigonometryFuncMock = mock(TrigonometryFunctions.class);
//        logNFuncMock = mock(LogNFunctions.class);
//
//        when(trigonometryFuncMock.tan(-PI/4, EPSILON)).thenReturn(-1.);
//        when(trigonometryFuncMock.sec(-PI/4, EPSILON)).thenReturn(Math.sqrt(2));
//        when(trigonometryFuncMock.cos(-PI/4, EPSILON)).thenReturn(1/Math.sqrt(2));
//
//        when(trigonometryFuncMock.tan(-3.5, EPSILON)).thenReturn(tan(-3.5));
//        when(trigonometryFuncMock.sec(-3.5, EPSILON)).thenReturn(-1.06786);
//        when(trigonometryFuncMock.cos(-3.5, EPSILON)).thenReturn(cos(-3.5));
//
//        when(trigonometryFuncMock.tan(-5.8, EPSILON)).thenReturn(tan(-5.8));
//        when(trigonometryFuncMock.sec(-5.8, EPSILON)).thenReturn(1.12928);
//        when(trigonometryFuncMock.cos(-5.8, EPSILON)).thenReturn(cos(-5.8));
//
//        when(trigonometryFuncMock.tan(-4.2, EPSILON)).thenReturn(tan(-4.2));
//        when(trigonometryFuncMock.sec(-4.2, EPSILON)).thenReturn(-2.03973);
//        when(trigonometryFuncMock.cos(-4.2, EPSILON)).thenReturn(cos(-4.2));
//
//
//        when(logNFuncMock.log(1.1,EPSILON, E)).thenReturn(log(1.1));
//        when(logNFuncMock.log(1.1,EPSILON, 2)).thenReturn(0.137504);
//        when(logNFuncMock.log(1.1,EPSILON, 3)).thenReturn(0.08675);
//        when(logNFuncMock.log(1.1,EPSILON, 5)).thenReturn(0.0592195);
//        when(logNFuncMock.log(1.1,EPSILON, 10)).thenReturn(0.04139);
//
//        when(logNFuncMock.log(0.5,EPSILON, E)).thenReturn(log(0.5));
//        when(logNFuncMock.log(0.5,EPSILON, 2)).thenReturn(-1.);
//        when(logNFuncMock.log(0.5,EPSILON, 3)).thenReturn(-0.630930);
//        when(logNFuncMock.log(0.5,EPSILON, 5)).thenReturn(-0.430677);
//        when(logNFuncMock.log(0.5,EPSILON, 10)).thenReturn(-0.301030);
//
//        when(logNFuncMock.log(2.1,EPSILON, E)).thenReturn(log(2.1));
//        when(logNFuncMock.log(2.1,EPSILON, 2)).thenReturn(1.07039);
//        when(logNFuncMock.log(2.1,EPSILON, 3)).thenReturn(0.675340);
//        when(logNFuncMock.log(2.1,EPSILON, 5)).thenReturn(0.460992);
//        when(logNFuncMock.log(2.1,EPSILON, 10)).thenReturn(0.322219);
//
//
//        equationSystem = new EquationSystem(trigonometryFuncMock, logNFuncMock);
    }

    @Test
    void leftOxCrossingTest() {
        assertEquals(0, system.system(5.8520), delta);
        assertEquals(0, system.system(-5.2584), delta);
        assertEquals(0, system.system(-4.0221), delta);
    }

    @Test
    void rightOxCrossingTest() {
        assertEquals(0, system.system(0.3680), delta);
        assertEquals(0, system.system(2.6558), delta);
        assertEquals(0, system.system(2.7697), delta);
    }

    @Test
    void leftUnreachableValueTest() {
        assertThrows(IllegalArgumentException.class, () -> system.system(-4.0840));
    }

    @Test
    void leftInflexionPointsTest() {
        assertEquals(1.3203, system.system(-4.1514), delta);
        assertEquals(0.0422, system.system(-3.9720), delta);
        assertEquals(0.0193, system.system(-3.8290), delta);
    }

    @Test
    void leftIntervalsTest() {
        assertEquals(0.0480, system.system(-4.0350), delta);
        assertEquals(0.0251, system.system(-3.8850), delta);
        assertEquals(1.0010, system.system(-2.6810), delta);
    }




//    @Test
//    void funcLogIncreaseLessOneTest() {
//        assertEquals(-4.63967, equationSystem.func1(0.5, EPSILON), DELTA);
//    }
//
//    @Test
//    void funcLogIncreaseMoreOneTest() {
//        assertEquals(6.51623, equationSystem.func1(2.1, EPSILON), DELTA);
//    }
//
//
//
//
//    @Test
//    void funcTrigonometryIncreaseSectionTest(){
//        assertEquals(0.85355, equationSystem.func2(-PI/4, EPSILON), DELTA);
//        assertEquals(0.24811, equationSystem.func2(-3.5, EPSILON), DELTA);
//    }
}
