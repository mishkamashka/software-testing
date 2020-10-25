package test;

import main.BasicLogarithm;
import main.Logarithms;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class LogarithmsTest {
    private static final double delta = 1e-5;
    static BasicLogarithm mock;
    static Logarithms logarithms;

    @BeforeAll
    static void setup() {
        mock = mock(BasicLogarithm.class);
        when(mock.ln(0.)).thenThrow(new IllegalArgumentException());
        when(mock.ln(-1.)).thenThrow(new IllegalArgumentException());
        when(mock.ln(-1000.)).thenThrow(new IllegalArgumentException());
        when(mock.ln(0.2)).thenReturn(Math.log(0.2));
        when(mock.ln(0.5)).thenReturn(Math.log(0.5));
        when(mock.ln(1.)).thenReturn(0.0);
        when(mock.ln(2.)).thenReturn(Math.log(2.0));
        when(mock.ln(4.)).thenReturn(Math.log(4.0));
        when(mock.ln(8.)).thenReturn(Math.log(8.0));
        when(mock.ln(72.)).thenReturn(Math.log(72.0));
        when(mock.ln(3.)).thenReturn(Math.log(3.0));
        when(mock.ln(5.)).thenReturn(Math.log(5.0));
        when(mock.ln(10.)).thenReturn(Math.log(10.0));
        logarithms = new Logarithms(mock);
    }

    @ParameterizedTest
    @ValueSource(doubles = {1, 2, 4, 8, 72 })
    void log3ValidValuesTest(double x) {
        Assertions.assertEquals(Math.log(x) / Math.log(3), logarithms.log3(x), delta);
    }

    @ParameterizedTest
    @ValueSource(doubles = { 0, -1, -1000})
    void log3InvalidValuesTest(double x) {
        Assertions.assertThrows(IllegalArgumentException.class, () -> logarithms.log3(x));
    }

    @ParameterizedTest
    @ValueSource(doubles = { 0.2, 0.5, 1, 2, 4, 8, 72 })
    void log10ValidValuesTest(double x) {
        Assertions.assertEquals(Math.log10(x), logarithms.log10(x), delta);
    }

    @ParameterizedTest
    @ValueSource(doubles = { 0, -1, -1000})
    void log10InvalidValuesTest(double x) {
        Assertions.assertThrows(IllegalArgumentException.class, () -> logarithms.log10(x));
    }
}
