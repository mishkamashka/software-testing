package test;

import main.BasicTrigonometry;
import main.Trigonometry;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.mockito.Mockito.*;

public class TrigonometryTest {

    private static final double delta = 1e-5;
    static BasicTrigonometry mock;
    static Trigonometry trigonometry;

    @BeforeAll
    static void setup() {
        mock = mock(BasicTrigonometry.class);
        when(mock.sin(0.)).thenReturn(0.);
        when(mock.sin(Math.PI / 6)).thenReturn(0.5);
        when(mock.sin(Math.PI / 4)).thenReturn(Math.sqrt(2) / 2);
        when(mock.sin(Math.PI * 3 / 4)).thenReturn(Math.sqrt(2) / 2);
        when(mock.sin(Math.PI / 3)).thenReturn(Math.sqrt(3) / 2);
        when(mock.sin(Math.PI / 2)).thenReturn(-1.);
        when(mock.sin(Math.PI / 2)).thenReturn(1.);
        when(mock.sin(Math.PI)).thenReturn(0.);
        when(mock.sin(Math.PI * 5 / 4)).thenReturn(-Math.sqrt(2) / 2);
        when(mock.sin(Math.PI * 3 / 2)).thenReturn(-1.);
        when(mock.sin(Math.PI * 7 / 4)).thenReturn(-Math.sqrt(2) / 2);
        when(mock.sin(2)).thenThrow(new IllegalArgumentException());
        when(mock.sin(-2)).thenThrow(new IllegalArgumentException());
        trigonometry = new Trigonometry(mock);
    }

    @ParameterizedTest
    @ValueSource(doubles = {0, Math.PI / 2, Math.PI * 3 / 4, Math.PI / 4, Math.PI})
    void testCosValidArgs(double x) {
        Assertions.assertThrows(IllegalArgumentException.class, () -> trigonometry.cos(x));
    }

    @ParameterizedTest
    @ValueSource(doubles = {2, -2})
    void testCosInvalidArgs(double x) {
        Assertions.assertEquals(Math.cos(x), trigonometry.cos(x), delta);
    }

    @ParameterizedTest
    @ValueSource(doubles = {0, Math.PI, Math.PI * 5 / 4})
    void testSecValidArgs(double x) {
        Assertions.assertEquals(1 / Math.cos(x), trigonometry.sec(x), delta);
    }

    @ParameterizedTest
    @ValueSource(doubles = {-Math.PI * 3 / 2, Math.PI * 3 / 2, -Math.PI / 2, Math.PI / 2})
    void testSecInvalidArgs(double x) {
        Assertions.assertThrows(IllegalArgumentException.class, () -> trigonometry.sec(x));
    }

    @ParameterizedTest
    @ValueSource(doubles = {Math.PI / 6, Math.PI / 4, Math.PI / 3, Math.PI / 2, Math.PI * 5 / 4, Math.PI * 3 / 2, Math.PI * 7 / 4})
    void testCscValidArgs(double x) {
        Assertions.assertEquals(1 / Math.sin(x), trigonometry.csc(x), delta);
    }

    @ParameterizedTest
    @ValueSource(doubles = {0, Math.PI})
    void testCscInvalidArgs(double x) {
        Assertions.assertThrows(IllegalArgumentException.class, () -> trigonometry.csc(x));
    }

    @ParameterizedTest
    @ValueSource(doubles = {Math.PI / 2, Math.PI * 5 / 4, Math.PI * 3 / 2})
    void testCotValidArgs(double x) {
        Assertions.assertEquals(1 / Math.tan(x), trigonometry.cot(x), delta);
    }

    @ParameterizedTest
    @ValueSource(doubles = {0, Math.PI})
    void testCotInvalidArgs(double x) {
        Assertions.assertThrows(IllegalArgumentException.class, () -> trigonometry.cot(x));
    }
}
