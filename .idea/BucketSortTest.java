import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

public class BucketSortTest {

    @Test
    public void testOrdenamientoConNumerosDesordenados() {
        BucketSort bucketSort = new BucketSort();
        int[] entrada = {42, 32, 33, 52, 25, 47, 51};
        int[] esperado = {25, 32, 33, 42, 47, 51, 52};

        assertArrayEquals(esperado, bucketSort.ordenamientoBucketSort(entrada));
    }

    @Test
    public void testOrdenamientoConNumerosOrdenados() {
        BucketSort bucketSort = new BucketSort();
        int[] entrada = {5, 10, 15, 20, 25};
        int[] esperado = {5, 10, 15, 20, 25};

        assertArrayEquals(esperado, bucketSort.ordenamientoBucketSort(entrada));
    }

    @Test
    public void testOrdenamientoConValoresRepetidos() {
        BucketSort bucketSort = new BucketSort();
        int[] entrada = {5, 3, 8, 3, 2, 8, 5};
        int[] esperado = {2, 3, 3, 5, 5, 8, 8};

        assertArrayEquals(esperado, bucketSort.ordenamientoBucketSort(entrada));
    }

    @Test
    public void testOrdenamientoConUnElemento() {
        BucketSort bucketSort = new BucketSort();
        int[] entrada = {4};
        int[] esperado = {4};

        assertArrayEquals(esperado, bucketSort.ordenamientoBucketSort(entrada));
    }

    @Test
    public void testOrdenamientoConArrayVacio() {
        BucketSort bucketSort = new BucketSort();
        int[] entrada = {};
        int[] esperado = {};

        assertArrayEquals(esperado, bucketSort.ordenamientoBucketSort(entrada));
    }
}
