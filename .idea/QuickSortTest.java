import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

public class QuickSortTest {

    @Test
    public void testOrdenamientoConNumerosDesordenados() {
        QuickSort quickSort = new QuickSort();
        int[] entrada = {42, 32, 33, 52, 25, 47, 51};
        int[] esperado = {25, 32, 33, 42, 47, 51, 52};

        assertArrayEquals(esperado, quickSort.ordenamientoQuickSort(entrada));
    }

    @Test
    public void testOrdenamientoConNumerosOrdenados() {
        QuickSort quickSort = new QuickSort();
        int[] entrada = {5, 10, 15, 20, 25};
        int[] esperado = {5, 10, 15, 20, 25};

        assertArrayEquals(esperado, quickSort.ordenamientoQuickSort(entrada));
    }

    @Test
    public void testOrdenamientoConValoresRepetidos() {
        QuickSort quickSort = new QuickSort();
        int[] entrada = {5, 3, 8, 3, 2, 8, 5};
        int[] esperado = {2, 3, 3, 5, 5, 8, 8};

        assertArrayEquals(esperado, quickSort.ordenamientoQuickSort(entrada));
    }

    @Test
    public void testOrdenamientoConUnElemento() {
        QuickSort quickSort = new QuickSort();
        int[] entrada = {4};
        int[] esperado = {4};

        assertArrayEquals(esperado, quickSort.ordenamientoQuickSort(entrada));
    }

    @Test
    public void testOrdenamientoConArrayVacio() {
        QuickSort quickSort = new QuickSort();
        int[] entrada = {};
        int[] esperado = {};

        assertArrayEquals(esperado, quickSort.ordenamientoQuickSort(entrada));
    }
}
