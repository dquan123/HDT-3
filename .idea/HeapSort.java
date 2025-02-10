public class HeapSort {

    // Método principal que implementa Heap Sort
    public int[] ordenamientoHeapSort(int[] vector) {
        int n = vector.length;

        // Construcción del heap (reorganización del arreglo)
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(vector, n, i);
        }

        // Extraer elementos del heap uno por uno
        for (int i = n - 1; i >= 0; i--) {
            // Mover la raíz actual al final
            int temporal = vector[0];
            vector[0] = vector[i];
            vector[i] = temporal;

            // Llamar a heapify en el subárbol reducido
            heapify(vector, i, 0);
        }

        return vector; // Retornar el vector ordenado
    }

    // Método auxiliar para mantener la propiedad del heap
    private void heapify(int[] vector, int n, int i) {
        int mayor = i; // Inicializar el nodo más grande como la raíz
        int izquierdo = 2 * i + 1; // Hijo izquierdo
        int derecho = 2 * i + 2; // Hijo derecho

        // Si el hijo izquierdo es mayor que la raíz
        if (izquierdo < n && vector[izquierdo] > vector[mayor]) {
            mayor = izquierdo;
        }

        // Si el hijo derecho es mayor que el mayor actual
        if (derecho < n && vector[derecho] > vector[mayor]) {
            mayor = derecho;
        }

        // Si el mayor no es la raíz, intercambiar y seguir ajustando el heap
        if (mayor != i) {
            int temporal = vector[i];
            vector[i] = vector[mayor];
            vector[mayor] = temporal;

            // Llamar recursivamente a heapify para asegurar la propiedad del heap
            heapify(vector, n, mayor);
        }
    }
}

