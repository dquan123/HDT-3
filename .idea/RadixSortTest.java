import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

public class RadixSortTest {

    @Test
    public void testOrdenamientoConNumerosDesordenados() {
        RadixSort radixSort = new RadixSort();
        int[] entrada = {42, 32, 33, 52, 25, 47, 51};
        int[] esperado = {25, 32, 33, 42, 47, 51, 52};

        assertArrayEquals(esperado, radixSort.ordenamientoRadixSort(entrada));
    }

    @Test
    public void testOrdenamientoConNumerosOrdenados() {
        RadixSort radixSort = new RadixSort();
        int[] entrada = {5, 10, 15, 20, 25};
        int[] esperado = {5, 10, 15, 20, 25};

        assertArrayEquals(esperado, radixSort.ordenamientoRadixSort(entrada));
    }

    @Test
    public void testOrdenamientoConValoresRepetidos() {
        RadixSort radixSort = new RadixSort();
        int[] entrada = {5, 3, 8, 3, 2, 8, 5};
        int[] esperado = {2, 3, 3, 5, 5, 8, 8};

        assertArrayEquals(esperado, radixSort.ordenamientoRadixSort(entrada));
    }

    @Test
    public void testOrdenamientoConUnElemento() {
        RadixSort radixSort = new RadixSort();
        int[] entrada = {4};
        int[] esperado = {4};

        assertArrayEquals(esperado, radixSort.ordenamientoRadixSort(entrada));
    }

    @Test
    public void testOrdenamientoConArrayVacio() {
        RadixSort radixSort = new RadixSort();
        int[] entrada = {};
        int[] esperado = {};

        assertArrayEquals(esperado, radixSort.ordenamientoRadixSort(entrada));
    }
}
