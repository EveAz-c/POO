
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ArrayOperationsTest {

    @Test
    public void testArrayVacio() {
        int[] x = {};

        assertEquals(0, ArrayOperations.numZero(x));
    }

    @Test
    public void testSinCeros() {
        int[] x = {1, 2, 3, 4, 5};

        assertEquals(0, ArrayOperations.numZero(x));
    }

    @Test
    public void testCeroPrimeraPosicion() {
        int[] x = {0, 2, 3, 4};

        assertEquals(1, ArrayOperations.numZero(x));
    }

    @Test
    public void testCerosIntermedios() {
        int[] x = {1, 0, 3, 0, 5};

        assertEquals(2, ArrayOperations.numZero(x));
    }

    @Test
    public void testArrayNulo() {
        int[] x = null;

        assertThrows(NullPointerException.class,
                () -> ArrayOperations.numZero(x));
    }
}
