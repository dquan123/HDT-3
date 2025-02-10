public class QuickSort {

    // Método principal que inicia el Quick Sort
    public int[] ordenamientoQuickSort(int[] vector) {
        // Llama al método recursivo para ordenar el vector
        quickSortRecursivo(vector, 1, vector.length - 1);
        return vector;
    }

    // Método recursivo que implementa Quick Sort
    private void quickSortRecursivo(int[] vector, int inicio, int fin) {
        if (inicio < fin) {
            // Obtiene el índice del pivote después de la partición
            int indiceParticion = particion(vector, inicio, fin);
            // Llama recursivamente a Quick Sort en los subarrays izquierdo y derecho
            quickSortRecursivo(vector, inicio, indiceParticion - 1);
            quickSortRecursivo(vector, indiceParticion + 1, fin);
        }
    }

    // Método que realiza la partición del array
    private int particion(int[] vector, int inicio, int fin) {
        int pivote = vector[fin]; // Se elige el último elemento como pivote
        int indiceMenor = inicio - 1; // Índice del menor elemento

        // Recorre el subvector y coloca los elementos menores al pivote a la izquierda
        for (int j = inicio; j < fin; j++) {
            if (vector[j] <= pivote) {
                indiceMenor++;
                // Intercambia los elementos
                int temporal = vector[indiceMenor];
                vector[indiceMenor] = vector[j];
                vector[j] = temporal;
            }
        }

        // Coloca el pivote en su posición correcta en el array ordenado
        int temporal = vector[indiceMenor + 1];
        vector[indiceMenor + 1] = vector[fin];
        vector[fin] = temporal;

        // Retorna la posición final del pivote
        return indiceMenor + 1;
    }
}
