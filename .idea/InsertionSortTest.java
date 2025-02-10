import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

public class InsertionSortTest {

    @Test
    public void testOrdenamientoConNumerosDesordenados() {
        InsertionSort insertionSort = new InsertionSort();
        int[] entrada = {42, 32, 33, 52, 25, 47, 51};
        int[] esperado = {25, 32, 33, 42, 47, 51, 52};

        assertArrayEquals(esperado, insertionSort.ordenamientoPorInsercion(entrada));
    }

    @Test
    public void testOrdenamientoConNumerosOrdenados() {
        InsertionSort insertionSort = new InsertionSort();
        int[] entrada = {5, 10, 15, 20, 25};
        int[] esperado = {5, 10, 15, 20, 25};

        assertArrayEquals(esperado, insertionSort.ordenamientoPorInsercion(entrada));
    }

    @Test
    public void testOrdenamientoConValoresRepetidos() {
        InsertionSort insertionSort = new InsertionSort();
        int[] entrada = {5, 3, 8, 3, 2, 8, 5};
        int[] esperado = {2, 3, 3, 5, 5, 8, 8};

        assertArrayEquals(esperado, insertionSort.ordenamientoPorInsercion(entrada));
    }

    @Test
    public void testOrdenamientoConUnElemento() {
        InsertionSort insertionSort = new InsertionSort();
        int[] entrada = {4};
        int[] esperado = {4};

        assertArrayEquals(esperado, insertionSort.ordenamientoPorInsercion(entrada));
    }

    @Test
    public void testOrdenamientoConArrayVacio() {
        InsertionSort insertionSort = new InsertionSort();
        int[] entrada = {};
        int[] esperado = {};

        assertArrayEquals(esperado, insertionSort.ordenamientoPorInsercion(entrada));
    }
}
