public class QuickSort {

    public int[] ordenamientoQuickSort(int[] vector) {
        quickSortRecursivo(vector, 1, vector.length - 1);
        return vector;
    }

    private void quickSortRecursivo(int[] vector, int inicio, int fin) {
        if (inicio < fin) {
            int indiceParticion = particion(vector, inicio, fin);
            quickSortRecursivo(vector, inicio, indiceParticion - 1);
            quickSortRecursivo(vector, indiceParticion + 1, fin);
        }
    }

    private int particion(int[] vector, int inicio, int fin) {
        int pivote = vector[fin];
        int indiceMenor = inicio - 1;
        for (int j = inicio; j < fin; j++) {
            if (vector[j] <= pivote) {
                indiceMenor++;
                int temporal = vector[indiceMenor];
                vector[indiceMenor] = vector[j];
                vector[j] = temporal;
            }
        }
        int temporal = vector[indiceMenor + 1];
        vector[indiceMenor + 1] = vector[fin];
        vector[fin] = temporal;
        return indiceMenor + 1;
    }
}
